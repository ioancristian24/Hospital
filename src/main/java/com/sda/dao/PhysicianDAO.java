package com.sda.dao;

import com.sda.entities.Physician;

public interface PhysicianDAO {

    void addPhysician(Physician physician);
    Physician displayPhysicianById(int employeeId);
    void updatePhysicianById(int employeedId, String position);
    void deletePhysicianById(Integer employeeId);
}
