package com.example.demo.RepoClass;

import com.example.demo.ModelClass.Cleaner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CleanerRepo extends JpaRepository<Cleaner, Long> {
}
