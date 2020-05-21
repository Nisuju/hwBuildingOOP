package BuildingModule;

public class Lamp implements Stuff {
    private int luminosity;

    public Lamp(int luminosity) {
        this.luminosity = luminosity;
    }

    public int getLuminosity() {
        return luminosity;
    }
}
