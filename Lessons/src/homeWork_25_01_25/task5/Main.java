package homeWork_25_01_25.task5;

public class Main {
    public static void main(String[] args) {
        Coutse coutse = new Coutse();
        Coutse trainingСoutse = new Coutse("Обучающий курс", 6, 150);
        Coutse readingCoutse = new Coutse("Курс чтения",3,75);
        Coutse writingCoutse = new Coutse("Курс правописания",5,90);
        Coutse laboratoryCoutse = new Coutse("Лабораторный курс",10,200);

        Student petr = new Student("Петр");
        Student vasya = new Student("Вася");
        Student elena = new Student("Елена");
        Student boris = new Student("Борис");
        Student genadii = new Student("Генадий");
        Student egor = new Student("Егор");

        coutse.coutses.add(trainingСoutse);
        coutse.coutses.add(readingCoutse);
        coutse.coutses.add(writingCoutse);
        coutse.coutses.add(laboratoryCoutse);


        trainingСoutse.addStudent(petr);
        trainingСoutse.addStudent(vasya);
        readingCoutse.addStudent(elena);
        writingCoutse.addStudent(boris);
        laboratoryCoutse.addStudent(genadii);
        laboratoryCoutse.addStudent(egor);

        coutse.printAllStudents();



    }
}
