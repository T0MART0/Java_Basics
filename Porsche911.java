package cars

import cars.*

public class Porsche911 extends cars {
  private String wing;

  // constructor
  public Porsche911(String plate, Wheel wheel, Horn horn, String wing) {
    super(plate, wheel, horn);
    this.wing = wing;
  }

  // Override method 以后学
  
}
