package homeWork_25_01_25.task5;

import java.util.ArrayList;
import java.util.List;

public class Coutse {
    private String title;
    private int duration;
    private int cost;
    private static int totalCoursesCreated = 0;
    List<Student> students;
    List<Coutse> coutses = new ArrayList<>();


    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Coutse(String title, int duration, int cost) {
        this.title = title;
        this.duration = duration;
        this.cost = cost;
        this.students = new ArrayList<>();

        totalCoursesCreated++;

    }


    Coutse() {
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void printAllStudents() {
        for (Coutse coutse : coutses) {
            System.out.println("Название курса: " + coutse.title);
            System.out.println("Продолжительность курса: " + coutse.duration + " мес.");
            System.out.println("Цена курса: " + coutse.cost + " долларов");
            System.out.println("Участники курса:");
            for (Student student : coutse.students)
                System.out.println(student.getStudent());
            System.out.println();
        }
        System.out.println("Число созданных курсов: " +totalCoursesCreated);
    }
}
