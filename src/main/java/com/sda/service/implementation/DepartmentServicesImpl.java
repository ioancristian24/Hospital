package com.sda.service.implementation;

import com.sda.dao.implementation.DepartmentDaoImpl;
import com.sda.dao.implementation.PhysicianDaoImpl;
import com.sda.entities.Department;
import com.sda.service.DepartmentService;

public class DepartmentServicesImpl implements DepartmentService {
    @Override
    public void createDepartment(Department department) {
        new DepartmentDaoImpl().addDepartment(department);
    }

    @Override
    public Department getDepartmentById(int departmentId) {
        return new DepartmentDaoImpl().displayDepartmentById(departmentId);
    }

    @Override
    public void updateDepartmentById(int departmentId, String name) {
        new DepartmentDaoImpl().updateDepartmentById(departmentId, name);
    }

    @Override
    public void deleteDepartmentById(Integer departmentId) {
        new DepartmentDaoImpl().deleteDepartmentById(departmentId);
    }
}
