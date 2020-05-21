package BuildingModule;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private String buildingName;
    private List<Room> roomsInBuilding = new ArrayList<Room>();
    Logger logger = LogManager.getLogger();

    public Building(String buildingName) {
        this.buildingName = buildingName;
    }



    public String getBuildingName() {
        return buildingName;
    }




    public void addRoom(String roomName, int roomArea, int numberOfWindows) throws IlluminanceTooMuchException {
        roomsInBuilding.add(new Room(roomName, roomArea, numberOfWindows));

        if (getRoom(roomName).calcOverallLuminosity() > 4000) {
            throw new IlluminanceTooMuchException();
        }
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
        String texttDescriptionOfRooms = "";

        for (int i = 0; i < roomsInBuilding.size(); i++) {
            texttDescriptionOfRooms = texttDescriptionOfRooms + ". " + getBuildingName() + " " + roomsInBuilding.get(i).getRoomName() + ": " + describeLuminocity(i) +
                    describeArea(i);

        }
        logger.info(texttDescriptionOfRooms);

    }


    private String describeLuminocity(int i) {
        String descriptionOfLuminocity = ("Luminocity = " + roomsInBuilding.get(i).calcOverallLuminosity() + "(" + roomsInBuilding.get(i).getNumberOfWindows()
                + " windows, 700 lux each, " + "Lamps:" + roomsInBuilding.get(i).createTextEachLampLuminocity() + ")");
        return descriptionOfLuminocity;
    }

    private String describeArea(int i) {
        String descriptionOfArea = (" Area: " + roomsInBuilding.get(i).getRoomArea() + "m^2 (" + roomsInBuilding.get(i).calcOccupiedArea() +
                " is occupied, " + roomsInBuilding.get(i).calcFreeArea() + "m^2 or " + roomsInBuilding.get(i).calcFreeAreaInPercent()
                + "% is free) " + "Furniture: " + " (" + roomsInBuilding.get(i).createTextEachFurnitureDescription()) + ")";
        return descriptionOfArea;
    }




}
