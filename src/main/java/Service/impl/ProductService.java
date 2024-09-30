package Service.impl;

import Entity.Product;
import Repository.ProductManagement;
import Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService<T extends Product> implements ProductManagement<T> {

    @Autowired
    private ProductRepository<T> productRepository;

    @Override
    public void addProduct(T product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(T product) {
        productRepository.delete(product);
    }

    @Override
    public void updateProduct(T product) {
        productRepository.save(product);
    }

    @Override
    public T getProduct(int id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @Override
    public Page<T> getProducts(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Page<T> getProductsByTopic(String topic, Pageable pageable) {
       return productRepository.getProductsByTopic(topic, pageable);

    }



    @Override
    public Page<T> findAllByOrderByCreationDateAsc(Pageable pageable) {
        return productRepository.findAllByOrderByCreationDateAsc(pageable);
    }


}
