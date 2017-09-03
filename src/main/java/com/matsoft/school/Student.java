package com.matsoft.school;

/**
 * Created by user on 03/09/2017.
 */
public class Student {
    private String name;
    private String surname;
    private String lesson;
    private int note;


    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
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

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public Student(String name, String surname, String lesson, int note){
        this.name = name;
        this.surname = surname;
        this.lesson = lesson;
        this.note = note;
    }
}
