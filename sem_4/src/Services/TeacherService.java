package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Teacher;

public class TeacherService implements iPersonService<Teacher> {
    private int count;
    private List<Teacher> teacher;

    public TeacherService() {
        this.teacher = new ArrayList<Teacher>();
    }

    @Override
    public void create(String firstName, int age) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Teacher> getAll() {
        // TODO Auto-generated method stub
        return null;
    }
}