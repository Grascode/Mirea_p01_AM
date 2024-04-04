package homework4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Saver implements Runnable {
    private Plant plant;
    private String path;

    public Saver(Plant plant, String path) {
        this.plant = plant;
        this.path = path;
    }
    @Override
    public void run() {
        if(path != null && plant != null) {
            try {
                new File(path).createNewFile();
                FileOutputStream fos = new FileOutputStream(path);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                plant.writeExternal(oos);
                System.out.println("Serialization success");
            } catch (IOException exception) {
                System.out.println("The file doesn't exist");
            }
        }
    }
}