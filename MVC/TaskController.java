import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class TaskController implements Observer {
    private TaskModel model;
    private TaskView view;
    private Scanner scanner;

    public TaskController(TaskModel model, TaskView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);

        // Register the controller as an observer of the model
        model.addObserver(this);
    }

    public void addTask() {
        System.out.print("Enter a new task: ");
        String task = scanner.nextLine();
        model.addTask(task);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof TaskModel) {
            System.out.println("Notification to Controller: " + arg);
        }
    }
}
