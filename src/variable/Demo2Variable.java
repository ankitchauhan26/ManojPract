package variable;

public class Demo2Variable {
    public static void main(String[] args){
        String cityName = "Pune";
        System.out.println("City name is :" +cityName);
        cityName = "Delhi"; //Reuse Value
        System.out.println("City name is :" +cityName); //After Reusae
    }
}
