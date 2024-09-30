package Service.impl;
import Repository.UserRepository;
import Repository.UserManagement;
import Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserManagement {

    @Autowired
    private UserRepository userRepository; // Inyección del repositorio


    @Override
    public void createUser(User user) {

    }

    @Override
    public User readUser(Long id) {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(Long id) {

    }
}


