package com.example.stef.javacourse4;

public class Project {
    String name;
    int capacity;
    int numberOfStudents;

    Project(String name, int capacity, int numberOfStudent) {
        this.name = name;
        this.capacity = capacity;
        this.numberOfStudents = numberOfStudent;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }


    public boolean equals(Project project) {
        if (project.getNumberOfStudents() < 10) {
            return true;
        } else {
            return false;
        }

    }
}
