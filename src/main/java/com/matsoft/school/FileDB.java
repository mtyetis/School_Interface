package com.matsoft.school;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 03/09/2017.
 */
public class FileDB implements Database  {

    private String path = "Student.txt";
    private String status;
    private Map<String, Integer> studentList = new HashMap<String, Integer>();
    private FileWriter fileWriter;
    private int studentNotes = 0;


    public void claculateAvarage(Student student) {

        if(student != null){
            studentList.put(student.getName(), student.getNote());
        }
            for (Map.Entry<String,Integer> result : studentList.entrySet()) {
                studentNotes = result.getValue();
                studentNotes += studentNotes;
                System.out.println("Result : " + studentNotes);
            }

        int avarageNotes = studentNotes / studentList.size();
        try {
        if(student.getNote() >= avarageNotes){

                fileWriter = new FileWriter(path,true);
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
        }catch (IOException ix){
            System.out.println("Error : " + ix.getMessage());
        }
    }

    public void calculateNormal(Student student) {

        try {
            fileWriter = new FileWriter(path,true);
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
