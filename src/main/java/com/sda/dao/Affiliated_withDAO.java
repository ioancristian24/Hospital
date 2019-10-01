package com.sda.dao;

import com.sda.entities.Affiliated_with;
import com.sda.entities.Affiliated_with_Id;


public interface Affiliated_withDAO {

    Affiliated_with displayAffiliated_withById(Affiliated_with_Id id);
    void updateAffiliated_withById(Affiliated_with_Id id, boolean primaryAffiliation);
}
