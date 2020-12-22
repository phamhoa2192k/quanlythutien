package edu.hust.QuanLy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "loaidonggop")
public class LoaiDongGop {
    @Id
    private int id;

    @Column(name = "tenloai")
    private String tenLoai;

}
