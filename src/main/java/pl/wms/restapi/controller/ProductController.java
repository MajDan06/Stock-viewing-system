package pl.wms.restapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wms.restapi.entity.Product;
import pl.wms.restapi.service.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productsService;

    @GetMapping("/")
    public List<Product> getProducts() {
        return productsService.getProducts();
    }
}
