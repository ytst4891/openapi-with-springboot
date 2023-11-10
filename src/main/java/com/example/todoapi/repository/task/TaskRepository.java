package com.example.todoapi.repository.task;

import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface TaskRepository {

    @Select("SELECT id, title FROM tasks WHERE id = #{taskId}")
    Optional<TaskRecord> select(Long taskId);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT INTO tasks (title) values (#{title})")
    void insert(TaskRecord record);

    @Select("SELECT id, title FROM tasks LIMIT #{limit} OFFSET #{offset}")
    List<TaskRecord> selectList(int limit, long offset);

    @Update("UPDATE tasks SET title = #{title} WHERE id = #{id}" )
    void update(TaskRecord record);

    @Delete("DELETE FROM tasks WHERE id = #{id}")
    void delete(Long taskId);
}
