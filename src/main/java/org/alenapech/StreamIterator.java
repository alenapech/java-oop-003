package org.alenapech;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup>  {
    private final List<StudentGroup> groups;

    private int counter;

    public StreamIterator(Stream stream) {
        this.groups = stream.getStudentGroups();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter <= groups.size() - 1;
    }

    @Override
    public StudentGroup next() {
        if (hasNext()) {
            return groups.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        groups.remove(counter);
        counter--;
    }
}
