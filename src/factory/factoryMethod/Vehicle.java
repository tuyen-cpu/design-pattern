package factory.factoryMethod;

public abstract class Vehicle {
   String name;
   String speed;

  public void prepare(){
    System.out.println("Prepare: "+ name);
  }

  public String getName() {
    return name;
  }

  public String getSpeed() {
    return speed;
  }
}
