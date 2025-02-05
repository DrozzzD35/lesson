package work_19_12_2024;

public class StudentHomeWork {
    String name;
    int[] grades;

    void averageGrade() {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        double averageGrade = (double) sum / grades.length;
        System.out.println("Средняя оценка ученика: " + averageGrade);
    }


    StudentHomeWork(String newName) {
       this.name = newName;
    }
    StudentHomeWork(String newName, int[] newGrades) {
       this.name = newName;
       this.grades = newGrades;
    }


}
