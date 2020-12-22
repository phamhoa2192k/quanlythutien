package edu.hust.QuanLy.model;

import java.sql.Date;

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

    @Column(name = "ngaynop", insertable = false, updatable = false, columnDefinition = "datetime default current_timestamp on update current_timestamp")
    private Date ngayNop;

    public ThuTien(int idKhoanDongGop, String tenNguoiNop, int idHoKhau, int soTien, String ghiChu) {
        this.idKhoanDongGop = idKhoanDongGop;
        this.tenNguoiNop = tenNguoiNop;
        this.idHoKhau = idHoKhau;
        this.soTien = soTien;
        this.ghiChu = ghiChu;
    }

    //testetsetadunf;owaehsdo;jnfowuarefn
    
    public ThuTien() {
        
    }
}
