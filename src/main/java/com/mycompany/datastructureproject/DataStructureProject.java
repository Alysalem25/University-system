/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.datastructureproject;

import java.util.Scanner;
import java.util.Stack;

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
          // 2- addStudent(int studentID) => Adds a new student to the system (linked ✓
          // list).
          // => we need method to check if there are student with the same id or !=0
          // # add while loop when it invalid ✓
          // ------------------------
          // 3- addCourse(int courseID) => Adds a new course to the system (linked list).
          // ✓
          // we need method to check if there are course with the same id or !=0
          // add while loop when it invalid ✓
          // ------------------------
          // 4- removeStudent(int studentID) =>Removes a student from the system. ✓
          // check if student exists or not frist! ✓
          // ------------------------
          // 5- removeCourse(int courseID) => Removes a course from the system. ✓
          // check if course exists or not frist! ✓
          // ------------------------
          // 6- getLastStudentAdded() => Returns the ID of the last student added. ✓
          // Donot get the tail of the list he can sort before call the method
          // ------------------------
          // 7- getLastCourseAdded() => Returns the ID of the last course added. ✓
          // Donot get the tail of the list he can sort before call the method
          // ------------------------
          // 8- enrollStudent(int studentID, int courseID) => Enrolls a student in a ✓
          // course
          // (updates both lists).
          // check if course exists and student exists frist! ✓
          // ------------------------
          // 9- removeEnrollment(int studentID, int courseID) => Removes a student’s ✓
          // enrollment from a course.
          // check if course exists and student exists frist!
          // ------------------------
          // 10- listCoursesByStudent(int studentID) => Displays all courses a student is
          // ✓
          // enrolled in. from the studentCourses in Student class
          // ------------------------
          // 11- listStudentsByCourse(int courseID) => Displays all students enrolled in a
          // ✓
          // course. from the courseStudents in Courses class
          // ------------------------
          // 12- sortStudentsByID(int courseID) => Sorts the list of students in ascending
          // order by ID.
          // ------------------------
          // 13- sortCoursesByID(int studentID) => Sorts the list of courses in ascending
          // order by ID.
          // ------------------------
          // 14- isfullCourse(int courseID) => Checks if a course if complete or not. ✓
          // ------------------------
          // 15- isnormalstudent(int courseID) => Checks if a student registers 2-7 ✓
          // courses or
          // not from the studentCourses in Student class ✓
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
            System.out.println("=======================================================================");
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
            System.out.println("19- undo");
            System.out.println("20- redo");
            System.out.println("21- Exit");
            System.out.println("Please enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter student ID: ");
                    int studentId = scanner.nextInt();
                    system.addStudent(studentId);
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
                    system.removeCourse(removeCourseId);
                    break;
                case 5:
                    system.getLastStudentAdded();
                    break;
                case 6:
                    system.getLastCourseAdded();
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
                    system.removeEnrollment(unenrollStudentId, unenrollCourseId);
                    break;
                case 9:
                    System.out.println("Enter student ID to list courses: ");
                    int listCoursesStudentId = scanner.nextInt();
                    system.listCoursesByStudent(listCoursesStudentId);
                    break;
                case 10:
                    System.out.println("Enter course ID to list students: ");
                    int listStudentsCourseId = scanner.nextInt();
                    system.listStudentsByCourse(listStudentsCourseId);
                    break;
                case 11:
                    System.out.println("Enter course ID to sort students by ID: ");
                    int sortStudentsCourseId = scanner.nextInt();
                    system.sortStudentsByID(sortStudentsCourseId);
                    break;
                case 12:
                System.out.println("Enter student ID to sort courses by ID: ");
                int sortCoursesStudentId = scanner.nextInt();
                system.sortCoursesByID(sortCoursesStudentId);
                break;
                case 13:
                    System.out.println("Enter course ID to check if it is full: ");
                    int courseID = scanner.nextInt();
                    system.isfullCourse(courseID);
                    break;
                case 14:
                    System.out.println("Enter student ID to check if normal: ");
                    int studentID = scanner.nextInt();
                    system.isnormalstudent(studentID);
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
                    system.undo();
                    break;
                case 20:
                system.redo();
                break;
                case 21:
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
            courseStudents = new studentAndCourses(studentId, this.courseId); // Replace 0 with the appropriate courseId
                                                                              // if
        // available
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

    studentAndCourses(int studentId, int courseId) {
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

    int lastStudentId;
    int lastCourseId;

    Scanner scanner = new Scanner(System.in);
    Stack<String> undoStack = new Stack<>();
    Stack<String> redoStack = new Stack<>();

    // add new student
    public void addStudent(int id) {
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
        lastStudentId = id; // Update the last student ID
        undoStack.push(id + ":addStudent"); // Push the last student ID and action onto the stack

        System.out.println("Student with ID " + id + " added successfully.");
    }

    // add new course
    public void addCourse(int id) {
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
        lastCourseId = id; // Update the last course ID
        undoStack.push(id + ":addCourse"); // Push the last course ID and action onto the stack
        System.out.println("Course with ID :" + id + "  added successfully");

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

    // Display all courses
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
            undoStack.push(id + ":removeStudent"); // Push the last student ID and action onto the stack
            return;
        }
        Student tmp = studentHead;
        while (tmp.nextStudent != null) {// to search about the student in the list
            if (tmp.nextStudent.studentId == id) {
                tmp.nextStudent = tmp.nextStudent.nextStudent;
                System.out.println("removed student with id: " + id);
                undoStack.push(id + ":removeStudent"); // Push the last student ID and action onto the stack
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
            undoStack.push(id + ":removeCourse"); // Push the last course ID and action onto the stack
            return;
        }
        Courses tmp = coursesHead;
        while (tmp.nextCourse != null) {// to search about the course in the list
            if (tmp.nextCourse.courseId == id) {
                tmp.nextCourse = tmp.nextCourse.nextCourse;
                System.out.println("removed course with id: " + id);
                undoStack.push(id + ":removeCourse"); // Push the last course ID and action onto the stack
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
            if (tmp.courseId == id) {
                return true;
            }
            tmp = tmp.nextCourse;
        }
        return false;
    }

    // list student courses
    public void listCoursesByStudent(int studentID) {
        if (!verifyStudent(studentID)) {
            System.out.println("Student with ID " + studentID + " does not exist.");
            return;
        }

        Student s = studentHead;
        while (s != null && s.studentId != studentID)
            s = s.nextStudent;

        if (s != null && s.studentCourses != null) {
            System.out.println("Courses for student " + studentID + " : ");
            s.studentCourses.count();
        } else {
            System.out.println("No courses found for student " + studentID);
        }
    }

    // list course students
    public void listStudentsByCourse(int courseID) {
        if (!verifyCourse(courseID)) {
            System.out.println("Course with ID " + courseID + " doesn't exist.");
            return;
        }
        Courses c = coursesHead;
        while (c != null && c.courseId != courseID) {
            c = c.nextCourse;
        }
        if (c != null && c.courseStudents != null) {
            System.out.println("Students for course " + courseID + " : ");
            c.courseStudents.count();
        } else {
            System.out.println("No Students found for course " + courseID);
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
            undoStack.push(studentID + ":enrollStudent:" + courseID); // Push the last student ID and action onto the
                                                                      // stack
            System.out.println("Student " + studentID + " enrolled in course " + courseID);
        }
    }

    // remove enrollment fun
    public void removeEnrollment(int studentID, int courseID) {
        if (!verifyStudent(studentID)) {
            System.out.println("Student with ID " + studentID + " doesn't exist.");
            return;
        }

        if (!verifyCourse(courseID)) {
            System.out.println("Course with ID " + courseID + " doesn't exist.");
            return;
        }

        Student s = studentHead;
        while (s != null && s.studentId != studentID)
            s = s.nextStudent;

        Courses c = coursesHead;
        while (c != null && c.courseId != courseID)
            c = c.nextCourse;

        if (s != null && s.studentCourses != null) {
            s.studentCourses = removeFromList(s.studentCourses, courseID);
        }

        if (c != null && c.courseStudents != null) {
            c.courseStudents = removeFromList(c.courseStudents, studentID);
        }
        undoStack.push(studentID + ":removeEnrollment:" + courseID); // Push the last student ID and action onto the
                                                                     // stack
        System.out.println("Enrollment of student " + studentID + " removed from course " + courseID + ".");
    }

    // remove node function
    private studentAndCourses removeFromList(studentAndCourses head, int id) {
        if (head == null)
            return null;

        if (head.id == id) {
            return head.next;
        }

        studentAndCourses current = head;
        while (current.next != null) {
            if (current.next.id == id) {
                current.next = current.next.next;
                return head;
            }
            current = current.next;
        }

        return head;
    }

    // to check if the course complete or not
    public boolean isfullCourse(int courseID) {
        Courses tmp = coursesHead;

        while (tmp != null) {
            if (tmp.courseId == courseID) {
                int studentCount = tmp.courseStudents != null ? tmp.courseStudents.count() : 0;

                if (studentCount >= 20 && studentCount <= 30) {
                    System.out.println("Course " + courseID + " has a valid number of students: " + studentCount);
                    return false;
                } else if (studentCount < 20) {
                    System.out.println("Course " + courseID + " has less than 20 students enrolled.");
                    return false;
                } else {
                    System.out.println("Course " + courseID + " is overfilled. More than 30 students enrolled.");
                    return true;
                }
            }
            tmp = tmp.nextCourse;
        }

        System.out.println("Course with ID " + courseID + " not found.");
        return false;
    }

    public boolean isnormalstudent(int studentID) {
        Student tmp = studentHead;
        while (tmp != null) {
            if (tmp.studentId == studentID) {
                int courseCount = tmp.studentCourses != null ? tmp.studentCourses.count() : 0;
                if (courseCount >= 2 && courseCount <= 7) {
                    System.out.println(
                            "Student " + studentID + " enrolled in " + courseCount + " course(s): Normal student");
                    return true;
                } else {
                    System.out.println("Student " + studentID + " enrolled in " + courseCount
                            + " course(s): Not a normal student");
                    return false;
                }
            }
            tmp = tmp.nextStudent;
        }

        System.out.println("Student with ID " + studentID + " not found.");
        return false;
    }

    // GetLastStudent
    public void getLastStudentAdded() {
        // if (studentHead == null) {
        // System.out.println("No added students yet.");
        // return -1;
        // }
        // return studentHead.studentId;

        while (studentHead != null) {
            if (studentHead.studentId == lastStudentId) {
                System.out.println("Last student added: " + studentHead.studentId);
                return;
            }
            studentHead = studentHead.nextStudent;
        }
        System.out.println("Student wasn't add yet.");
    }

    // GetLastCourse
    public void getLastCourseAdded() {
        // if (coursesHead == null) {
        // System.out.println("No added courses yet.");
        // return -1;
        // }
        // return coursesHead.courseId;

        while (coursesHead != null) {
            if (coursesHead.courseId == lastCourseId) {
                System.out.println("Last course added: " + coursesHead.courseId);
                return;

            }
            coursesHead = coursesHead.nextCourse;
        }
        System.out.println("Course wasn't add yet.");

    }

    // undo
    public void undo() {
        String undoAction = (String) undoStack.pop();
        String[] parts = undoAction.split(":");

        int id = Integer.parseInt(parts[0]); // Convert id to int
        String action = parts[1];

        System.out.println("Student ID: " + id);
        System.out.println("Action: " + action);

        if (action.equals("addStudent")) {
            // Remove the student
            removeStudent(id);
            String idToString = String.valueOf(id);
            redoStack.push(idToString + ":addStudent");
        } else if (action.equals("addCourse")) {
            // Remove the course
            removeCourse(id);
            String idToString = String.valueOf(id);
            redoStack.push(idToString + ":addCourse");
        } else if (action.equals("enrollStudent")) {
            // Unenroll the student from the course
            removeEnrollment(id, Integer.parseInt(parts[2]));
            String idToString = String.valueOf(id);
            redoStack.push(idToString + ":enrollStudent:" + parts[2]);
        } else if (action.equals("removeEnrollment")) {
            // Re-enroll the student in the course
            enrollStudent(id, Integer.parseInt(parts[2]));
            String idToString = String.valueOf(id);
            redoStack.push(idToString + ":removeEnrollment:" + parts[2]);
        } else if (action.equals("removeStudent")) {
            // Add the student back
            addStudent(id);
            String idToString = String.valueOf(id);
            redoStack.push(idToString + ":removeStudent");
        } else if (action.equals("removeCourse")) {
            // Add the course back
            addCourse(id);
            String idToString = String.valueOf(id);
            redoStack.push(idToString + ":removeCourse");
        } else {
            System.out.println("Unknown action: " + action);
        }

    }

    public void redo() {
        String redoAction = (String) redoStack.pop();
        String[] parts = redoAction.split(":");

        int id = Integer.parseInt(parts[0]); // Convert id to int
        String action = parts[1];

        if (action.equals("addStudent")) {
            // Add the student back
            addStudent(id);
        } else if (action.equals("addCourse")) {
            // Add the course back
            addCourse(id);
        } else if (action.equals("enrollStudent")) {
            // Re-enroll the student in the course
            enrollStudent(id, Integer.parseInt(parts[2]));
        } else if (action.equals("removeEnrollment")) {
            // Unenroll the student from the course
            removeEnrollment(id, Integer.parseInt(parts[2]));
        } else if (action.equals("removeStudent")) {
            // Remove the student again
            removeStudent(id);
        } else if (action.equals("removeCourse")) {
            // Remove the course again
            removeCourse(id);
        } else {
            System.out.println("Unknown action: " + action);
        }
    }

    // sort students by ID for a specific course
    public void sortStudentsByID(int courseID) {
        if (!verifyCourse(courseID)) {
            System.out.println("Course with ID " + courseID + " doesn't exist.");
            return;
        }
        Courses c = coursesHead;
        while (c != null && c.courseId != courseID) {
            c = c.nextCourse;
        }
        if (c == null || c.courseStudents == null) {
            System.out.println("No students found for course " + courseID);
            return;
        }
        c.courseStudents = insertionSort(c.courseStudents);
        System.out.println("Students sorted by ID for course " + courseID + ":");
        if (c.courseStudents != null) {
            c.courseStudents.count();
        }
    }

    public void sortCoursesByID(int studentID) {
        if (!verifyStudent(studentID)) {
            System.out.println("Student with ID " + studentID + " doesn't exist.");
            return;
        }

        // find the student
        Student s = studentHead;
        while (s != null && s.studentId != studentID) {
            s = s.nextStudent;
        }

        // check if student exist and have courses
        if (s == null || s.studentCourses == null) {
            System.out.println("No courses found for student " + studentID);
            return;
        }

        // dort the linked list of courses for this student using insertion sort
        s.studentCourses = insertionSort(s.studentCourses);

        System.out.println("Courses sorted by ID for student " + studentID + ":");
        if (s.studentCourses != null) {
            s.studentCourses.count();
        }
    }

    // insertion sortimplementation for student andCourses linked list
    public studentAndCourses insertionSort(studentAndCourses head) {
        studentAndCourses sortedList = null;

        studentAndCourses current = head;
        while (current != null) {
            studentAndCourses next = current.next;
            sortedList = sortedInsert(sortedList, current);

            current = next;
        }

        return sortedList;
    }

    public studentAndCourses sortedInsert(studentAndCourses sortedHead, studentAndCourses newNode) {
        newNode.next = null;

        if (sortedHead == null || sortedHead.id >= newNode.id) {
            newNode.next = sortedHead;
            return newNode;
        }

        studentAndCourses current = sortedHead;
        while (current.next != null && current.next.id < newNode.id) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        return sortedHead;
    }
}
