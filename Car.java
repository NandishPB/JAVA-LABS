class Car1{
    private String brand;
    private String model;
    
    public Car1(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    public String getdetails(){
        return "Car:"+brand +""+model;
    }
}
    public class Car{
    public static void main(String[] args){
          Car1 myCar =new Car1("Toyota","corolle");
          String cardetails = myCar.getdetails();
          System.out.println(cardetails);
    }
    
}
