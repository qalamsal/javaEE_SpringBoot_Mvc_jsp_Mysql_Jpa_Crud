package com.san.j2ee_springboot_jpa_mysql_crud_jsp_crud.Models;

//Class should be changed to map the tables.... using ORM

import javax.persistence.*;

@Entity
@Table(name = "employee")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String address;


    public Employee(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public Employee(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Employee() {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
