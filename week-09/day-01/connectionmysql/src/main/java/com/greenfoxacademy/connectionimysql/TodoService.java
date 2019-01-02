package com.greenfoxacademy.connectionimysql;

import com.greenfoxacademy.connectionimysql.model.Todo;
import com.greenfoxacademy.connectionimysql.repository.AssigneeRepository;
import com.greenfoxacademy.connectionimysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    AssigneeRepository assigneeRepository;
    TodoRepository todoRepository;

    @Autowired
    public TodoService(AssigneeRepository assigneeRepository, TodoRepository todoRepository) {
        this.assigneeRepository = assigneeRepository;
        this.todoRepository = todoRepository;
    }


    public List<Todo> getAll() {
        return (List<Todo>) todoRepository.findAll();
    }

}

