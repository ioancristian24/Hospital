package com.sda.service;

import com.sda.entities.Department;


public interface DepartmentService {

    void createDepartment(Department department);
    Department getDepartmentById(int departmentId);
    void updateDepartmentById(int departmentId, String name);
    void deleteDepartmentById(Integer departmentId);
}
