package employee.registration.controller;

import employee.registration.entity.User;
import employee.registration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Annotation
@RestController
// Class
//@RequestMapping("/employee")
public class UserController {

    @Autowired private UserService userService;


    // Save operation
    @PostMapping("/employee")
    public User insertUser( @Validated @RequestBody User user)
    {
        System.out.print("students work properly");
        return userService.insertUser(user);
    }

    // Read operation
    @GetMapping("/employee")

    public List<User> fetchDepartmentList()
    {

        return userService.fetchUserList();
    }

    // Update operation
    @PutMapping("/employee/{id}")

    public User
    updateUser(@RequestBody User user,
                     @PathVariable("id") int employeeno)
    {
        return userService.updateUser(user, employeeno);
    }

    // Delete operation
    @DeleteMapping(value="/employee/{id}")
    public String deleteUser(@PathVariable("id") int employeeno)
    {
        userService.deleteUser(employeeno);
        return "Deleted Successfully";
    }

}