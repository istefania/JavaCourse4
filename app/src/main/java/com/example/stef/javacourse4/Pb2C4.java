package com.example.stef.javacourse4;

import java.util.ArrayList;

public class Pb2C4 {
    public static void main(String [] args){

        //Problem problem=new Problem(4,3);
        ArrayList<Student> students=new ArrayList<>();
        ArrayList<Project> projects=new ArrayList<>();
        Student s1 = new Student("S1", "s1@email.com");
        Student s2 = new Student("S2", "s2@email.com");
        Student s3 = new Student("S3", "s3@email.com");
        Student s4 = new Student("S4", "s4@email.com");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        Project p1 = new Project("P1", 2,10);
        Project p2 = new Project("P2", 5,4);
        Project p3 = new Project("P3", 6,5);
        projects.add(p1);
        projects.add(p2);
        projects.add(p3);

        Problem problem=new Problem(projects,students);
        problem.setProject(projects);
        problem.setStudent(students);
        System.out.println(problem);


    }
}
