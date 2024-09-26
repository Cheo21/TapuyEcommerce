package Service.impl;

import DAO.ProductRepository;
import Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import Service.ProductManagement;

@Service
public class ProductService implements ProductManagement {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product getProduct(int id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @Override
    public Page<Product> getProducts(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Page<Product> getProductsByTopic(String topic, Pageable pageable) {
       return productRepository.getProductsByTopic(topic, pageable);

    }



    @Override
    public Page<Product> findAllByOrderByCreationDateAsc(Pageable pageable) {
        return productRepository.findAllByOrderByCreationDateAsc(pageable);
    }


}
