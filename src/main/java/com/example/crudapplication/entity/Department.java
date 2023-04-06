package com.example.crudapplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deptId;
    private String departmentName;
    private String deptAddress;
    private String deptCode;


    public Department(Long deptId, String departmentName, String deptAddress, String deptCode) {
        this.deptId = deptId;
        this.departmentName = departmentName;
        this.deptAddress = deptAddress;
        this.deptCode = deptCode;
    }

    public Department() {

    }

    @Override
    public String toString() {
        return "DepartmentEntity{" +
                "deptId=" + deptId +
                ", deptName='" + departmentName + '\'' +
                ", deptAddress='" + deptAddress + '\'' +
                ", deptCode='" + deptCode + '\'' +
                '}';
    }
}
