package edu.hust.QuanLy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "khoandonggop")
public class KhoanDongGop {
    @Id
    private int id;

    @Column(name = "tenkhoanthu")
    private String tenKhoanThu;

    @Column(name = "idloaidonggop")
    private int idLoaiDongGop;

    @Column(name="sotientoithieu")
    private int soTienToiThieu;

    @Column(name = "thoigiandong")
    private String thoiGianDong;
    
    
}
