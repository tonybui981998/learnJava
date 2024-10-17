package com.example.CRUD.service;

import com.example.CRUD.dto.request.UserCreationRequest;
import com.example.CRUD.dto.request.UserUpdateRequest;
import com.example.CRUD.entity.User;
import com.example.CRUD.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository ;
    public User createUser(UserCreationRequest request){
    User user = new User();
    user.setUserName(request.getUserName());
    user.setPassword(request.getPassword());
    user.setFirstName(request.getFirstName());
    user.setLastName(request.getLastName());

    user.setDob(request.getDob());

   return userRepository.save(user);
    }
    public List<User> getUser(){
        return  userRepository.findAll();
    }
    public User getUser(String id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("user not found"));
    }
    public User updateUser(String userId,  UserUpdateRequest request){
    User user = getUser(userId);
    user.getLastName(request.getLastName());
    user.getPassword(request.getPassword());
    user.getDob(request.getDob());
    return  userRepository.save(user);
    }
    public void  deleteUser (String userId){
        userRepository.deleteById(userId);
    }
}
