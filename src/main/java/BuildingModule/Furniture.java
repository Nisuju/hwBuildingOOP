package BuildingModule;

public abstract class Furniture implements Stuff {
    String furnitureName;
    int furnitureArea;
    int furnitureMinArea;
    int furnitureMaxArea;

    public Furniture(String furnitureName, int furnitureArea) {
        this.furnitureName = furnitureName;
        this.furnitureArea = furnitureArea;
    }

    public Furniture(String furnitureName, int furnitureMinArea, int furnitureMaxArea) {
        this.furnitureName = furnitureName;
        this.furnitureMinArea = furnitureMinArea;
        this.furnitureMaxArea = furnitureMaxArea;
    }
}
