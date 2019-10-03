package com.sda.service;

import com.sda.entities.Affiliated_with;
import com.sda.entities.Affiliated_with_Id;
import com.sda.entities.Physician;

public interface Affiliated_withService {

    void createAffiliated_with(Affiliated_with affiliated_with);
    Affiliated_with_Id getAffiliated_withById(Affiliated_with_Id id);
    void updateAffiliated_withById(Affiliated_with_Id id, boolean primaryAffiliation);
}
