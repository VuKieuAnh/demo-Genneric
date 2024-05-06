package service.student;

import model.Student;

import java.util.List;

public class StudentService implements IStudentService {
    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public boolean create(Student student) {
        return false;
    }

    @Override
    public boolean updateById(int id, Student student) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
