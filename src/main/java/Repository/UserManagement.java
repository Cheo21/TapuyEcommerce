package Repository;

import Entity.User;

public interface UserManagement<T> {

    void createUser(T user);
    User readUser(Long id);
    void updateUser(T user);
    void deleteUser(Long id);

}
