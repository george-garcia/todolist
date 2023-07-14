import java.util.ArrayList;

public class ToDoList {
    //this will store the array of our list items
    public ArrayList<ListItem> list;

    public void setList(ArrayList<ListItem> list) {
        this.list = list;
    }

    public ArrayList<ListItem> getList() {
        return list;
    }

    ToDoList(){

    }

    @Override
    public String toString() {
        return ""+list;
    }
}
