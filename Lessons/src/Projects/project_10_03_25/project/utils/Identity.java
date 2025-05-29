package Projects.project_10_03_25.project.utils;


import Projects.project_10_03_25.project.model.Task;

public enum Identity {
    INSTANCE;
    private int identifier = 0;

    public int generateId() {
        return identifier++;
    }
}