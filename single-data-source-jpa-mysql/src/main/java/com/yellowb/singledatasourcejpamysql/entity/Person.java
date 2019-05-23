package com.yellowb.singledatasourcejpamysql.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.io.*;

@Entity
@Table(name = "userinfo")
@Data
@NamedQueries({
    @NamedQuery(name="Person.findUserByUsernameStartsBy",query="SELECT p FROM Person p WHERE p.userName LIKE CONCAT(:prefix,'%')")
})
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private int id;

    @Column(name = "username")
    private String userName;

}
