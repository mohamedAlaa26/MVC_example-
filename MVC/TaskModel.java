import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class TaskModel extends Observable {
    private List<String> tasks;

    public TaskModel() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        setChanged();
        notifyObservers("New task added: " + task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
