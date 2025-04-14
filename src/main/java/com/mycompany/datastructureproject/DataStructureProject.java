/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.datastructureproject;

import java.util.Scanner;

/**
 *
 * @author PCC
 */
public class DataStructureProject {

    /**
     * @param args the command line arguments
     */
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
          // 8- enrollStudent(int studentID, int courseID) => Enrolls a student in a
          // course
          // (updates both lists).
          // check if course exists and student exists frist! ✓
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
          // 14- isfullCourse(int courseID) => Checks if a course if complete or not.
          // ------------------------
          // 15- isnormalstudent(int courseID) => Checks if a student registers 2-7
          // courses or
          // not from the studentCourses in Student class
          // ------------------------
          // 16 & 17 ### redo & undo ###
          // ------------------------
          // ====================== Addition methods ======================
          // 18- vaildCourse(int id) => check if the course id valid or added before ✓
          // ------------------------
          // 19- vaildStudent(int id) => check if the student id valid or added before ✓
          // ------------------------
        }
        // ###################################
        Scanner scanner = new Scanner(System.in);
        CustomSystem system = new CustomSystem();
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
            System.out.println("17- display all students");
            System.out.println("18- display all courses");
            System.out.println("19- exit");
            System.out.println("Please enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter student ID: ");
                    int studentId = scanner.nextInt();
                    system.addStudent(studentId, scanner);
                    break;
                case 2:
                    System.out.println("Enter course ID: ");
                    int courseId = scanner.nextInt();
                    system.addCourse(courseId, scanner);
                    break;
                case 3:
                    System.out.println("Enter student ID to remove: ");
                    int removeStudentId = scanner.nextInt();
                    system.removeStudent(removeStudentId);
                    break;
                case 4:
                    System.out.println("Enter course ID to remove: ");
                    int removeCourseId = scanner.nextInt();
                    system.removeCourse(removeCourseId);
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
                    system.enrollStudent(enrollStudentId, enrollCourseId);
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
                    system.listCoursesByStudent(listCoursesStudentId);
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
                    System.out.println("Enter course ID to verify: ");
                    int verifyCourseId = scanner.nextInt();
                    system.verifyCourse(verifyCourseId);
                    break;
                case 16:
                    System.out.println("Enter student ID to verify: ");
                    int verifyStudentId = scanner.nextInt();
                    system.verifyStudent(verifyStudentId);
                    break;
                case 17:
                    System.out.println("Displaying all students: ");
                    system.displayAllStudents();
                    break;
                case 18:
                    System.out.println("Displaying all courses: ");
                    system.displayAllCourses();
                    break;
                case 19:
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
        studentCourses = null;
    }

    public Student(int id, Student next) {
        studentId = id;
        nextStudent = next;
        studentCourses = null;
    }

    // method for add courses
    public void addCourse(int courseId) {
        if (studentCourses == null)
            studentCourses = new studentAndCourses(this.studentId, courseId);
        else
            studentCourses.add(courseId);
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
        nextCourse = null;
        courseStudents = null;
    }

    Courses(int id, Courses next) {
        courseId = id;
        nextCourse = next;
        courseStudents = null;
    }

    // method for addstudents

    public void addStudent(int studentId) {
        if (courseStudents == null)
            courseStudents = new studentAndCourses(studentId, 0); // Replace 0 with the appropriate courseId if available
        else
            courseStudents.add(studentId);
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

    // adding new students
    int id;
    studentAndCourses next;

    studentAndCourses(int studentId , int courseId) {
        // this.id = id;
        // nextStudent.studentId = id;
        // nextCourse.courseId = id;
        studentHead = new Student(studentId);
        coursesHead = new Courses(courseId);
        this.id = studentId;
        this.nextStudent = null;

        this.next = null;
    }

    void add(int id) {
        studentAndCourses current = this;// this => current object
        while (current.next != null) { // prevent duplicates
            if (current.id == id)
                return;
            current = current.next;
        }
        if (current.id != id) // check last node
            current.next = new studentAndCourses(id, 0); // Replace 0 with the appropriate courseId if available
    }

    boolean contains(int id) {
        studentAndCourses current = this;
        while (current != null) {
            if (current.id == id)
                return true;
            current = current.next;
        }
        return false;
    }

    // count students and courses
    int count() {
        int counter = 0;
        studentAndCourses current = this;
        while (current != null) {
            counter++;
            System.out.println(current.id);
            current = current.next;
        }
        return counter;
    }

}

// #################################################################################################

class CustomSystem {
    Student studentHead;
    Courses coursesHead;

