package creational.builder;

public class BuilderPattern {

  public static void main(String[] args) {
    HouseArchitect superArchitect = new HouseBuilder();
    House house = superArchitect.buildDoors(20)
        .buildFloor("wooden floor")
        .buildRoof("sunpower")
        .buildWalls(4)
        .build();
    System.out.println(house);
  }

}
