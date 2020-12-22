package edu.hust.QuanLy.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "nhankhau")
public class NhanKhau {
    @Id
    private int id;

    @Column(name = "hoten")
    private String hoTen;

    @Column(name = "namsinh")
    private Date namSinh;

    @Column(name = "gioitinh")
    private String gioiTinh;

    @Column(name = "noisinh")
    private String noiSinh;

    @Column(name = "nguyenquan")
    private String nguyenQuan;

    @Column(name = "dantoc")
    private String danToc;

    @Column(name = "tongiao")
    private String tonGiao;

    @Column(name = "quoctich")
    private String quocTich;

    @Column(name = "thuongtru")
    private String thuongTru;

    @Column(name = "ngaytao", insertable = false, updatable = false, columnDefinition = "datetime default current_timestamp on update current_timestamp")
    private Date ngayTao;

    
    
}
