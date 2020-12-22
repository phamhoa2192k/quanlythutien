package edu.hust.QuanLy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.hust.QuanLy.model.HoKhau;

@Repository
public interface HoKhauRepository extends JpaRepository<HoKhau, Integer>{
    HoKhau findByIdChuHo(int idChuHo);
}
