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
    private List<Stuff> objectsInRoom =new ArrayList<Stuff>();

    public String getRoomName() {
        return roomName;
    }
    public void add(Lamp lamp){
        objectsInRoom.add(lamp);
    }
    public void add(Furniture furniture){
        objectsInRoom.add(furniture);
    }

    public int calcLampsLuminosity(){
        int lampsLuminosity=0;
        for(int i=0;i<objectsInRoom.size();i++){
            if ()
        }


    }
    public int calcOverallLuminosity(){
        int overallLuminosity= numberOfWindows*700+
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
