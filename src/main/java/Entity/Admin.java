package Entity;

import Service.impl.ProductService;
import Service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Admin extends User {


    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;



}