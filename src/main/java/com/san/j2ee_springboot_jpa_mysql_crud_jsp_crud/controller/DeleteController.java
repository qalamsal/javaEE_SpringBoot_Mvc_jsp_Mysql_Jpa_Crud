package com.san.j2ee_springboot_jpa_mysql_crud_jsp_crud.controller;

import com.san.j2ee_springboot_jpa_mysql_crud_jsp_crud.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;

//all the apps folders must be in java->default package , here
//com.san.j2ee_Springboot_mvc_jsp_crud

@Controller
@RequestMapping("/")
public class DeleteController {


    @Autowired
    EmployeeService employeeService;

    @GetMapping("delete")
    public String test(@RequestParam("id") int id){
        //System.out.println("Add Controller called");
        employeeService.deleteById((long) id);
        return "redirect:/";

    }
}
