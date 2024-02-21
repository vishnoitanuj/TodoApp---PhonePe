package com.phonepe.interviews.todo;

import com.phonepe.interviews.todo.repository.InMemoryTaskRepository;
import com.phonepe.interviews.todo.repository.TaskRepository;
import com.phonepe.interviews.todo.service.TodoService;
import com.phonepe.interviews.todo.service.impl.TodoServiceImpl;

import java.util.Scanner;

public class TodoApp {

    public static void main(String[] args) {
        TaskRepository taskRepository = new InMemoryTaskRepository();
        TodoService todoService = new TodoServiceImpl(taskRepository);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add some task");
            System.out.println("2. View task ");
            System.out.println("3. Remove task");
            System.out.println("4. Analytics");
            System.out.println("5. Statistics");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter taskId, task description, expiration date, tags(if any)");
            } else if (choice == 6) {
                System.exit(0);
            } else {
                System.out.println("Wrong input, retry");
            }
        }
    }
}
