package com.example.demo.RepoClass;


import com.example.demo.ModelClass.Notepad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotepadRepo extends JpaRepository<Notepad,Long> {
}
