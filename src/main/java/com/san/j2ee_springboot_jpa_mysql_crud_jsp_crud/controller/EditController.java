package com.san.j2ee_springboot_jpa_mysql_crud_jsp_crud.controller;

import com.san.j2ee_springboot_jpa_mysql_crud_jsp_crud.Models.Employee;
import com.san.j2ee_springboot_jpa_mysql_crud_jsp_crud.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

//all the apps folders must be in java->default package , here
//com.san.j2ee_Springboot_mvc_jsp_crud

@Controller
@RequestMapping("/")
public class EditController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("edit")
    public String test(@RequestParam("id") Long id, ModelMap mp){
        //System.out.println("Add Controller called");
        System.out.println("Edit iD ::" +id);
        Optional<Employee> employee=employeeService.findById(id);
        mp.addAttribute("emp", employee);
        return "frmEdit";
    }

    @PostMapping("edit")
    public String doEdit(@RequestParam("id") Long id, @RequestParam("name") String name, @RequestParam("address") String address){
        System.out.println("Edit.. Controller called");
        Employee newEmployee=new Employee();
        newEmployee.setId(id);
        newEmployee.setName(name);
        newEmployee.setAddress(address);
        employeeService.save(newEmployee);
        return "redirect:/";
    }
}
