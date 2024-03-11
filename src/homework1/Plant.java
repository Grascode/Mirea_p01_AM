package homework1;

public class Plant {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plant(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return name + " thisName";
    }
}
