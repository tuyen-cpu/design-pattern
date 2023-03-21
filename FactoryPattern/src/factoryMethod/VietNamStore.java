package factoryMethod;

public class VietNamStore extends VehicleStore {
  @Override
  protected Vehicle callVehicle(VehicleType type) {
    if(type.equals(VehicleType.TRUCK)){
      return new VNStyleTruck();
    }else if(type.equals(VehicleType.BIKE)){
      return new VNStyleBike();
    }else return null;
  }
}
