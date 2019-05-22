package com.yellowb.singledatasourcejpamysql.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.*;

@Entity
@Table(name = "userinfo")
@Data
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private int id;

    @Column(name = "username")
    private String userName;

}
