package com.example.demo.ModelClass;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int roomNumber;

    @ManyToMany
    private Set<Cleaner> cleanerSet;

    public Set<Cleaner> getCleanerSet() {
        return cleanerSet;
    }

    public void setCleanerSet(Set<Cleaner> cleanerSet) {
        this.cleanerSet = cleanerSet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Room() {
    }
}
