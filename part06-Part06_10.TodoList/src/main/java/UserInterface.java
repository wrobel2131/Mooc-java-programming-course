
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class UserInterface {
    private TodoList todoList;
    private final Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
        
    }
    
    public void start() {
        
        while(true) {
            System.out.println("Command: ");
            String command = this.scanner.nextLine();
            
            if(command.equals("stop")) {
                break;
            } else if(command.equals("add")) {
                String task = this.scanner.nextLine();
                this.todoList.add(task);
            } else if(command.equals("list")) {
                this.todoList.print();
            } else if(command.equals("remove")) {
                int idOfTask = Integer.parseInt(scanner.nextLine());
                this.todoList.remove(idOfTask);
            }
        }
    }
}
