package work_21_08_2025.model;

public class Magazine extends LibraryItem {
    private int issueNumber;
    private String month;

    public Magazine(String id, String title, boolean isAvailable, int issueNumber, String month) {
        super(id, title, isAvailable);
        this.issueNumber = issueNumber;
        this.month = month;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public String getMonth() {
        return month;
    }

    @Override
    public String getItemType() {
        return "Журнал";
    }

    @Override
    public String toString() {
        return "Журнал{" +
                "месяц='" + month + '\'' +
                ", идентификатор='" + id + '\'' +
                ", название='" + title + '\'' +
                ", наличие=" + isAvailable +
                ", номер выпуска=" + issueNumber +
                '}';
    }
}
