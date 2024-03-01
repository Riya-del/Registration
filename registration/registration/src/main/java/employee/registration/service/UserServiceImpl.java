package employee.registration.service;

import employee.registration.entity.User;
import employee.registration.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

        // Save operation
    @Override
    public User insertUser(User user)
    {
        checkForDateOfBirth(user);
        return userRepository.save(user);
    }

     // Read operation
    @Override
    public List<User> fetchUserList()
    {
        return (List<User>)
                userRepository.findAll();
    }

    @Override
    public User updateUser(User user, int employeeno) {

        return userRepository.save(user);
    }

    @Override
    public void deleteUser(int employeeno)
    {
        userRepository.deleteById(employeeno);
    }

    private void checkForDateOfBirth(User user)
    {
        LocalDate startDate = user.getDateofbirth();
        LocalDate endDate = LocalDate.now();

        long years = ChronoUnit.YEARS.between(startDate, endDate);

        if(user.getDateofbirth()!= null &&  years<18 )
        {
            throw new ArithmeticException("Customer should be atleast 18 years old");
        }
    }

}
