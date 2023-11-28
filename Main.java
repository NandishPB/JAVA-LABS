public class Main{
    public static String getcardetails(String brand , String Model){
        return "Car: "+ brand +" "+ Model;
    }
    public static void main(String[] args){
        String cardetails = getcardetails("Toyota" , "corolle");
        System.out.println(cardetails);
    }
}