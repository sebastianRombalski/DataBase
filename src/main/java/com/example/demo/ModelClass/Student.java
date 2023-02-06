package com.example.demo.ModelClass;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;
    private String surname;
    private int groupNumber;

    @ManyToMany(mappedBy = "studentSet")
    private Set<Proffesor> proffesorSet;

    @OneToOne
    private Backpack backpack;

    public Set<Proffesor> getProffesorSet() {
        return proffesorSet;
    }

    public void setProffesorSet(Set<Proffesor> proffesorSet) {
        this.proffesorSet = proffesorSet;
    }

    public Student() {
    }

    public Student( String name, String surname, int groupNumber) {
        this.name = name;
        this.surname = surname;
        this.groupNumber = groupNumber;
    }

    public Backpack getBackpack() {
        return backpack;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
}
