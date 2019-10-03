package com.sda.client;

import com.sda.entities.Affiliated_with;
import com.sda.entities.Affiliated_with_Id;
import com.sda.entities.Department;
import com.sda.entities.Physician;
import com.sda.service.Affiliated_withService;
import com.sda.service.DepartmentService;
import com.sda.service.PhysicianService;
import com.sda.service.implementation.Affiliated_withServiceImpl;
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
              //createDepartment(departmentService);
              //getDepartmentById(departmentService);
              //updateDepartmentById(departmentService);
              //deleteDepartmentById(departmentService);

        Affiliated_withService affiliated_withService = new Affiliated_withServiceImpl();
                createAffiliated_with(affiliated_withService);
                //readAffiliated_withById(affiliated_withService);
                //updateAffiliated_withById(affiliated_withService);
    }

    private static void createAffiliated_with(Affiliated_withService affiliated_withService) {
        affiliated_withService.createAffiliated_with(getAffiliated_with());
    }


    private static void readAffiliated_withById(Affiliated_withService affiliated_withService) {
        Affiliated_with_Id affiliated_with = affiliated_withService.getAffiliated_withById
                (new Affiliated_with_Id(5,3));
        System.out.println(affiliated_with);
    }

    private static void updateAffiliated_withById(Affiliated_withService affiliated_withService) {
       affiliated_withService.updateAffiliated_withById((new Affiliated_with_Id(1,4)),false);
   }


    private static Affiliated_with getAffiliated_with() {
        Affiliated_with affiliated_with = new Affiliated_with();
        affiliated_with.setId(new Affiliated_with_Id(1, 1));
        affiliated_with.setPrimaryAffiliation(true);
        return affiliated_with;
    }




    private static void deletePhysicianById(PhysicianService physicianService) {
        physicianService.deletePhysicianById(16);
    }

    private static void updatePhysicianById(PhysicianService physicianService) {
        physicianService.updatePhysicianById(16, "Ginecolog");
    }

    private static void getPhysicianById(PhysicianService physicianService) {
        Physician physician = physicianService.getPhysicianById(16);
        System.out.println(physician);
    }

    private static void createPhysician(PhysicianService physicianService){
        physicianService.createPhysician(getPhysician());
    }

    private static Physician getPhysician() {
        Physician physician = new Physician();
        physician.setName("Eduard Norton");
        physician.setPosition("Cardiologist");
        physician.setSsn(799645);
        return physician;
    }




    private static void deleteDepartmentById(DepartmentService departmentService) {
        departmentService.deleteDepartmentById(5);
    }

    private static void updateDepartmentById(DepartmentService departmentService) {
        departmentService.updateDepartmentById(3, "Biochemistry");
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
        return department;
    }
}