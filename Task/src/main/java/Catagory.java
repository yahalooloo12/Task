import java.util.ArrayList;

public class Catagory {
    private String Name;
    private ArrayList<Task> tasks;

    public Catagory (String Name){
        this.Name = Name;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void displayAllTasks() {
        System.out.println("Category: " + Name);
        for (Task task : tasks) {
            task.displayTask();
        }
    }
}
