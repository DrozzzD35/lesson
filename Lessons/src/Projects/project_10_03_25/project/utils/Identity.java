package Projects.project_10_03_25.project.utils;


import Projects.project_10_03_25.project.model.Task;

public enum Identity {
    INSTANCE;
    private int identifier = 0;

    //  todo написать логику создание и обновление id для новых тасков
    public int generateId() {
        return identifier++;
    }
}