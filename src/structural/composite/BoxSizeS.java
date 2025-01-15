package structural.composite;

public class BoxSizeS extends Box {

  public BoxSizeS(double width, double height) {
    super(width, height);
    if (width >= 200 || height >= 100) {
      throw new IllegalArgumentException(
          "Box width and height must be less than 200 and less than 100");
    }
  }


}
