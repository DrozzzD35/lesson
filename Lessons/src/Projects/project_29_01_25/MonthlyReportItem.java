package Projects.project_29_01_25;

public class MonthlyReportItem {
    private String itemName;
    private boolean isExpense;
    private int quantity;
    private double unitPrice;


    MonthlyReportItem(String itemName, boolean isExpense, int quantity, double unitPrice) {
        setExpense(isExpense);
        setItemName(itemName);
        setQuantity(quantity);
        setUnitPrice(unitPrice);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public boolean getExpense() {
        return isExpense;
    }

    public void setExpense(boolean expense) {
        isExpense = expense;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

}
