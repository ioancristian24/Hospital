package com.sda.service;

import com.sda.entities.Physician;


public interface PhysicianService {

    void createPhysician(Physician physician);
    Physician getPhysicianById(int employeeId);
    void updatePhysicianById(int employeeId, String position);
    void deletePhysicianById(Integer employeeId);
}
