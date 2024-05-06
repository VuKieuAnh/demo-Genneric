package service.teacher;

import model.Teacher;

import java.util.List;

public class TeacherService implements ITeacherService {
    @Override
    public List<Teacher> findAll() {
        return null;
    }

    @Override
    public boolean create(Teacher teacher) {
        return false;
    }

    @Override
    public boolean updateById(int id, Teacher teacher) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
