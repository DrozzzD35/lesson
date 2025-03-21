package Projects.project_10_03_25.project.model;

public class SubTask extends Task {
    public SubTask(String name, String description) {
        super(name, description);
        this.type = Type.SUBTASK;

    }
}