    // add new student
    public void addStudent(int id, Scanner scanner) {
        while (verifyStudent(id) || id <= 0) {
            if (id <= 0) {
                System.out.println("Student ID cannot be 0 or less than 0. Please enter a valid ID:");
            } else {
                System.out.println("Student ID already exists. Please enter a different ID:");
            }
            id = scanner.nextInt();
        }

        if (studentHead == null) {
            studentHead = new Student(id);
        } else {
            studentHead = new Student(id, studentHead);
        }
        System.out.println("Student with ID " + id + " added successfully.");
    }

    // add new course
    public void addCourse(int id, Scanner scanner) {
        while (verifyCourse(id) || id <= 0) {
            if (id <= 0) {
                System.out.println("Course ID cannot be 0. Please enter a valid ID:");
            } else {
                System.out.println("Course ID already exists. Please enter a different ID:");
            }
            id = scanner.nextInt();
        }

        if (coursesHead == null) {
            coursesHead = new Courses(id);
        } else {
            coursesHead = new Courses(id, coursesHead);
        }
        System.out.println("Course added successfully");
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
        if (studentHead == null) {// if there are not list ar there are wasnot students
            System.out.println("No students to remove.");
            return;
        }
        if (studentHead.studentId == id) {// if fint the student the frist student time complecsity O(1)
            studentHead = studentHead.nextStudent;
            System.out.println("removed student with id: " + id);
            return;
        }
        Student tmp = studentHead;
        while (tmp.nextStudent != null) {// to search about the student in the list
            if (tmp.nextStudent.studentId == id) {
                tmp.nextStudent = tmp.nextStudent.nextStudent;
                System.out.println("removed student with id: " + id);
                return;
            }
            tmp = tmp.nextStudent;
        }
        System.out.println("student not found");
    }

    // remove course
    public void removeCourse(int id) {
        if (coursesHead == null) { // if there are not list ar there are wasnot courses
            System.out.println("No courses to remove.");
            return;
        }
        if (studentHead.studentId == id) {// if fint the course the frist course time complecsity O(1)
            coursesHead = coursesHead.nextCourse;
            System.out.println("removed course with id: " + id); 
            return;
        }
        Courses tmp = coursesHead;
        while (tmp.nextCourse != null) {// to search about the course in the list
            if (tmp.nextCourse.courseId == id) {
                tmp.nextCourse = tmp.nextCourse.nextCourse;
                System.out.println("removed course with id: " + id);
                return;
            }
            tmp = tmp.nextCourse;
        }
        System.out.println("course not found");
    }

    // Verify Student id
    public boolean verifyStudent(int id) {
        Student tmp = studentHead;
        while (tmp != null) {
            if (tmp.studentId == id) {
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
            if (tmp.courseId == id ) {
                return true;
            }
            tmp = tmp.nextCourse;
        }
        return false;
    }
//list student courses 
    public void listCoursesByStudent(int studentID) {
        if (!verifyStudent(studentID)) {
            System.out.println("Student with ID " + studentID + " does not exist.");
            return;
        }

        Student s = studentHead;
        while (s != null && s.studentId != studentID)
            s = s.nextStudent;

        if (s != null && s.studentCourses != null) {
            System.out.println("Courses for student " + studentID + ": ");
            s.studentCourses.count();
        } else {
            System.out.println("No courses found for student " + studentID);
        }
    }

    // enroll function
    public void enrollStudent(int studentID, int courseID) {
        if (!verifyStudent(studentID)) {
            System.out.println("Student with ID " + studentID + " does not exist.");
            return;
        }
        if (!verifyCourse(courseID)) {
            System.out.println("Course with ID " + courseID + " does not exist.");
            return;
        }

        Student s = studentHead;
        while (s != null && s.studentId != studentID)
            s = s.nextStudent;

        Courses c = coursesHead;
        while (c != null && c.courseId != courseID)
            c = c.nextCourse;

        if (s != null && c != null) {
            // Check for duplicate enrollment
            if (s.studentCourses != null && s.studentCourses.contains(courseID)) {
                System.out.println("Student is already enrolled in this course.");
                return;
            }

            // Check max courses per student
            int studentCoursesCount = (s.studentCourses != null) ? s.studentCourses.count() : 0;
            if (studentCoursesCount >= 7) {
                System.out.println("Student already enrolled in 7 courses. Cannot enroll more.");
                return;
            }

            // Check max students per course
            int courseStudentsCount = (c.courseStudents != null) ? c.courseStudents.count() : 0;
            if (courseStudentsCount >= 30) {
                System.out.println("Course is full. Maximum 30 students allowed.");
                return;
            }

            // If all good, enroll
            s.addCourse(courseID);
            c.addStudent(studentID);
            System.out.println("Student " + studentID + " enrolled in course " + courseID);
        }
    }

}