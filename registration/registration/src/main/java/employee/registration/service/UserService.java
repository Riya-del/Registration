package employee.registration.service;

import employee.registration.entity.User;

import java.util.List;

public interface UserService {

    // Save operation
    User insertUser(User user);

   // Read operation
    List<User> fetchUserList();



    // Update operation
    User updateUser(User user, int employeeno);

    // Delete operation
    void deleteUser(int employeeno);
}
