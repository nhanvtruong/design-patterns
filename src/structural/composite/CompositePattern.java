package structural.composite;

import java.util.logging.Logger;

public class CompositePattern {

  private static final Logger log = Logger.getLogger(CompositePattern.class.getName());

  public static void main(String[] args) {
    
    BoxSizeL boxSizeL = new BoxSizeL(2500,1500);
    boxSizeL.addComponent(new Product("Laptop", 1200));
    boxSizeL.addComponent(new Product("Mobile", 1000));
    boxSizeL.addComponent(new Product("Tablet", 2000));
    log.info(String.valueOf(boxSizeL.calculatePrice()));
    
    BoxSizeS smartWidgetBox = new BoxSizeS(100,50);
    smartWidgetBox.addComponent(new Product("Mouse", 200));
    smartWidgetBox.addComponent(new Product("Earphone", 300));
    log.info(String.valueOf(smartWidgetBox.calculatePrice()));

    BoxSizeS organicFoodBox = new BoxSizeS(100,50);
    organicFoodBox.addComponent(new Product("Banana", 20));
    organicFoodBox.addComponent(new Product("Apple", 15));
    log.info(String.valueOf(organicFoodBox.calculatePrice()));

    boxSizeL.addComponent(smartWidgetBox);
    boxSizeL.addComponent(organicFoodBox);
    log.info(String.valueOf(boxSizeL.calculatePrice()));

  }

}
