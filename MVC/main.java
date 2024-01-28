public class main {
    public static void main(String[] args) {
        TaskModel model = new TaskModel();
        TaskView view = new TaskView();
        TaskController controller = new TaskController(model, view);

        // Register the view as an observer of the model
        model.addObserver(view);

        controller.addTask();
        controller.addTask();
    }
}
