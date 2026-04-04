import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class todo {
    public static void todoFunction() {

        Scanner todoList = new Scanner(System.in); 

        System.out.println("How many Todo tasks you want?");
        int count = todoList.nextInt();
        // limits to how many todo list
        if (count < 1 || count > 10) {
            System.err.println("Invalid choice...");
            todoList.close();
            return;
        }
        
        for (int i = 0; i < count; i++) {
            String todoWishes = todoList.nextLine();
        }
        System.out.println("Congrats you made your tasks.");
        todoList.close();
    }

public static void main(String[] args) {    
        System.out.println("+++++++++++++++++++++");
        System.out.println("Welcome to Todo List!");
        todoFunction();
    }
}
