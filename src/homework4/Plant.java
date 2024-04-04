package homework4;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Plant implements Externalizable {

    private String name;

    private String color;

    private Boolean isHome;

    private Boolean isStinky;

    private int age;

    public void setHome(Boolean home) {
        isHome = home;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHome(String home) {
         isHome = home.equalsIgnoreCase("да");
    }

    public void setStinky(Boolean stinky) {
        isStinky = stinky;
    }

    public void setStinky(String stinky) {
        isStinky = stinky.equalsIgnoreCase("да");
    }

    public Plant() {
    }

    public Plant(String name, String color, Boolean isHome, Boolean isStinky, int age) {
        this.name = name;
        this.color = color;
        this.isHome = isHome;
        this.isStinky = isStinky;
        this.age = age;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.name);
        out.writeObject(this.color);
        out.writeObject(this.isHome);
        out.writeObject(this.isStinky);
        out.writeObject(this.age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = (String) in.readObject();
        this.color = (String) in.readObject();
        this.isHome = (Boolean) in.readObject();
        this.isStinky = (Boolean) in.readObject();
        this.age = (Integer) in.readObject();
    }
}