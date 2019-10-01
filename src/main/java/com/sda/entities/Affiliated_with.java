package com.sda.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "affiliated_with")
public class Affiliated_with {

    @EmbeddedId
    private Affiliated_with_Id id;

    @Column(name = "primary_affiliation")
    private boolean primaryAffiliation;

    public Affiliated_with_Id getId() {
        return id;
    }

    public void setId(Affiliated_with_Id id) {
        this.id = id;
    }

    public boolean isPrimaryAffiliation() {
        return primaryAffiliation;
    }

    public void setPrimaryAffiliation(boolean primaryAffiliation) {
        this.primaryAffiliation = primaryAffiliation;
    }
}
