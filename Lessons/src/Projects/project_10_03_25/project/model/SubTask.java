package Projects.project_10_03_25.project.model;

public class SubTask extends Task {
    public SubTask(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = Status.NEW;
        this.type = Type.SUBTASK;

    }
}
