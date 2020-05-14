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

    public String getFurnitureName() {
        return furnitureName;
    }

    public String getTextFurnitureArea() {
        String textFurnitureArea=String.valueOf(furnitureArea);
        return textFurnitureArea;
    }

    public String getTextFurnitureMinArea() {
        String textFurnitureMinArea=String.valueOf(furnitureMinArea);
        return textFurnitureMinArea;
    }

    public String getTextFurnitureMaxArea() {
        String textFurnitureMaxArea=String.valueOf(furnitureMaxArea);
        return textFurnitureMaxArea;
    }
}
