package BuildingModule;

public class Chair extends Furniture {

    public Chair(String furnitureName, int furnitureArea) {
        super(furnitureName, furnitureArea);
    }

    public Chair(String furnitureName, int furnitureMinArea, int furnitureMaxArea) {
        super(furnitureName, furnitureMinArea, furnitureMaxArea);
    }
}
