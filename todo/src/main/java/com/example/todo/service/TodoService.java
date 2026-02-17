package com.example.todo.service;

import com.example.todo.model.Todo;
import com.example.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    // Create Todo
    public Todo createTodo(Todo todo) {
        return repository.save(todo);
    }

    // Get all Todos (optional filter by completed)
    public List<Todo> getAllTodos(Boolean completed) {
        if (completed != null) {
            return repository.findByCompleted(completed);
        }
        return repository.findAll();
    }

    // Update Todo
    public Todo updateTodo(Long id, Todo updatedTodo) {
        Todo todo = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found"));

        todo.setTitle(updatedTodo.getTitle());
        todo.setDescription(updatedTodo.getDescription());
        todo.setCompleted(updatedTodo.isCompleted());

        return repository.save(todo);
    }

    // Delete Todo
    public void deleteTodo(Long id) {
        repository.deleteById(id);
    }
}
