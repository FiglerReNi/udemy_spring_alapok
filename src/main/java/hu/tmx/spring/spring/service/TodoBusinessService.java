package hu.tmx.spring.spring.service;

import hu.tmx.spring.spring.repository.TodoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TodoBusinessService {

    TodoDataService todoDataService;

    @Autowired
    public void setTodoDataService(TodoDataService todoDataService) {
        this.todoDataService = todoDataService;
    }
}
