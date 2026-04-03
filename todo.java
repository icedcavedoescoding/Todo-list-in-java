import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class todo {
    public static void todoFunction() {

        Scanner todoList = new Scanner(System.in); 
        Scanner createDocs = new Scanner(System.in);

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
        String newDocs = createDocs.nextLine();
        try (FileWriter createFile = new FileWriter("todo.txt")) {
            // if statement checks if user typed create and it will write data
            if (newDocs.equals("create")) {
                createFile.write(count);
                System.out.println("Your todo list created successfully sir");
            }    
        } catch (IOException e) {
            System.err.println("Sorry couldn't write files.");
            e.printStackTrace();
        }

        todoList.close();
    }

public static void main(String[] args) {    
        System.out.println("+++++++++++++++++++++");
        System.out.println("Welcome to Todo List!");
        System.out.println("create = create a text file!");
        todoFunction();
    }
}