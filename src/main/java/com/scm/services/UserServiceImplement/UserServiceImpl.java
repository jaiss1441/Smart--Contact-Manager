package com.scm.services.UserServiceImplement;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scm.entities.User;
import com.scm.helpers.ResourceNotFoundException;
import com.scm.repositories.UserRepository;
import com.scm.services.UserService;

import jakarta.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public User saveUser(User user) {

        // user id auto generate
        String UserId = UUID.randomUUID().toString();
        user.setUserId(UserId);
        // password encode 
        // user.setPassword(UserId);

        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<User> updateUser(User user) {

        User user2 = userRepository.findById(user.getUserId())
                .orElseThrow(() -> new ResourceNotFoundException("User Not Found..."));

        user2.setName(user.getName());
        user2.setEmail(user.getEmail());
        user2.setPassword(user.getPassword());
        user2.setAbout(user.getAbout());
        user2.setPhoneNumber(user.getPhoneNumber());
        user2.setProfilePic(user.getProfilePic());
        user2.setProvider(user.getProvider());
        user2.setEmailVerified(user.isEmailVerified());
        user2.setEnabled(user.isEnabled());
        user2.setPhoneVerified(user.isPhoneVerified());
        user2.setProviderUserId(user.getProviderUserId());
        // Save the user in db
        User save = userRepository.save(user2);
        return Optional.ofNullable(save);
    }

    @Override
    public void deleteUser(String id) {

        User user2 = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User Not Found..."));
        userRepository.delete(user2);

    }

    @Override
    public boolean isUserExist(String userId) {
       
        User user2 = userRepository.findById(userId).orElse(null);
        return user2 != null ? true : false;

    }

    @Override
    public boolean isUserExistByEmail(String email) {
        User user = userRepository.findByEmail(email).orElse(null);
        return user != null ? true : false;
    }

    @Override
    public List<User> getAllUser() {
       return userRepository.findAll();
    }

}
