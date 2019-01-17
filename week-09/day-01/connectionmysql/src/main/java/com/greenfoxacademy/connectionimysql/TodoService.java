package com.greenfoxacademy.connectionimysql;

import com.greenfoxacademy.connectionimysql.model.Assignee;
import com.greenfoxacademy.connectionimysql.model.Todo;
import com.greenfoxacademy.connectionimysql.repository.AssigneeRepository;
import com.greenfoxacademy.connectionimysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService {


    AssigneeRepository assigneeRepository;
    TodoRepository todoRepository;

    @Autowired
    public TodoService(AssigneeRepository assigneeRepository, TodoRepository todoRepository) {
        this.assigneeRepository = assigneeRepository;
        this.todoRepository = todoRepository;
    }

    public void update(Todo todo) throws TodoNotFoundException {
        todo.setDate(findById(todo.getId()).getDate());
        todoRepository.save(todo);
    }

    public void save(Todo todo) {
        todoRepository.save(todo);
    }


    public List<Todo> getAll() {
        return todoRepository.findAll();
    }


    public Assignee findByName(String n) {
        return assigneeRepository.findByName(n);
    }
    public Todo findById(Long id) {
        Optional<Todo> todo = todoRepository.findById(id);
        if (todo.isPresent()) {
        }
        return todo.get();
    }

    public void saveUpdatedTodo(Todo todo, String n) throws TodoNotFoundException {
        Assignee assignee = assigneeRepository.findByName(n);
        if (assignee != null) {
            todo.setAssignee(assignee);
            assignee.getTodos().add(todo);
            assigneeRepository.save(assignee);

        } else {
            todo.setAssignee(null);
        }
        update(todo);
        todoRepository.save(todo);
    }
}

