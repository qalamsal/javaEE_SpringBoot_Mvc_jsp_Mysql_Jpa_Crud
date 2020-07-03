package com.san.j2ee_springboot_jpa_mysql_crud_jsp_crud.Services;


import com.san.j2ee_springboot_jpa_mysql_crud_jsp_crud.Models.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


import java.sql.SQLException;

//service is repo in jpa....
@Repository
public interface EmployeeService extends JpaRepository<Employee,Long> {

    /*
    boolean addEmployee(Employee emp) throws ClassNotFoundException, SQLException;
    boolean editEmployee(Employee emp) throws ClassNotFoundException, SQLException;
    ArrayList<Employee> listEmployee() throws SQLException, ClassNotFoundException;
    boolean deleteEmployee(int id) throws ClassNotFoundException, SQLException;

     */

    //NOW WITH JPA>>> implements JPARepository


}
