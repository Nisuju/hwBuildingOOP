package BuildingModule;

public class Table extends Furniture {
    public Table(String furnitureName, int furnitureArea) {
        super(furnitureName, furnitureArea);
    }

    public Table(String furnitureName, int furnitureMinArea, int furnitureMaxArea) {
        super(furnitureName, furnitureMinArea, furnitureMaxArea);
    }
}
