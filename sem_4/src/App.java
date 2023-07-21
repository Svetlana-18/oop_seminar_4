import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Controllers.EmploeeController;
import Controllers.TeacherController;
import Domen.AverageAge;
import Domen.Emploee;
import Domen.Person;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.Teacher;

public class App {
    private static Student[] group;

    public static void main(String[] args) throws Exception {

        // Создаю список студентов

        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 444);
        Student s5 = new Student("Даша", 23, 171);
        Student s6 = new Student("Лена", 23, 104);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        PersonComparator<Student> comS = new PersonComparator<Student>();
        comS.compare(s1, s2);

        // Делаю подсчет среднего возраста студентов и вывод результата на консоль

        // AverageAge<Student> studentsAverageAge = new AverageAge<>();
        // double studentsAge = studentsAverageAge.calculator(listStud);
        // System.out.println("Средний возраст студентов: " + studentsAge);

        // Вывод списка студентов:
        for (Student stud : listStud) {
            System.out.println(stud);
        }

        // Создаю список учителей

        Teacher t1 = new Teacher("Иван", 62, "Docent");
        Teacher t2 = new Teacher("Роман", 55, "Professor");
        Teacher t3 = new Teacher("Степан", 42, "Docent");
        Teacher t4 = new Teacher("Виктор", 76, "Docent");
        Teacher t5 = new Teacher("Станислав", 65, "Professor");
        Teacher t6 = new Teacher("Алексей", 45, "Docent");

        List<Teacher> listTeachers = new ArrayList<Teacher>();
        listTeachers.add(t1);
        listTeachers.add(t2);
        listTeachers.add(t3);
        listTeachers.add(t4);
        listTeachers.add(t5);
        listTeachers.add(t6);

        // Делаю подсчет среднего возраста учителей и вывод результата на консоль

        // AverageAge<Teacher> teachAverageAge = new AverageAge<>();
        // double teacherAge = teachAverageAge.calculator(listTeachers);
        // System.out.println("Средний возраст учителей: " + teacherAge);

        // Вывод списка студентов:
        for (Teacher teacher : listTeachers) {
            System.out.println(teacher);
        }

        TeacherController.paySalary(t1);

        PersonComparator<Teacher> comT = new PersonComparator<Teacher>();
        comT.compare(t1, t2);

        PersonComparator<Person> comP = new PersonComparator<Person>();
        comP.compare(s1, t2);

        // Создаю список работников

        Emploee e1 = new Emploee("Иван", 25, "worker");
        Emploee e2 = new Emploee("Игорь", 54, "worker");
        Emploee e3 = new Emploee("Петр", 34, "security ");
        Emploee e4 = new Emploee("Василий", 45, "worker");
        Emploee e5 = new Emploee("Николай", 42, "security ");
        Emploee e6 = new Emploee("Сергей", 36, "cleaner");

        List<Emploee> listEmploees = new ArrayList<Emploee>();
        listEmploees.add(e1);
        listEmploees.add(e2);
        listEmploees.add(e3);
        listEmploees.add(e4);
        listEmploees.add(e5);
        listEmploees.add(e6);

        // Делаю подсчет среднего возраста учителей и вывод результата на консоль

        // AverageAge<Teacher> emploeeAverageAge = new AverageAge<>();
        // double emploeeAge = emploeeAverageAge.calculator(listEmploees);
        // System.out.println("Средний возраст учителей: " + emploeeAge);

        // Emploee e1 = new Emploee("Федорович", 60, "разнорабочим");
        EmploeeController.paySalary(e1);

    }
}
