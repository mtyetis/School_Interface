package com.matsoft.school;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by user on 03/09/2017.
 */
public class FileDB implements Database {

    private String path = "Student.txt";
    private String status;


    public void claculateAvarage(Student student) {


    }

    public void calculateNormal(Student student) {
        try {
            FileWriter fileWriter = new FileWriter(path,true);
            if(student.getNote() >= 50){
                status = "Passed\n";
                String studentValue = student.getName() + " " + student.getSurname() + " " + student.getLesson() + " " +
                        Integer.toString(student.getNote()) + "- " + status;
                fileWriter.append(studentValue);
            }
            else {
                status = "Not passed\n";
                String studentValue = student.getName() + " " + student.getSurname() + " " + student.getLesson() + " " +
                        Integer.toString(student.getNote())+ " - " + status;
                fileWriter.append(studentValue);
            }
            fileWriter.close();
        }catch (FileNotFoundException fx){
            System.out.println("Error : " + fx.getMessage());
        }catch (IOException ix){
            System.out.println("Error : " + ix.getMessage());
        }

    }
}
