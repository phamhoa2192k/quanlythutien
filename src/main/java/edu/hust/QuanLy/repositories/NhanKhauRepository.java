package edu.hust.QuanLy.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.hust.QuanLy.model.NhanKhau;

@Repository
public interface NhanKhauRepository extends JpaRepository<NhanKhau,Integer> {
    List<NhanKhau> findByHoTen(String hoten);
}
