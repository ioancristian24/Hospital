package com.sda.service.implementation;

import com.sda.dao.implementation.PhysicianDaoImpl;
import com.sda.entities.Physician;
import com.sda.service.PhysicianService;


public class PhysicianServicesImpl implements PhysicianService {
    @Override
    public void createPhysician(Physician physician) {
        new PhysicianDaoImpl().addPhysician(physician);
    }

    @Override
    public Physician getPhysicianById(int employeeId) {
        return new PhysicianDaoImpl().displayPhysicianById(employeeId);
    }

    @Override
    public void updatePhysicianById(int employeeId, String position) {
        new PhysicianDaoImpl().updatePhysicianById(employeeId, position);
    }

    @Override
    public void deletePhysicianById(Integer employeeId) {
        new PhysicianDaoImpl().deletePhysicianById(employeeId);
    }

}
