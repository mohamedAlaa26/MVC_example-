import java.util.Observable;
import java.util.Observer;
import java.util.List;

public class TaskView implements Observer {
    public void printTasks(List<String> tasks) {
        System.out.println("Tasks:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
        System.out.println();
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof TaskModel) {
            System.out.println("Notification to View: " + arg);
            printTasks(((TaskModel) o).getTasks());
        }
    }
}
