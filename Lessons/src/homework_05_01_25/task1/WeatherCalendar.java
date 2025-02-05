package homework_05_01_25.task1;

class WeatherCalendar {
    String month;
    int numberOfDays;
    int rainyDays;
    int year = 2020;
    boolean isRainyMonth;

    // Увеличить переменную rainyDays на единицу
    public void addRainyDay() {
        rainyDays++;
    }

    WeatherCalendar(String newMonthName, int newNumberOfDays) {
        month = newMonthName;
        numberOfDays = newNumberOfDays;
    }
}