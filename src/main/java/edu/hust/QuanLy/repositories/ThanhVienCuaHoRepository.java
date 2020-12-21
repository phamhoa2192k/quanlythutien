package edu.hust.QuanLy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.hust.QuanLy.model.ThanhVienCuaHo;

@Repository
public interface ThanhVienCuaHoRepository extends JpaRepository<ThanhVienCuaHo, Integer> {
    
}
