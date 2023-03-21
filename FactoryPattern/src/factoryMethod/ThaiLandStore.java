package factoryMethod;

public class ThaiLandStore extends VehicleStore{
  @Override
  protected Vehicle callVehicle(VehicleType type) {
    if(type.equals(VehicleType.BIKE)){
      return new ThaiStyleBike();
    }else if(type.equals(VehicleType.TRUCK)){
      return new ThaiStyleTruck();
    }else return null;
  }
}
