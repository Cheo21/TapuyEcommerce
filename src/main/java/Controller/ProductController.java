package Controller;

import Entity.Client;
import Entity.Totebag;
import Entity.User;
import Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService<Totebag> productTotebagService;


    @GetMapping(value = "totebags/{id}")
    public ResponseEntity<Totebag> getTotebag(@PathVariable Integer id) {
        try {
            Optional<Totebag> totebag = productTotebagService.getProduct(id);
            return totebag.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).
                    body(null));
        } catch (Exception e) {
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping(value = "totebags")
    public ResponseEntity<Page<Totebag>> getTotebags(@RequestParam int productsPerPage, @RequestParam int pageNumber){
        try {
            Pageable pageable = PageRequest.of(pageNumber, productsPerPage);
            Page<Totebag> totebags = productTotebagService.getProducts(pageable);
            return ResponseEntity.ok(totebags);
        }
        catch (Exception e){
            return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }









}
