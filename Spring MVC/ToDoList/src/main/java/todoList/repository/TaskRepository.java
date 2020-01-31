package todoList.repository;

import org.springframework.stereotype.Repository;
import todoList.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository

public interface TaskRepository extends JpaRepository<Task,Integer> {
}
