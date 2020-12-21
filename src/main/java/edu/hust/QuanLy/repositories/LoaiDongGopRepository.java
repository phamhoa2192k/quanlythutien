package edu.hust.QuanLy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.hust.QuanLy.model.LoaiDongGop;

@Repository
public interface LoaiDongGopRepository extends JpaRepository<LoaiDongGop,Integer>{
    
}
