package homeWork_25_01_25.task1;

public class Main {
    public static void main(String[] args) {
        Student bob = new Student("Bob", 22, 9.4);
        Student rick = new Student("Rick", 16, 6.8);
        Student alex = new Student("Alex", 18, 8.3);
        Student henry = new Student("Henry", 24, 7.6);


        bob.printStudentInfo();
        rick.printStudentInfo();
        alex.printStudentInfo();
        henry.printStudentInfo();

        int totalCratedStudents = Student.getTotalCratedStudents();
        System.out.println("Общее количество студентов: " + totalCratedStudents);

    }
}
