package com.sda.service;

import com.sda.entities.Affiliated_with;
import com.sda.entities.Affiliated_with_Id;

public interface Affiliated_withService {

    Affiliated_with getAffiliated_withById(Affiliated_with_Id id);
    void updateAffiliated_withById(Affiliated_with_Id id, boolean primaryAffiliation);
}
