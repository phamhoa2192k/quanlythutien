package edu.hust.QuanLy.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.hust.QuanLy.model.ThuTien;

@Repository
public interface ThuTienRepository extends JpaRepository<ThuTien, Integer> {
    List<ThuTien> findThuTienByIdHoKhau(int idHoKhau);
}
