package edu.hust.QuanLy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "thutien")
@Entity
@Data
public class ThuTien {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "idkhoandonggop")
    private int idKhoanDongGop;

    @Column(name = "tennguoinop")
    private String tenNguoiNop;

    @Column(name = "idhokhau")
    private int idHoKhau;

    @Column(name = "sotien")
    private int soTien;

    @Column(name = "ghichu")
    private String ghiChu;

    public ThuTien(int idKhoanDongGop, String tenNguoiNop, int idHoKhau, int soTien, String ghiChu) {
        this.idKhoanDongGop = idKhoanDongGop;
        this.tenNguoiNop = tenNguoiNop;
        this.idHoKhau = idHoKhau;
        this.soTien = soTien;
        this.ghiChu = ghiChu;
    }
    
    
}
