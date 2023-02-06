package com.example.demo.ModelClass;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "notepads")
public class Notepad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @ManyToOne
    private Backpack backpack;

    @OneToMany(mappedBy = "notepad")
    private Set<Note> notes;

    public Set<Note> getNotes() {
        return notes;
    }

    public void setNotes(Set<Note> notes) {
        this.notes = notes;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    public Notepad(String title) {
        this.title = title;
    }

    public Notepad() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
