package services;

import java.util.Optional;

import exceptions.UserExists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import convertor.UserConvertor;
import entities.User;
import repositories.UserRepository;
import request.UserRequest;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String addUser(UserRequest userRequest) {
        Optional<User> users = userRepository.findByEmailId(userRequest.getEmailId());

        if (users.isPresent()) {
            throw new UserExists();
        }

        User user = UserConvertor.userDtoToUser(userRequest,  passwordEncoder.encode("1234"));

        userRepository.save(user);
        return "User Saved Successfully";
    }

}