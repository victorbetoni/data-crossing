package data.crossing;

import java.io.File;

public abstract class DatasetLoader {
    protected File file;

    public DatasetLoader(File file) {
        this.file = file;
    }

    public abstract Dataset load();
}
