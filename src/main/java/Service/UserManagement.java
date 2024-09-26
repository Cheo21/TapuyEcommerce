package Service;

import Entity.User;

public interface UserManagement {

    void createUser(User user);
    User readUser(Long id);
    void updateUser(User user);
    void deleteUser(Long id);

}
