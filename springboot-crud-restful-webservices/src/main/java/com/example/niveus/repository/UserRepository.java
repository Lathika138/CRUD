package com.example.niveus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.niveus.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
