package creational.builder;
/**
 * The one who actually do the real work :)
 */
public class HouseBuilder implements HouseArchitect {

  private final House house;

  public HouseBuilder() {
    this.house = new House();
  }

  @Override
  public HouseArchitect buildWalls(int walls) {
    house.setWalls(walls);
    return this;
  }

  @Override
  public HouseArchitect buildRoof(String roofType) {
    house.setRoofType(roofType);
    return this;
  }

  @Override
  public HouseArchitect buildFloor(String floorType) {
    house.setFloorType(floorType);
    return this;
  }

  @Override
  public HouseArchitect buildDoors(int doors) {
    house.setDoors(doors);
    return this;
  }

  @Override
  public House build() {
    return house;
  }
}
