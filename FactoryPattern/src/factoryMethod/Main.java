package factoryMethod;

public class Main {
  public static void main(String[] args) {
    VehicleStore vnStore = new VietNamStore();
    VehicleStore thaiStore = new ThaiLandStore();
    Vehicle vehicle = vnStore.orderVehicle(VehicleType.TRUCK);
    Vehicle vehicle2 = vnStore.orderVehicle(VehicleType.BIKE);
    Vehicle vehicle3 = thaiStore.orderVehicle(VehicleType.TRUCK);
    Vehicle vehicle4 = thaiStore.orderVehicle(VehicleType.BIKE);


  }
}