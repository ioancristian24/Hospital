package com.sda.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import java.io.Serializable;
import java.util.Objects;

//Aici am creat cheia primara compusa;
@Embeddable
public class Affiliated_with_Id implements Serializable {

    @Column(name = "physician")
    @JoinColumns({@JoinColumn(name = "physician", referencedColumnName = "employee_id")})
    private Integer physician;

    @Column(name = "department")
    @JoinColumns({@JoinColumn(name = "department", referencedColumnName = "department_id")})
    private Integer department;

    public Affiliated_with_Id(Integer physician, Integer department) {
        this.physician = physician;
        this.department = department;
    }

    public Affiliated_with_Id() {

    }

    public Integer getPhysician() {
        return physician;
    }

    public Integer getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Affiliated_with_Id that = (Affiliated_with_Id) o;
        return Objects.equals(physician, that.physician) &&
                Objects.equals(department, that.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(physician, department);
    }
}
