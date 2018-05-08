package com.example.stef.javacourse4;

public class Student {
    String name;
    String email;

    Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public boolean equals(Student student) {
        if (student.getEmail().length() < 2) {
            return false;
        } else {
            return true;

        }

    }

}
