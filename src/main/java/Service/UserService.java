package Service;
import Repository.UserRepository;
import Repository.UserManagement;
import Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService<T extends User> implements UserManagement<T> {

    @Autowired
    private UserRepository<T> userRepository; // Inyección del repositorio


    @Override
    public void createUser(T user) {
        userRepository.save(user);

    }

    public Optional<T> findUserByEmailAndPassword(String email, String password) {
        return userRepository.findByEmailAndPassword(email,password);

    }

    @Override
    public User readUser(Long id) {
        return null;
    }

    @Override
    public void updateUser(T user) {

    }

    @Override
    public void deleteUser(Long id) {

    }
}


