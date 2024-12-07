import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Catagory> catagories;

    public TaskManager() {
        catagories = new ArrayList<>();
    }

    public void addCatagory(Catagory category) {
        catagories.add(category);
    }

    public void displayAllCategories() {
        for (Catagory category : catagories) {
            category.displayAllTasks();
        }
    }
}
