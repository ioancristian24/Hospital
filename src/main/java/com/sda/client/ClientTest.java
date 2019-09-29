package com.sda.client;

import com.sda.entities.Department;
import com.sda.entities.Physician;
import com.sda.service.DepartmentService;
import com.sda.service.PhysicianService;
import com.sda.service.implementation.DepartmentServicesImpl;
import com.sda.service.implementation.PhysicianServicesImpl;


public class ClientTest {

    public static void main(String[] args) {
        PhysicianService physicianService = new PhysicianServicesImpl();
            //createPhysician(physicianService);
            //getPhysicianById(physicianService);
            //updatePhysicianById(physicianService);
            //deletePhysicianById(physicianService);

        DepartmentService departmentService = new DepartmentServicesImpl();
              createDepartment(departmentService);
              //getDepartmentById(departmentService);
              //updateDepartmentById(departmentService);
              //deleteDepartmentById(departmentService);
    }

    private static void deletePhysicianById(PhysicianService physicianService) {
        physicianService.deletePhysicianById(14);
    }

    private static void updatePhysicianById(PhysicianService physicianService) {
        physicianService.updatePhysicianById(3, "Ginecolog");
    }

    private static void getPhysicianById(PhysicianService physicianService) {
        Physician physician = physicianService.getPhysicianById(1);
        System.out.println(physician);
    }

    private static void createPhysician(PhysicianService physicianService){
        physicianService.createPhysician(getPhysician());
    }

    private static Physician getPhysician() {
        Physician physician = new Physician();
        physician.setName("Leon Button");
        physician.setPosition("Surgeon");
        physician.setSsn(798545);
        return physician;
    }

    private static void deleteDepartmentById(DepartmentService departmentService) {
        departmentService.deleteDepartmentById(5);
    }

    private static void updateDepartmentById(DepartmentService departmentService) {
        departmentService.updateDepartmentById(3, "Obstretical");
    }

    private static void getDepartmentById(DepartmentService departmentService) {
        Department department = departmentService.getDepartmentById(1);
        System.out.println(department);
    }

    private static void createDepartment(DepartmentService departmentService) {
        departmentService.createDepartment(getDepartment());
    }

    private static Department getDepartment() {
        Department department = new Department();
        department.setName("Mineralogy");
        department.setPhysician(getPhysician());
        return department;
    }
}