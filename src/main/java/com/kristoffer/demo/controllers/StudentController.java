package com.kristoffer.demo.controllers;

import com.kristoffer.demo.models.student.Student;
import com.kristoffer.demo.views.StudentView;

public class StudentController {

    private final Student model;
    private final StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String studentName) {
        model.setName(studentName);
    }

    public void setStudentAge(int studentAge) {
        model.setAge(studentAge);
    }

    public void setStudentIsTired(boolean studentIsTired) {
        model.setTired(studentIsTired);
    }

    public String getStudentName() {
        return model.getName();
    }

    public int getStudentAge() {
        return model.getAge();
    }

    public boolean getStudentIsTired() {
        return model.isTired();
    }

    public void printStudentDetails() {
        view.printStudentDetails(
                model.getName(),
                model.getAge(),
                model.isTired()
        );
    }

}
