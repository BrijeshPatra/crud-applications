package com.example.crudapplication.repository;

import com.example.crudapplication.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

//     Department findByDepartmentName(String deptName);
  public  Department findByDepartmentNameIgnoreCase(String deptName);
}
