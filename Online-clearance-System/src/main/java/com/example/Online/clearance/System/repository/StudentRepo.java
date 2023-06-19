package com.example.Online.clearance.System.repository;

import com.example.Online.clearance.System.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
