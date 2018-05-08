package com.example.stef.javacourse4;

import java.util.ArrayList;

public class Problem {
    ArrayList<Student> student=new ArrayList<>();
    ArrayList<Project> project = new ArrayList<>();


    Problem(ArrayList<Project> project,ArrayList<Student> student){
        this.project=project;
        this.student=student;
    }

    public ArrayList<Student> getStudent() {
        return student;
    }

    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }

    public ArrayList<Project> getProject() {
        return project;
    }

    public void setProject(ArrayList<Project> project) {
        this.project = project;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Problem{" +
                "student=" + student +
                ", project=" + project +
                '}';
    }
}
