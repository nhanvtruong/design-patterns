import creational.factory.Logistics;
import creational.factory.RoadLogistic;
import creational.factory.SeaLogistic;

public class DesignPattern {

  public static void main(String[] args) {

    Logistics roadLogistic = new RoadLogistic();
    roadLogistic.deliver();
    Logistics seaLogistic = new SeaLogistic();
    seaLogistic.deliver();

  }

}
