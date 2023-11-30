package org.alenapech;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroups;
    private int counter;

    public Stream() {
        this.studentGroups = new ArrayList<>();
        this.counter = 0;
    }

    public Stream(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
        this.counter = 0;
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void addStudentGroup(StudentGroup studentGroup) {
        this.studentGroups.add(studentGroup);
        counter++;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    public void remove(StudentGroup group) {
        studentGroups.remove(group);
    }

    @Override
    public String toString() {
        return "Stream{" +
                "studentGroups=" + studentGroups +
                ", counter=" + counter +
                '}';
    }
}
