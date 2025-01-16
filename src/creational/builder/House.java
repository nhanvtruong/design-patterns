package creational.builder;

public class House {

  private int walls;

  private int doors;

  private String roofType;

  private String floorType;

  public House() {
  }

  public House(int walls, int doors, String roofType, String floorType) {
    this.walls = walls;
    this.doors = doors;
    this.roofType = roofType;
    this.floorType = floorType;
  }

  public int getWalls() {
    return walls;
  }

  public void setWalls(int walls) {
    this.walls = walls;
  }

  public int getDoors() {
    return doors;
  }

  public void setDoors(int doors) {
    this.doors = doors;
  }

  public String getRoofType() {
    return roofType;
  }

  public void setRoofType(String roofType) {
    this.roofType = roofType;
  }

  public String getFloorType() {
    return floorType;
  }

  public void setFloorType(String floorType) {
    this.floorType = floorType;
  }

  @Override
  public String toString() {
    StringBuilder houseDrawing = new StringBuilder();

    houseDrawing.append("   /\\   \n");
    houseDrawing.append("  /  \\  \n");
    houseDrawing.append(" /    \\ \n");
    houseDrawing.append("/      \\\n");

    int height = walls;
    houseDrawing.append("|      |\n".repeat(Math.max(0, height)));

    if (doors > 0) {
      houseDrawing.append("|  []  |\n"); // '[]' represents a door
    }

    return houseDrawing + "\nHouse{" +
        "walls=" + walls +
        ", doors=" + doors +
        ", roofType='" + roofType + '\'' +
        ", floorType='" + floorType + '\'' +
        '}';
  }
}
