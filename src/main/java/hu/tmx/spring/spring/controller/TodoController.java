package hu.tmx.spring.spring.controller;

import hu.tmx.spring.spring.service.TodoBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TodoController {

    TodoBusinessService todoBusinessService;

    @Autowired
    public void setTodoBusinessService(TodoBusinessService todoBusinessService) {
        this.todoBusinessService = todoBusinessService;
    }
}
