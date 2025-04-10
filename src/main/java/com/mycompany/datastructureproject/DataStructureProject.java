/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datastructureproject;

import java.util.Scanner;

/**
 *
 * @author Aly
 */
public class DataStructureProject {

    public static void main(String[] args) {
        { // ------------------------------------------------------ Project desing
          // ------------------------------------------------------
          // teams
          // #1 => Aly - Galal - Tamer - Salma => 1 Main , 4 remove, 5 remove ,
          // 6 getLast ,7 getLast , 16 redo , 17 undo
          // ###################################
          // #2 => Hazem - Basem - desoky => 8 remove Enroll ,9 Enrolls ,
          // 10 displayAll , 11 displayAll , 12 sort , 13 sort
          // ###################################
          // #3 => Baraa - Said - Wesam => 2 add , 3 add , 14 isfullCourse ,
          // 15 isnormalstudent , 18 verify , 19 verify
          // ------------------------------------------------------
          // ###################################
          // 1- Main method optians and
          // ###################################
            {// class student
             // --info
             // ---int studentId => String
             // ---student nextStudent;
             // ---studentInCourses studentCourses; => linked list to student courses
             // --constractors
             // ---student(int id){...} => add new student.
            }
        }
        // ###################################
        {// class courses
         // --info
         // ---int courseId => String
         // ---courses nextCourse;
         // ---studentInCourses coursesStudent; => linked list to course students
         // --constractors
         // ---courses(int id){...} => add new course.
        }
        // ###################################
        { // class studentAndCourses
          // --info -----> ✓
          // ---student currentStudent;
          // ---student nextStudent;
          // ---courses currentCourse;
          // ---courses nextCourse;
        }
        // ###################################
        { // class System
          // --info
          // --- Student studentsHead
          // --- Courses CoursesHead
          // --methods
          // ###################################
          // 2- addStudent(int studentID) => Adds a new student to the system (linked
          // list).
          // => we need method to check if there are student with the same id or !=0
          // # add while loop when it invalid ✓
          // ------------------------
          // 3- addCourse(int courseID) => Adds a new course to the system (linked list).
          // we need method to check if there are course with the same id or !=0
          // add while loop when it invalid ✓
          // ------------------------
          // 14- isfullCourse(int courseID) => Checks if a course if complete or not.
          // ------------------------
          // 15- isnormalstudent(int courseID) => Checks if a student registers 2-7
          // courses or
          // not from the studentCourses in Student class
          // ------------------------
          // 18- vaildCourse(int id) => check if the course id valid or added before
          // ------------------------
          // 19- vaildStudent(int id) => check if the student id valid or added before
          // ------------------------
          
            // ###################################
            // 4- removeStudent(int studentID) =>Removes a student from the system.
            // check if student exists or not frist! ✓
            // ------------------------
            // 5- removeCourse(int courseID) => Removes a course from the system.
            // check if course exists or not frist! ✓
            // ------------------------
            // 6- getLastStudentAdded() => Returns the ID of the last student added.
            // Donot get the tail of the list he can sort before call the method
            // ------------------------
            // 7- getLastCourseAdded() => Returns the ID of the last course added.
            // Donot get the tail of the list he can sort before call the method
            // ------------------------
            // 16 & 17 ### redo & undo ###
            // ------------------------
            // ###################################

            // 8- enrollStudent(int studentID, int courseID) => Enrolls a student in a
            // course
            // (updates both lists).
            // check if course exists and student exists frist!
            // ------------------------
            // 9- removeEnrollment(int studentID, int courseID) => Removes a student’s
            // enrollment from a course.
            // check if course exists and student exists frist!
            // ------------------------
            // 10- listCoursesByStudent(int studentID) => Displays all courses a student is
            // enrolled in. from the studentCourses in Student class
            // ------------------------
            // 11- listStudentsByCourse(int courseID) => Displays all students enrolled in a
            // course. from the courseStudents in Courses class
            // ------------------------
            // 12- sortStudentsByID(int courseID) => Sorts the list of students in ascending
            // order by ID.
            // ------------------------
            // 13- sortCoursesByID(int studentID) => Sorts the list of courses in ascending
            // order by ID.
            // ------------------------

            // ====================== Addition methods ======================

        }
        // ###################################
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("Welcome to university system");
            System.out.println("1- add student");
            System.out.println("2- add course");
            System.out.println("3- remove student");
            System.out.println("4- remove course");
            System.out.println("5- get last student added");
            System.out.println("6- get last course added");
            System.out.println("7- enroll student");
            System.out.println("8- remove enrollment");
            System.out.println("9- list courses by student");
            System.out.println("10- list students by course");
            System.out.println("11- sort students by ID");
            System.out.println("12- sort courses by ID");
            System.out.println("13- is full course");
            System.out.println("14- is normal student");
            System.out.println("15- verify course");
            System.out.println("16- verify student");
            System.out.println("17- exit");
            System.out.println("Please enter your choice: ");
            int choice = scanner.nextInt();
            CustomSystem system = new CustomSystem();
            switch (choice) {
                case 1:
                    System.out.print("Enter student ID (not 0 and not already added): ");
                    int studentId = scanner.nextInt();
                    system.addStudent(studentId);
                    if (studentId == 0) {
                        System.out.println(" ID cannot be 0. Please try again.");
                    } else if (system.verifyStudent(studentId)) {
                        System.out.println(" This ID is already added. Try a different one.");
                    } else {
                        break; 
                    }
                system.addStudent(studentId);
                System.out.println(" Student added successfully!");
                break;
                case 2:
                    System.out.println("Enter course ID: ");
                    int courseId = scanner.nextInt();
                    system.addCourse(courseId);
                    break;
                case 3:
                    System.out.println("Enter student ID to remove: ");
                    int removeStudentId = scanner.nextInt();
                    system.removeStudent(removeStudentId);
                    break;
                case 4:
                    System.out.println("Enter course ID to remove: ");
                    int removeCourseId = scanner.nextInt();
                    // system.removeCourse(removeCourseId);
                    break;
                case 5:
                    // getLastStudentAdded();
                    break;
                case 6:
                    // getLastCourseAdded();
                    break;
                case 7:
                    System.out.println("Enter student ID to enroll: ");
                    int enrollStudentId = scanner.nextInt();
                    System.out.println("Enter course ID to enroll in: ");
                    int enrollCourseId = scanner.nextInt();
                    // enrollStudent(enrollStudentId, enrollCourseId);
                    break;
                case 8:
                    System.out.println("Enter student ID to remove enrollment: ");
                    int unenrollStudentId = scanner.nextInt();
                    System.out.println("Enter course ID to unenroll from: ");
                    int unenrollCourseId = scanner.nextInt();
                    // removeEnrollment(unenrollStudentId, unenrollCourseId);
                    break;
                case 9:
                    System.out.println("Enter student ID to list courses: ");
                    int listCoursesStudentId = scanner.nextInt();
                    // listCoursesByStudent(listCoursesStudentId);
                    break;
                case 10:
                    System.out.println("Enter course ID to list students: ");
                    int listStudentsCourseId = scanner.nextInt();
                    // listStudentsByCourse(listStudentsCourseId);
                    break;
                case 11:
                    // sortStudentsByID(courseId);
                    break;
                case 12:
                    // sortCoursesByID(studentId);
                    break;
                case 13:
                    // isfullCourse(courseId);
                    break;
                case 14:
                    // isnormalstudent(studentId);
                    break;
                case 15:
                    // verifyCourse(courseId);
                    break;
                case 16:
                    // verifyStudent(studentId);
                    break;
                case 17:
                    System.out.println("Exiting the program.");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            // CustomSystem s1 = new CustomSystem();
            // s1.addStudent(1);
            // s1.addStudent(2);
            // s1.addStudent(3);
            // s1.removeStudent(2);
            // s1.displayAllStudents();
            // s1.addCourse(1);
            // s1.addCourse(2);
            // System.out.println("course vrify " + s1.verifyCourse(2));
            // // s1.removeCourse(2);
            // s1.addCourse(4);
            // s1.displayAllCourses();
        }
    }

}

