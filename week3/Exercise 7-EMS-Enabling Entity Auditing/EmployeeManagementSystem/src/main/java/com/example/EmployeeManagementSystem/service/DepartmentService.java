package com.example.EmployeeManagementSystem.service;

import com.example.EmployeeManagementSystem.Department;
import com.example.EmployeeManagementSystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    // Create or Update Department
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    // Read Department by ID
    public Optional<Department> getDepartmentById(Long id) {
        return departmentRepository.findById(id);
    }

    // Read All Departments
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    // Delete Department by ID
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}
