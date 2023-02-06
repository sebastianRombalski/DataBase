package com.example.demo.RepoClass;

import com.example.demo.ModelClass.Backpack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BackpackRepo extends JpaRepository<Backpack,Long> {
}
