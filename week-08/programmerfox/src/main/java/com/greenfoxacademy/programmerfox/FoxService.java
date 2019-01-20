package com.greenfoxacademy.programmerfox;

import com.greenfoxacademy.programmerfox.exception.FoxAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FoxService {
    List<Fox> foxes;


    @Autowired
    public FoxService() {
        this.foxes = new ArrayList<>();
    }

    public List<Fox> getFoxes(){
        return foxes;
    }


    public void addFox(String name) {
        foxes.add(new Fox(name));

    }

    public Optional<Fox> findFox(String name) {
        for (Fox fox : foxes) {
            if (fox.getName().equals(name)) {
                return Optional.of(fox);
            }
        }
        return Optional.empty();
    }
}
