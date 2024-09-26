package Service;

import Entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductManagement {

    void addProduct(Product product);
    void deleteProduct(Product product);
    void updateProduct(Product product);
    Product getProduct(int id);
    Page<Product> getProducts(Pageable pageable);
    Page<Product> getProductsByTopic(String topic, Pageable pageable);
    Page<Product> findAllByOrderByCreationDateAsc(Pageable pageable);

}
