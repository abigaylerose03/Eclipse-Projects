public class Truck extends Vehicle {
  private double payload;
  private int towingCapacity;
  
  public Truck(String newManufacturer, int newCylinder, String newOwner, double newPayload, int newTowingCapacity) {
	  super(newManufacturer, newCylinder , newOwner);
	 
  }
  
  Truck() {
	  this.manufacturer = manufacturer;
	  this.cylinders = cylinders;
	  this.owner = owner;
	  this.payload = payload;
	  this.towingCapacity = towingCapacity;
  }


  public void setTruck(double payload2, int towingCapacity2) {
      this.payload = payload2;
      this.towingCapacity = towingCapacity2;
  }
  
  public String getTruck() {
	  return this.manufacturer;
  }
  
    public String toString() {
      return String.format("%s, %d, %s, %f, %d", manufacturer, cylinders, owner, payload, towingCapacity);
  }
  
   public boolean equals(Object other) {
     boolean equal = false;
      if (other instanceof Truck) {
         Truck vehicle = (Truck)other;
         equal = (vehicle.payload == payload &&
                  vehicle.towingCapacity == towingCapacity);
      }
      return equal;
  }
  
 
	public static void main(String[] args) {
	    Truck truck1 = new Truck("cloudnine", 3, "abby", 3.0, 2);
	    Truck truck2 = new Truck();
	    Truck truck3 = new Truck("cloudnine", 5, "natalie", 8.5, 9);
	    
	    truck2.setTruck(5.2, 6);
	    
	    System.out.println(truck1.equals(truck2)); // false
	    System.out.println(truck1.equals(truck3)); // true
	    
	    System.out.println(truck1.toString());
	    System.out.println(truck2.toString());
	    System.out.println(truck3.toString());
	    
	    System.out.println(truck3.getTruck());
    
	}
}
