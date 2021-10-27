package data.crossing;

import java.util.List;
import java.util.Set;

public class Dataset {
    private List<String> attributes;
    private Set<String[]> data;

    public Dataset(List<String> attributes, Set<String[]> data) {
        this.attributes = attributes;
        this.data = data;
    }

    public List<String> getAttributes() {
        return attributes;
    }

    public Set<String[]> getData() {
        return data;
    }
}
