package edu.hust.QuanLy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "thutien")
@Entity
@Data
public class ThuTien {
    @Id
    private int id;

    @Column(name = "idkhoandonggop")
    private int idKhoanDongGop;

    @Column(name = "idnguoinop")
    private int idNguoiNop;

    @Column(name = "idhokhau")
    private int idHoKhau;

    @Column(name = "sotien")
    private int soTien;

    @Column(name = "ghichu")
    private String ghiChu;
    
}
