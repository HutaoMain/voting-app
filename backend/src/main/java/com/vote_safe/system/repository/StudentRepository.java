package com.vote_safe.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vote_safe.system.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
