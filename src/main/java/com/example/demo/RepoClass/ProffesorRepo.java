package com.example.demo.RepoClass;

import com.example.demo.ModelClass.Proffesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProffesorRepo extends JpaRepository<Proffesor, Long> {
}
