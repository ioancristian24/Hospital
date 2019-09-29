package com.sda.dao;

import com.sda.entities.Department;


public interface DepartmentDAO {
    void addDepartment(Department department);
    Department displayDepartmentById(int departmentId);
    void updateDepartmentById(int departmentId, String name);
    void deleteDepartmentById(Integer departmentId);
}
