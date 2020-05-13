package BuildingModule;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String roomName;
    private int roomArea;
    private int numberOfWindows;

    public Room(String roomName, int roomArea, int numberOfWindows) {
        this.roomName = roomName;
        this.roomArea = roomArea;
        this.numberOfWindows = numberOfWindows;
    }

    private List<Lamp> lampsInRoom = new ArrayList<Lamp>();
   private List<Furniture> furnituresinRoom = new ArrayList<Furniture>();


    public String getRoomName() {
        return roomName;
    }

    public void add(Lamp lamp) {
        lampsInRoom.add(lamp);
    }

    public void add(Furniture furniture) {
        furnituresinRoom.add(furniture);
    }

    public int calcLampsLuminosity() {
        int lampsLuminosity = 0;
        for (int i = 0; i < lampsInRoom.size(); i++) {
            lampsLuminosity = lampsLuminosity + lampsInRoom.get(i).luminosity;

        }
        return lampsLuminosity;

    }

    public int calcOverallLuminosity() {
        int overallLuminosity = numberOfWindows * 700 + calcLampsLuminosity();
        return overallLuminosity;
    }
    public int calcOccupiedArea(){
        int occupiedArea=0;
        for(int i=0; i<furnituresinRoom.size();i++){
            occupiedArea=occupiedArea+furnituresinRoom.get(i).furnitureArea;

        }
        for(int i=0; i<furnituresinRoom.size();i++){
            occupiedArea=occupiedArea+furnituresinRoom.get(i).furnitureMaxArea;

        }
        return occupiedArea;
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
