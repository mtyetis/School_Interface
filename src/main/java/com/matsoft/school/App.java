package com.matsoft.school;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Database database = new FileDB();
        Student student = new Student("Muhammet", "Yetis", "Math", 49);
        Student student2 = new Student("Muhammet", "Yetis", "Math", 50);
        database.calculateNormal(student);
        database.calculateNormal(student2);
    }
}
