package ua.pomaranch.shop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.pomaranch.shop.enums.Category;
import ua.pomaranch.shop.exceptions.ProductNotFoundException;
import ua.pomaranch.shop.domain.Product;
import ua.pomaranch.shop.repository.ProductRepository;
import ua.pomaranch.shop.util.Const;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product findById(long id) {
        return repository.findById(id).orElseThrow(() -> new ProductNotFoundException("Product not found"));
    }

    public Product save(Product product) {
        return repository.save(product);
    }

    public void remove(Product product) {
        repository.delete(product);
    }

    public void update(Product product) {
        repository.save(product);
    }

    @PostConstruct
    private void initDB(){
        save(new Product("Свитшот", "Sweetshot", "Very good and sweet sweetshot", BigDecimal.valueOf(15.00), LocalDate.now(), Const.SHIRT_IMG, 10, Category.KIDS));
        save(new Product("Футболка", "T-Shirt", "Very good and sweet t-shirt", BigDecimal.valueOf(12.00), LocalDate.now(), Const.T_SHIRT_IMG, 5, Category.MAN));
        save(new Product("Футболка", "T-Shirt", "Very good and sweet t-shirt", BigDecimal.valueOf(17.00), LocalDate.now(), Const.T_SHIRT2_IMG, 7, Category.MAN));
        save(new Product("Рубашка", "Shirt", "Very good and beautiful t-shirt", BigDecimal.valueOf(8.00), LocalDate.now(), Const.T_SHIRT3_IMG, 8, Category.MAN));
        save(new Product("Платье", "Dress", "Very good and sweet dress", BigDecimal.valueOf(13.00), LocalDate.now(), Const.DRESS_IMG, 20, Category.KIDS));
    }

}
