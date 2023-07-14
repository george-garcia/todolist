import java.util.ArrayList;
import java.util.Scanner;

public class ListItem {
    //this will hold the logic of our individual list items

    public String item;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    ListItem(){}
    ListItem(String item){
        setItem(item);
    }

    @Override
    public String toString() {
        return item;
    }

    public static void main(String[] args){
        ToDoList toDoList = new ToDoList();
        toDoList.setList(new ArrayList<ListItem>());
        Scanner sc = new Scanner(System.in);
        String userInput;
        int commandInput = 0;


//        System.out.println("Please enter some data for your list item");
//        userInput = sc.next();
//        toDoList.list.add(new ListItem(userInput));
//
//        System.out.println("Please enter some data for your list item");
//        userInput = sc.next();
//        toDoList.list.add(new ListItem(userInput));

        do {
            System.out.println("Please select a command of your choosing: (9 to exit)\n" +
                    "1. Add item to list\n" +
                    "2. Remove an entry\n" +
                    "3. Print list\n" +
                    "4. delete list\n" +
                    "5. quit\n");
            commandInput = sc.nextInt();

            if(commandInput == 1){
                //prompt the user for data
                System.out.println("Please type your list item to add: ");

                //get the data from the user and store it in a variable
                userInput = sc.next();

                //add that variable to our list
                toDoList.list.add(new ListItem(userInput));
                System.out.println(toDoList);
            } else if(commandInput == 2){
                System.out.println("Removed an entry");



            } else if(commandInput == 3){
                //print the list with numbers in front of each list item that correlates to their element
                for(int i = 0; i < toDoList.list.size();i++){
                    System.out.println(i + ". " + toDoList.list.get(i));
                }
            }
        } while (commandInput != 5);

    }
}
