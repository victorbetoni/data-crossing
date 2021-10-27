package data.crossing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Dataset {
    private Set<DatasetInstance> instances = new HashSet<>();
    private List<String> attributes;
    private Set<String[]> rawData;

    public Dataset(List<String> attributes, Set<String[]> data) {
        data.forEach(dataArray -> {
            Map<Integer, String> indexed = new HashMap<>();
            Map<String, String> literal = new HashMap<>();
            for (int i = 0; i < dataArray.length; i++) {
                indexed.put(i, dataArray[i]);
                literal.put(attributes.get(i), dataArray[i]);
                instances.add(new DatasetInstance(literal, indexed));

            }
        });
    }

    public List<String> getAttributes() {
        return attributes;
    }

    public Set<String[]> getRawData() {
        return rawData;
    }
}
