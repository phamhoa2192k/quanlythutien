package edu.hust.QuanLy.model;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "thanhviencuaho")
public class ThanhVienCuaHo {

    @Id
    private int id;

    @Column(name = "idnhankhau")
    private int idNhanKhau;

    @Column(name = "idhokhau")
    private int idHoKhau;

    @Column(name = "quanhevoichuho")
    private String quanHeVoiChuHo;

}
