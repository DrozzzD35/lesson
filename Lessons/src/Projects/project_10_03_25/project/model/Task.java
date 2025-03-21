package Projects.project_10_03_25.project.model;

import java.util.UUID;

public class Task {
    protected Integer id;
    protected String name;
    protected String description;
    protected Status status;
    protected Type type;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    public Type getType() {
        return type;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
