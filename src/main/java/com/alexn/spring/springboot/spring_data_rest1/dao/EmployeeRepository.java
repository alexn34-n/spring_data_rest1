package com.alexn.spring.springboot.spring_data_rest1.dao;






import com.alexn.spring.springboot.spring_data_rest1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {


}
