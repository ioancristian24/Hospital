package com.sda.service.implementation;

import com.sda.dao.implementation.Affiliated_withDaoImpl;
import com.sda.entities.Affiliated_with;
import com.sda.entities.Affiliated_with_Id;
import com.sda.service.Affiliated_withService;

public class Affiliated_withServiceImpl implements Affiliated_withService {
    @Override
    public Affiliated_with getAffiliated_withById(Affiliated_with_Id id) {
        return new Affiliated_withDaoImpl().displayAffiliated_withById(id);
    }

    @Override
    public void updateAffiliated_withById(Affiliated_with_Id id, boolean primaryAffiliation) {
        new Affiliated_withDaoImpl().updateAffiliated_withById(id, primaryAffiliation);
    }
}
