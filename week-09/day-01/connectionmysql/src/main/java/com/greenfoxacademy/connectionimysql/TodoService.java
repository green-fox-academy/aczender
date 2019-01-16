package com.greenfoxacademy.connectionimysql;

import com.greenfoxacademy.connectionimysql.model.Assignee;
import com.greenfoxacademy.connectionimysql.model.Todo;
import com.greenfoxacademy.connectionimysql.repository.AssigneeRepository;
import com.greenfoxacademy.connectionimysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

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

    public Assignee findByName(String n) {
        return assigneeRepository.findByName(n);
    }

    public void saveUpdatedTodo(Todo todo, String n) {
        Assignee assignee = assigneeRepository.findByName(n);
        if (assignee != null) {
            todo.setAssignee(assignee);
            assignee.getTodos().add(todo);
            assigneeRepository.save(assignee);
            todoRepository.save(todo);

        } else {
            todo.setAssignee(null);
            todoRepository.save(todo);
        }
    }
}