// #################################################################################################
class Student {
    int studentId;
    Student nextStudent;
    studentAndCourses studentCourses;

    // conestractor to add new student
    public Student() {
        nextStudent = null;
    }

    public Student(int id) {
        studentId = id;
        nextStudent = null;
    }

    public Student(int id, Student next) {
        studentId = id;
        nextStudent = next;
    }

}

// #################################################################################################
class Courses {
    int courseId;
    Courses nextCourse;
    studentAndCourses courseStudents;

    // conestractor to add new course
    Courses(int id) {
        courseId = id;
    }

    Courses(int id, Courses next) {
        courseId = id;
        nextCourse = next;
    }
}
// #################################################################################################

class studentAndCourses {
    // Student currentStudent;
    Student nextStudent;
    Student studentHead;

    // Courses currentCourse;
    Courses nextCourse;
    Courses coursesHead;

    // add new student
}

// #################################################################################################

class CustomSystem {
    Student studentHead;
    Courses coursesHead;

    public void addStudent(int id) {
        if (verifyStudent(id)) {
            System.out.println("not valid id");
        } else {
            if (studentHead == null) {
                studentHead = new Student(id);
            } else {
                studentHead = new Student(id, studentHead);
            }
            System.out.println("the student added successfully");
        }
    }

    // add new course
    public void addCourse(int id) {
        // If condition to checked if the course added before or not
        if (verifyCourse(id)) {
            System.out.println("not valid id");
        } else {
            if (coursesHead == null) {
                coursesHead = new Courses(id);
            } else {
                coursesHead = new Courses(id, coursesHead);
            }
            System.out.println("added course");
        }
    }

