package com.sda.dao;

import com.sda.entities.Affiliated_with;
import com.sda.entities.Affiliated_with_Id;
import com.sda.entities.Department;


public interface Affiliated_withDAO {

    void addAffiliated_with(Affiliated_with affiliated_with);
    Affiliated_with_Id displayAffiliated_withById(Affiliated_with_Id id);
    void updateAffiliated_withById(Affiliated_with_Id affiliated_with_id, boolean primaryAffiliation);
}
