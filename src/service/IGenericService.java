package service;

import java.util.List;

public interface IGenericService<T> {
//    danh sach
    List<T> findAll();
//    tao moi
    boolean create(T t);
//    sua
    boolean updateById(int id, T t);
//    xoa
    boolean deleteById(int id);
}