    // Display all students
    public void displayAllStudents() {
        Student tmp;
        tmp = studentHead;
        while (tmp != null) {
            System.out.println(tmp.studentId);
            tmp = tmp.nextStudent;

        }
    }

    // Display all students
    public void displayAllCourses() {
        Courses tmp;
        tmp = coursesHead;
        while (tmp != null) {
            System.out.println(tmp.courseId);
            tmp = tmp.nextCourse;

        }
    }

    // remove student
    public void removeStudent(int id) {
        Student tmp = studentHead;
        if (verifyStudent(id)) {
            while (tmp != null) {
                if (tmp.nextStudent.studentId == id) {

                    tmp.nextStudent = tmp.nextStudent.nextStudent;
                    System.out.println("removed student with id: " + id);
                    return;
                }
                tmp = tmp.nextStudent;
            }
        } else {
            System.out.println("student not found");
        }
    }

    // remove course
    // public void removeCourse(int id) {
    // Courses tmp = coursesHead;
    // if (verifyCourse(id)) {
    // while (tmp != null) {
    // if (tmp.nextCourse.courseId == id) {
    // if (tmp.nextCourse.nextCourse == null) {
    // tmp.nextCourse = tmp.nextCourse.nextCourse;
    // }else{
    // tmp.nextCourse =null;
    // }
    // System.out.println("removed course with id: " + id);
    // return;
    // }
    // tmp = tmp.nextCourse;
    // }
    // } else {
    // System.out.println("course not found");
    // }
    // }

    // Verify Student id
    public boolean verifyStudent(int id) {
        Student tmp = studentHead;
        while (tmp != null) {
            if (tmp.studentId == id || id == 0) {
                return true;
            }
            tmp = tmp.nextStudent;
        }
        return false;
    }

    // Verify course id
    public boolean verifyCourse(int id) {
        Courses tmp = coursesHead;
        while (tmp != null) {
            if (tmp.courseId == id || id == 0) {
                return true;
            }
            tmp = tmp.nextCourse;
        }
        return false;
    }

}
