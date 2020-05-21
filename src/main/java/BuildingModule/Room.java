package BuildingModule;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String roomName;
    private int roomArea;
    private int numberOfWindows;
    private List<Lamp> lampsInRoom = new ArrayList<Lamp>();
    private List<Furniture> furnituresinRoom = new ArrayList<Furniture>();

    public Room(String roomName, int roomArea, int numberOfWindows) {
        this.roomName = roomName;
        this.roomArea = roomArea;
        this.numberOfWindows = numberOfWindows;
    }




    public String getRoomName() {
        return roomName;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public int getRoomArea() {
        return roomArea;
    }

    public void add(Lamp lamp) throws IlluminanceTooMuchException, IlluminanceTooFewException {
        if (calcOverallLuminosity() > 4000) {
            throw new IlluminanceTooMuchException("IlluminanceTooMuchException");// вот откуда берется текст для exeption по преподскому способу
        }
        if (calcOverallLuminosity() < 300) {
            throw new IlluminanceTooFewException("IlluminanceTooFewException");

        }
        lampsInRoom.add(lamp);
    }

    public void add(Furniture furniture) throws SpaceUsageTooMuchException {
        if (calcFreeAreaInPercent() <= 70) {
            throw new SpaceUsageTooMuchException();
        }
        furnituresinRoom.add(furniture);
    }

    public int calcLampsLuminosity() {
        int lampsLuminosity = 0;
        for (int i = 0; i < lampsInRoom.size(); i++) {
            lampsLuminosity = lampsLuminosity + lampsInRoom.get(i).getLuminosity();

        }
        return lampsLuminosity;

    }

    public String createTextEachLampLuminocity() {
        String textEachLampLuminocity = "";
        for (int i = 0; i < lampsInRoom.size(); i++) {
            textEachLampLuminocity = textEachLampLuminocity + " " + String.valueOf(lampsInRoom.get(i).getLuminosity() + " lux");

        }
        return textEachLampLuminocity;

    }

    public String createTextEachFurnitureDescription() {
        String textEachFurnitureDescription = "";
        for (int i = 0; i < furnituresinRoom.size(); i++) {
            textEachFurnitureDescription = textEachFurnitureDescription + " " + furnituresinRoom.get(i).getFurnitureName()
                    + "(" + createTextForFurnuturesDescription(i) + ")";

        }
        return textEachFurnitureDescription;
    }

    public String createTextForFurnuturesDescription(int i) {
        String textForFurnuturesEachArea = "";

        if (furnituresinRoom.get(i).furnitureArea == 0) {
            textForFurnuturesEachArea = textForFurnuturesEachArea + " from " + furnituresinRoom.get(i).getTextFurnitureMinArea() + "m^2" +
                    " up to " + furnituresinRoom.get(i).getTextFurnitureMaxArea() + "m^2";
        } else {
            textForFurnuturesEachArea = textForFurnuturesEachArea + " " + furnituresinRoom.get(i).getTextFurnitureArea() + "m^2";

        }

        return textForFurnuturesEachArea;
    }

    public int calcOverallLuminosity() {
        int overallLuminosity = numberOfWindows * 700 + calcLampsLuminosity();
        return overallLuminosity;
    }

    public int calcOccupiedArea() {
        int occupiedArea = 0;
        for (int i = 0; i < furnituresinRoom.size(); i++) {
            occupiedArea = occupiedArea + furnituresinRoom.get(i).furnitureArea;

        }
        for (int i = 0; i < furnituresinRoom.size(); i++) {
            occupiedArea = occupiedArea + furnituresinRoom.get(i).furnitureMaxArea;

        }
        return occupiedArea;
    }

    public int calcFreeArea() {
        int freeArea = roomArea - calcOccupiedArea();
        return freeArea;
    }

    public float calcFreeAreaInPercent() {
        float freeAreaInPercent = (float) calcFreeArea() / (float) roomArea;
        freeAreaInPercent = freeAreaInPercent * 100;
        return freeAreaInPercent;
    }


    @Override
    public String toString() {
        return "Room{" +
                "roomName='" + roomName + '\'' +
                ", roomArea=" + roomArea +
                ", numberOfWindows=" + numberOfWindows +
                '}';
    }


}
