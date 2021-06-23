package com.dj.springbootcrudemployee23jun.dao;

import com.dj.springbootcrudemployee23jun.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> findAll();

    public Employee findById(int theId);

    public void save(Employee theEmployee);

    public void deleteById(int theId);
}
