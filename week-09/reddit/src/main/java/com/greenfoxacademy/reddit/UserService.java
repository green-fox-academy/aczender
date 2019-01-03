package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.Model.User;
import com.greenfoxacademy.reddit.repository.PostRepository;
import com.greenfoxacademy.reddit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    UserRepository userRepository;
    PostRepository repository;

    @Autowired
    public UserService(UserRepository userRepository, PostRepository repository) {
        this.userRepository = userRepository;
        this.repository = repository;
    }

    public List<User> getAll() {
        return (List<User>) userRepository.findAll();
    }

    public User findByName(String n) {
        return userRepository.findByName(n);
    }

    public User get(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        }
        throw new IndexOutOfBoundsException();
    }
}
