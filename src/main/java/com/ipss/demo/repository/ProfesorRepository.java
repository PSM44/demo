package com.ipss.demo.repository;

import com.ipss.demo.model.ProfesorSupervisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfesorRepository extends JpaRepository<ProfesorSupervisor, Long> {
    Optional<ProfesorSupervisor> findByEmail(String email);
}
