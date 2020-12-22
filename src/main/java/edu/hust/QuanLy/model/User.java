package edu.hust.QuanLy.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    private int id;

    @Column(name = "username")
    private String userName;
    
    @Column(name = "password")
    private String password;

}
