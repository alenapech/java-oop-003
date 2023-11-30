package org.alenapech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(3, "132", "21", "4");
        Student student2 = new Student(2, "132", "21", "4");
        Student student3 = new Student(1, "132", "21", "4");
        Student student4 = new Student(4, "0132", "21", "4");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        StudentGroup studentGroup1 = new StudentGroup(students);
        StudentGroup studentGroup2 = new StudentGroup(Collections.emptyList());
        StudentGroup studentGroup3 = new StudentGroup(Collections.emptyList());
        StudentGroup studentGroup4 = new StudentGroup(Collections.emptyList());
        StudentGroup studentGroup5 = new StudentGroup(Collections.emptyList());
        StudentGroup studentGroup6 = new StudentGroup(Collections.emptyList());
        StudentGroup studentGroup7 = new StudentGroup(Collections.emptyList());
        StudentGroup studentGroup8 = new StudentGroup(Collections.emptyList());

        List<Stream> streams = new ArrayList();
        Stream stream1 = new Stream();
        stream1.addStudentGroup(studentGroup1);
        stream1.addStudentGroup(studentGroup2);
        stream1.addStudentGroup(studentGroup3);
        stream1.addStudentGroup(studentGroup4);
        stream1.addStudentGroup(studentGroup5);
        Stream stream2 = new Stream();
        stream2.addStudentGroup(studentGroup6);
        stream2.addStudentGroup(studentGroup7);
        Stream stream3 = new Stream();
        stream3.addStudentGroup(studentGroup8);
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        StudentGroupService service = new StudentGroupService(studentGroup1);
        StreamService streamService = new StreamService(streams);

        for (Student student : studentGroup1) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroup()) {
            System.out.println(student);
        }
        System.out.println();
        for (Student student : service.getSortedStudentGroupByFIO()) {
            System.out.println(student);
        }
        System.out.println("=HomeWork=");
        for (Stream stream : streams) {
            System.out.println(stream);
        }
        System.out.println();
        for (Stream stream : streamService.getSortedStreams()) {
            System.out.println(stream);
        }
    }
}