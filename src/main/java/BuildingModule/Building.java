package BuildingModule;

import java.util.ArrayList;
import java.util.List;

public class Building {
    String buildingName;

    public Building(String buildingName) {
        this.buildingName = buildingName;
    }

    private List<Room> roomsInBuilding = new ArrayList<Room>();


    public void addRoom(String roomName, int roomArea, int numberOfWindows) {
        roomsInBuilding.add(new Room(roomName, roomArea, numberOfWindows));
    }

    public void showAllRooms() {
        for (Room room : roomsInBuilding) {
            System.out.println(room);
        }

    }

    public Room getRoom(String RoomName) {
        for (Room room : roomsInBuilding) {
            if (room.getRoomName().equals(RoomName)) {
                return room;
            }
        }
        return null;
    }

    public void describe(){

    }
}
