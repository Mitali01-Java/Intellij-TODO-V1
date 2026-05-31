package org.example.userservice.UserService;

import lombok.AllArgsConstructor;
import org.example.userservice.ExceptionHandling.UserAlreadyExist;
import org.example.userservice.UserEntity.User;
import org.example.userservice.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {


    private final UserRepository userRepository;

    // create user
    public User CreateUser(User user) {
        if(userRepository.existsByUserId(user.getUserid())){
            throw new RuntimeException("User already exist with id : "+ user.getUserid());
        }
        return userRepository.save(user);
    }
    //list of user
    public List<User> AllUsers() {
        return userRepository.findAll();
    }

    public User UpdateUser(User user) {
        if(! userRepository.existsByUserId(user.getUserid())){
            throw new RuntimeException("User not  exist with id : "+ user.getUserid());
        }
        String username=user.getUsername();
        String password=user.getPassword();
        userRepository.
    }




    // get user by username
//    public User getUserByUsername(String username) {
//        return userRepository.findByUsername(username);
//    }
//
//    public User getUserByUserId(Integer userid) {
//        return userRepository.findByUserid(userid);
//    }





}
