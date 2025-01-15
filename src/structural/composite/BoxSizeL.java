package structural.composite;

public class BoxSizeL extends Box {

  public BoxSizeL(double width, double height) {
    super(width, height);
    if (width < 200 || height < 100) {
      throw new IllegalArgumentException(
          "Width must be at least 200 and height must be at least 100");
    }
  }


}
