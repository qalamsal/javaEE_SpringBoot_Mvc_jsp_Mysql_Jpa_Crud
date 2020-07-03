package com.san.j2ee_springboot_jpa_mysql_crud_jsp_crud.controller;

import com.san.j2ee_springboot_jpa_mysql_crud_jsp_crud.Models.Employee;
import com.san.j2ee_springboot_jpa_mysql_crud_jsp_crud.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//all the apps folders must be in java->default package , here
//com.san.j2ee_Springboot_mvc_jsp_crud

@Controller
@RequestMapping("/")

public class IndexController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("")
    public String listEmployees(ModelMap m){
        System.out.println("List of Employee called..");
        List<Employee> employees= employeeService.findAll();
        m.addAttribute("emps",employees);
        m.addAttribute("test",123);
        return "/index";
    }
}
