package com.example.todoapi.service.task;

public class TaskEntityNotFoundException extends RuntimeException {
    private long taskId;

    public TaskEntityNotFoundException(Long taskId) {
        super("TaskEntity (id = " + taskId + ") is not found.");
        this.taskId = taskId;
    }
}
