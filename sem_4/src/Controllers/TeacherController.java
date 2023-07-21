package Controllers;

import Domen.Emploee;
import Domen.Person;
import Domen.Teacher;
import Services.EmploeeService;
//import Services.StudentService;
import Services.TeacherService;

public class TeacherController implements iPersonController<Teacher> {
    private final TeacherService teacherService = new TeacherService();

    @Override
    public void create(String firstName, int age) {
        teacherService.create(firstName, age);
    }

    public static <T extends Emploee> void paySalary(Teacher t1) {
        System.out.println(t1.getName() + " выплачена премия 30000р. ");
    }
}
