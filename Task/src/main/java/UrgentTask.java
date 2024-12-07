import java.time.LocalDate;

public class UrgentTask extends Task {
    private LocalDate deadline;

    public UrgentTask(String description, int priority, LocalDate deadline) {
        super(description, priority);
        this.deadline = deadline;
    }

    @Override
    public void displayTask() {
        System.out.println("urgent Task - description: " + description + ", priority: " + priority + ", deadline: " + deadline);
    }

}
