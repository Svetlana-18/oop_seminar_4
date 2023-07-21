package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Emploee;
import Domen.Student;
import Domen.Teacher;

public class TeacherService implements iPersonService <Teacher> {
        private int count;
    private List<Emploee> teacher;
    public TeacherService() {
        this.teacher = new ArrayList<Teacher>();
    }
    // @Override
    // public List<Teacher> getAll() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    // }
    // @Override
    // public void create(String firstName, int age) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'create'");
    // }    
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