package data.crossing.implementation.csv;

import data.crossing.Dataset;
import data.crossing.DatasetLoader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CSVDatasetLoader extends DatasetLoader {

    public CSVDatasetLoader(File file) {
        super(file);
    }

    public Dataset load() {
        Set<String[]> lines = new HashSet<>();
        List<String> attributes = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            boolean first = true;
            while ((line = reader.readLine()) != null) {
                if(first) {
                    attributes = Arrays.asList(line.split(";"));
                    first = false;
                    continue;
                }
                lines.add((String[]) Arrays.stream(line.split(";")).toArray());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Dataset(attributes, lines);
    }

}
