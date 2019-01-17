package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.Model.User;
import com.greenfoxacademy.reddit.repository.PostRepository;
import com.greenfoxacademy.reddit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
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

//    public User get(Long id) {
//        Optional<User> user = userRepository.findById(id);
//        if (user.isPresent()) {
//            return user.get();
//        }
//        throw new IndexOutOfBoundsException();
//    }

    public static HttpSession getSession() {                        //DZSOFA
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder
                .currentRequestAttributes();
        HttpSession session = attr.getRequest().getSession(true);
        return session;
    }

    public User login(String name, String password) {   //DZSOFA
        return userRepository.findByNameAndPassword(name, password);
    }

    public void save(String username, String password) {    //DZSOFA
        userRepository.save(new User(username, password));
    }
}
