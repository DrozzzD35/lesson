package Projects.project_10_03_25.project.model;

import java.util.HashMap;
import java.util.Map;

public class Epic extends Task {
    private Map<Integer, SubTask> subTasks;

    public Epic(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = Status.NEW;
        this.type = Type.EPIC;
        this.subTasks = new HashMap<>();
    }
}
