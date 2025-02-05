package homeWork_25_01_25.task1;

public class Student {
    private String name;
    private int age;
    private double averageMark;
    private static int totalCratedStudents = 0;

    public static int getTotalCratedStudents() {
        return totalCratedStudents;
    }

    public Student(String name, int age, double averageMark) {
        this.name = name;
        this.age = age;
        this.averageMark = averageMark;

        if (checkStudent()) {
            totalCratedStudents++;
        }
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public double getAverageMark() {
        return averageMark;
    }


    public void printStudentInfo() {
        System.out.println("Имя студента: " + name);
        System.out.println("Возраст студента: " + age);
        System.out.println("Средняя оценка студента: " + averageMark);
        System.out.println();
    }

    public boolean checkStudent() {

        if (name.isEmpty()) {
            System.out.println("Имя не может быть пустым");
            return false;
        } else if (age <= 0) {
            System.out.println("Возраст не может иметь отрицательное значение");
            return false;
        } else if (averageMark <= 0) {
            System.out.println("Средняя оценка не может иметь отрицательное значение");
            return false;
        }
        return true;
    }

}
