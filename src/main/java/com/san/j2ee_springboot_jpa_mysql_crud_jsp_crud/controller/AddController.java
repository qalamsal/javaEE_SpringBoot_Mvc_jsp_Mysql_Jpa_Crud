package com.san.j2ee_springboot_jpa_mysql_crud_jsp_crud.controller;

import com.san.j2ee_springboot_jpa_mysql_crud_jsp_crud.Models.Employee;
import com.san.j2ee_springboot_jpa_mysql_crud_jsp_crud.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


//all the apps folders must be in java->default package , here
//com.san.j2ee_Springboot_mvc_jsp_crud

@Controller
@RequestMapping("/")
public class AddController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("add")
    public String doAdd(@RequestParam("name") String name,@RequestParam("address") String address){
        Employee newEmployee=new Employee();
        newEmployee.setName(name);
        newEmployee.setAddress(address);
        employeeService.save(newEmployee);
        return "redirect:/";
    }

    @GetMapping("add")
    public String test(){
        System.out.println("Add Controller called");
        return "frmAdd";
    }
}
