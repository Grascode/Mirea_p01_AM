package homework1;

public class Gardener {
    public void filter(Plant plant){
        String plantName = plant.getName();
            plantName = plantName.replaceAll("[eyuioa]", "") + "VGTBL";
        plant.setName(plantName);
    }
}
