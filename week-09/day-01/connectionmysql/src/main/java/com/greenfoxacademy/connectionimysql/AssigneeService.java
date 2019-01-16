package com.greenfoxacademy.connectionimysql;

import com.greenfoxacademy.connectionimysql.model.Assignee;
import com.greenfoxacademy.connectionimysql.model.Todo;
import com.greenfoxacademy.connectionimysql.repository.AssigneeRepository;
import com.greenfoxacademy.connectionimysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssigneeService {

    AssigneeRepository assigneeRepository;
    TodoRepository todoRepository;

    @Autowired
    public AssigneeService(AssigneeRepository assigneeRepository, TodoRepository todoRepository) {
        this.assigneeRepository = assigneeRepository;
        this.todoRepository = todoRepository;
    }

    public List<Assignee> getAll() {
        return (List<Assignee>) assigneeRepository.findAll();
    }

    public Assignee get(Long id) {
        Optional<Assignee> assignee = assigneeRepository.findById(id);
        if (assignee.isPresent()) {
            return assignee.get();
        }
        throw new IndexOutOfBoundsException();
    }

    public void seeReview (Long id, Todo todo){
        Assignee assignee = this.get(id);
        assignee.getTodos();
    }

    public List<Assignee> findAll(String n){
        return (List<Assignee>) assigneeRepository.findByName(n);
    }


}
