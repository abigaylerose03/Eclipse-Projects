public class Vehicle
{
  protected String manufacturer;
  protected int cylinders;
  protected String owner;
  
  /*
    TO DO:
    Create a 3 arg constructor that accepts the variables in the order listed above.
   
    Create a default constructor that calls the 3 arg using this.
    Create setters and getters drawing on the names of the variables used above.
    (In other words you have no choice for the names of your setters and getters)
    
    Create a toString method that displays all the instance data.
    Create an equals method that compares only manufacturer and cylinders.
  */
   public Vehicle(String newManufacturer, int newCylinder, String newOwner) {
      manufacturer = newManufacturer;
      cylinders = newCylinder;
      owner = newOwner;
  }
  
  public Vehicle() {
      this.manufacturer = manufacturer;
      this.cylinders = cylinders;
      this.owner = owner;
  }
  
  
   public void setVehicle(String manufacturer2, int cylinders2, String owner2) {
      manufacturer = manufacturer2;
      cylinders = cylinders2;
     owner = owner2;
  }
  
 
  public String getVehicle() {
     return manufacturer;
     
  }
  
  public String toString() {
      return String.format("%s, %d, %s", manufacturer, cylinders, owner);
  }
  
  public boolean equals(Object other) {
     boolean equal = false;
      if (other instanceof Vehicle) {
         Vehicle vehicle = (Vehicle)other;
         equal = (vehicle.manufacturer == manufacturer &&
                  vehicle.cylinders == cylinders);
      }
      return equal;
  }
}
