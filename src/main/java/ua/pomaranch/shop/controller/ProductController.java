package ua.pomaranch.shop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ua.pomaranch.shop.domain.Product;
import ua.pomaranch.shop.service.ProductService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("{id}")
    public Product getProductById(@PathVariable long id) {
        return productService.getById(id);
    }

    @PostMapping
    public void saveProduct(@ModelAttribute Product product) {
        productService.save(product);
    }

    @DeleteMapping
    public void deleteProduct(@ModelAttribute Product product) {
        productService.delete(product);
    }

    @PutMapping
    public void updateProduct(Product product){
        productService.update(product);
    }

}
