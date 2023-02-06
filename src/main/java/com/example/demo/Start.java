package com.example.demo;



import com.example.demo.ModelClass.*;
import com.example.demo.RepoClass.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class Start {

    private BackpackRepo backpackRepo;
    private StudentRepo studentRepo;

    @Autowired
    public Start(BackpackRepo backpackRepo, StudentRepo studentRepo, NotepadRepo notepadRepo, NoteRepo noteRepo, ProffesorRepo proffesorRepo, RoomRepo roomRepo, CleanerRepo cleanerRepo) {

        //create
        Backpack backpack = new Backpack("Nike");
        Backpack backpack1 = new Backpack("Adidas");

        Student student = new Student("Stefan","cos", 1);
        Student student1 = new Student("Patrycja", "jakas", 5);

        Notepad notepad = new Notepad("History");
        Notepad notepad1 = new Notepad("Chemistry");
        Notepad notepad2 = new Notepad("IT");
        Notepad notepad3 = new Notepad("Math");

        Note note = new Note(1);
        Note note1 = new Note(2);
        Note note2 = new Note(3);
        Note note3 = new Note(4);
        Note note4 = new Note(5);

        Proffesor proffesor = new Proffesor("Ktos", "nazwisko", "nauczyciel");
        Proffesor proffesor1 = new Proffesor("dsadad", "dsadsa", "dsaddsa");
        Proffesor proffesor2 = new Proffesor("dsadsa", "asaad", "assweq");

        Room room = new Room(1);
        Room room2 = new Room(2);

        Cleaner cleaner = new Cleaner("Stefan", "pierwszy");
        Cleaner cleaner1 = new Cleaner("Stefan", "drugi");

        Set<Student> studentSet = Stream.of(student, student1).collect(Collectors.toSet());

        Set<Proffesor> proffesorSet = Stream.of(proffesor,proffesor1,proffesor2).collect(Collectors.toSet());

        Set<Room> roomSet = Stream.of(room,room2).collect(Collectors.toSet());
        Set<Cleaner> cleanerSet = Stream.of(cleaner,cleaner1).collect(Collectors.toSet());

        backpackRepo.save(backpack);
        backpackRepo.save(backpack1);

        student.setBackpack(backpack);
        student1.setBackpack(backpack1);

        notepad.setBackpack(backpack);
        notepad1.setBackpack(backpack);
        notepad2.setBackpack(backpack1);
        notepad3.setBackpack(backpack1);

        notepadRepo.save(notepad);
        notepadRepo.save(notepad1);
        notepadRepo.save(notepad2);
        notepadRepo.save(notepad3);

        note.setNotepad(notepad);
        note.setNotepad(notepad1);
        note2.setNotepad(notepad);
        note3.setNotepad(notepad1);
        note4.setNotepad(notepad);

        noteRepo.save(note);
        noteRepo.save(note1);
        noteRepo.save(note2);
        noteRepo.save(note3);
        noteRepo.save(note4);

        studentRepo.save(student);
        studentRepo.save(student1);



        roomRepo.save(room);
        roomRepo.save(room2);

        room.setCleanerSet(cleanerSet);
        room2.setCleanerSet(cleanerSet);

        cleaner.setRoomSet(roomSet);
        cleaner1.setRoomSet(roomSet);

        cleanerRepo.save(cleaner);
        cleanerRepo.save(cleaner1);

        proffesor.setStudentSet(studentSet);
        proffesor1.setStudentSet(studentSet);
        proffesor2.setStudentSet(studentSet);

        proffesor.setRoom(room);
        proffesor1.setRoom(room2);

        student.setProffesorSet(proffesorSet);
        student1.setProffesorSet(proffesorSet);

        proffesorRepo.save(proffesor);
        proffesorRepo.save(proffesor1);
        proffesorRepo.save(proffesor2);


    }




}
