
package com.example.UTS.Repository;

import com.example.UTS.Model.ToDo;
import com.example.UTS.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
    List<ToDo> findByCompleted(boolean completed);
    List<ToDo> findByUser(User user);
    List<ToDo> findByUserAndCompleted(User user, boolean completed);
}