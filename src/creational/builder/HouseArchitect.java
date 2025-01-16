package creational.builder;

public interface HouseArchitect {

  HouseArchitect buildWalls(int walls);

  HouseArchitect buildRoof(String roofType);

  HouseArchitect buildFloor(String floorType);

  HouseArchitect buildDoors(int square);

  House build();

}
