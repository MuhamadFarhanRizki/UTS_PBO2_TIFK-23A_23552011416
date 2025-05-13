
package com.example.UTS.Service;

import com.example.UTS.Model.ToDo;
import com.example.UTS.Model.User;
import com.example.UTS.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDo> getTodosByUser(User user) {
        return toDoRepository.findByUser(user);
    }

    public List<ToDo> getFilteredTodosByUser(User user, String filter) {
        switch (filter) {
            case "completed": return toDoRepository.findByUserAndCompleted(user, true);
            case "incomplete": return toDoRepository.findByUserAndCompleted(user, false);
            default: return toDoRepository.findByUser(user);
        }
    }

    public void saveTodo(ToDo todo) {
        toDoRepository.save(todo);
    }

    public void deleteTodo(Long id) {
        toDoRepository.deleteById(id);
    }

    public Optional<ToDo> getTodoById(Long id) {
        return toDoRepository.findById(id);
    }

    // Tambahan edit
    public void editTodo(Long id, String newTask, User user) {
        Optional<ToDo> optionalToDo = toDoRepository.findById(id);
        if (optionalToDo.isPresent()) {
            ToDo todo = optionalToDo.get();
            if (todo.getUser().getId().equals(user.getId())) {
                todo.setTask(newTask);
                toDoRepository.save(todo);
            }
        }
    }
}