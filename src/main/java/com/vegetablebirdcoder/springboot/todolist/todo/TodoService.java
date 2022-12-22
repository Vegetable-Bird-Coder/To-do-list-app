package com.vegetablebirdcoder.springboot.todolist.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo(1, "Simon", "Learn AWS",
                LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "Simon", "Learn GCP",
                LocalDate.now().plusYears(2), false));
        todos.add(new Todo(3, "Simon", "Learn Azure",
                LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }
}
