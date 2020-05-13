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
    private List<Stuff> objectsInBuilding=new ArrayList<Stuff>();

    public String getRoomName() {
        return roomName;
    }
    public void add(Lamp lamp){
        objectsInBuilding.add(lamp);
    }
    public void add(Furniture furniture){
        objectsInBuilding.add(furniture);
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
