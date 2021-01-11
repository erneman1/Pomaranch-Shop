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

    @PostMapping("/add")
    public void saveProduct(@RequestBody Product product) {
        productService.save(product);
    }

    @DeleteMapping("/delete")
    public void deleteProduct(@RequestBody Product product) {
        productService.delete(product);
    }

    @PutMapping("/update")
    public void updateProduct(@RequestBody Product product) {
        System.out.println(product);
    }
}
