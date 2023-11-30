package org.alenapech;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream o1, Stream o2) {
        return (new Integer(o1.getStudentGroups().size()))
                .compareTo(new Integer(o2.getStudentGroups().size()));
    }
}
