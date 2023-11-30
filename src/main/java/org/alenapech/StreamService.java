package org.alenapech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {

    private List<Stream> streams;

    public StreamService(List<Stream> streams) {
        this.streams = streams;
    }

    public List<Stream> getSortedStreams() {
        List<Stream> streams1 = new ArrayList<>(streams);
        streams1.sort(new StreamComparator());
        return streams1;
    }

}
