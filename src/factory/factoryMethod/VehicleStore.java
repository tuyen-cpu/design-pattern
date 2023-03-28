package factory.factoryMethod;

public abstract class VehicleStore {
public Vehicle orderVehicle(VehicleType type){
  Vehicle vehicle = callVehicle(type);
  vehicle.prepare();
  return vehicle;
}
protected abstract Vehicle callVehicle(VehicleType type);
}
