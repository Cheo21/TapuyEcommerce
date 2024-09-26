package DAO;


import Entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Page<Product> getProductsByTopic(String topic, Pageable pageable);
    Page<Product> findAllByOrderByCreationDateAsc(Pageable pageable);

}
