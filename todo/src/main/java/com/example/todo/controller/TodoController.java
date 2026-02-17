package com.example.todo.controller;

import com.example.todo.model.Todo;
import com.example.todo.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@CrossOrigin(origins = "http://localhost:3000")
public class TodoController {

    @Autowired
    private TodoService service;

    // Create Todo
    @PostMapping
    public Todo createTodo(@Valid @RequestBody Todo todo) {
        return service.createTodo(todo);
    }

    // Get all Todos (optional filter by completed)
    @GetMapping
    public List<Todo> getTodos(@RequestParam(required = false) Boolean completed) {
        return service.getAllTodos(completed);
    }

    // Update Todo
    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable Long id,
                           @RequestBody Todo todo) {
        return service.updateTodo(id, todo);
    }

    // Delete Todo
    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        service.deleteTodo(id);
    }
}
