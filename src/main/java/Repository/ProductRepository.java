package Repository;


import Entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ProductRepository<T extends Product> extends JpaRepository<T, Integer> {

    Page<T> getProductsByTopic(String topic, Pageable pageable);
    Page<T> findAllByOrderByCreationDateAsc(Pageable pageable);

}
