package com.kristoffer.demo;

import com.kristoffer.demo.controllers.StudentController;
import com.kristoffer.demo.models.student.Student;
import com.kristoffer.demo.views.StudentView;

public class Main {
    public static void main(String[] args) {

        // Instantiation
        StudentView studentView = new StudentView();
        Student student = new Student(
                "Benny",
                15,
                true
        );

        StudentController studentController = new StudentController(
                student,
                studentView
        );

        // Testing MVC
        studentController.printStudentDetails();    // Before change

        studentController.setStudentName("Benny the destroyer");
        studentController.setStudentIsTired(false);
        studentController.setStudentAge(9000);

        studentController.printStudentDetails();    // After University

    }
}
