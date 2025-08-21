package work_21_08_2025.model;

public abstract class LibraryItem {
    protected String id;
    protected String title;
    protected boolean isAvailable;

    public LibraryItem(String id, String title, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.isAvailable = isAvailable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public abstract String getItemType();

    @Override
    public String toString() {
        return "LibraryItem{" +
                "идентификатор='" + id + '\'' +
                ", название='" + title + '\'' +
                ", наличие=" + isAvailable +
                '}';
    }
}
