package edu.hust.QuanLy.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.hust.QuanLy.model.KhoanDongGop;

@Repository
public interface KhoanDongGopRepository extends JpaRepository<KhoanDongGop, Integer>{
    List<KhoanDongGop> findKhoanDongGopByIdLoaiDongGop(int idLoaiDongGop);
}
