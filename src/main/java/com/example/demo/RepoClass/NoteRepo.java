package com.example.demo.RepoClass;

import com.example.demo.ModelClass.Backpack;
import com.example.demo.ModelClass.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NoteRepo extends JpaRepository<Note,Long> {
}
