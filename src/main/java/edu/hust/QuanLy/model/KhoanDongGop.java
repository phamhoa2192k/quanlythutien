package edu.hust.QuanLy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "khoandonggop")
public class KhoanDongGop {
    @Id
    @SequenceGenerator(name = "hibernate_generator" , initialValue = 10, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "hibernate_generator")
    private int id;

    @Column(name = "tenkhoanthu")
    private String tenKhoanThu;

    @Column(name = "idloaidonggop")
    private int idLoaiDongGop;

    @Column(name="sotientoithieu")
    private int soTienToiThieu;

    @Column(name = "thoigiandong")
    private String thoiGianDong;

    public KhoanDongGop(String tenKhoanThu, int idLoaiDongGop, int soTienToiThieu, String thoiGianDong) {
        this.tenKhoanThu = tenKhoanThu;
        this.idLoaiDongGop = idLoaiDongGop;
        this.soTienToiThieu = soTienToiThieu;
        this.thoiGianDong = thoiGianDong;
    }

    public KhoanDongGop() {
    }
    
    
    
}
