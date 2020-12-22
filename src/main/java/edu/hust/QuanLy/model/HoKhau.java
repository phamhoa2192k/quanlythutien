package edu.hust.QuanLy.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "hokhau")
public class HoKhau  {
    @Id
    private int id;

    @Column(name = "idchuho")
    private int idChuHo;

    @Column(name = "diachi")
    private String diaChi;

    @Column(name = "ngaydangky", insertable = false, updatable = false, columnDefinition = "datetime default current_timestamp on update current_timestamp")
    private Date ngayDangKy;
}

