package com.phonepe.interviews.todo.repository;

import com.phonepe.interviews.todo.entity.Task;

import java.util.List;
import java.util.Map;

public interface TaskRepository {
    void addTask(Task task);

    Task getTask(String taskId); //a task

    void modifyTask(Task task);

    void removeTask(String taskId);

    List<Task> listTasks(); // a list of tasks which match the given filter ordered based on a defined sort criteria

    List<Task> getRemovedTasks();

    Map<String, List<String>> getTagsToTaskIdMapping();
}
