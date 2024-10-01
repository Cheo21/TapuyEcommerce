package Repository;

import Entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProductManagement<T extends Product> {

    void addProduct(T product);
    void deleteProduct(T product);
    void updateProduct(T product);
    Optional<T> getProduct(int id);
    Page<T> getProducts(Pageable pageable);
    Page<T> getProductsByTopic(String topic, Pageable pageable);
    Page<T> findAllByOrderByCreationDateAsc(Pageable pageable);

}
