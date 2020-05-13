package BuildingModule;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Building {
    String buildingName;

    public Building(String buildingName) {
        this.buildingName = buildingName;
    }

    Logger logger = LogManager.getLogger();

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


    public void describe() {
        for (int i = 0; i < roomsInBuilding.size(); i++) {

            logger.info(" " + roomsInBuilding.get(i).getRoomName() + ": " + describeLuminocity(i) + describeArea(i));

        }

    }

//    public void describeRoom(int i) {
//
//        describeLuminocity(i);
//        describeArea(i);
//        describefurniture(i);
//    }

    private String describeLuminocity(int i) {
        String descriptionOfLuminocity = ("Luminocity = " + roomsInBuilding.get(i).calcOverallLuminosity() + "(" + roomsInBuilding.get(i).getNumberOfWindows()
                + " windows, 700 lux each, " + "Lamps:" + roomsInBuilding.get(i).createTextEachLampLuminocity() + ")");
        return descriptionOfLuminocity;
    }

    private String describeArea(int i) {
        return
    }

    private void describefurniture(int i) {
    }


}
