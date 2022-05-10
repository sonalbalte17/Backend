package CoreJava;

public class Day1 {

    public static void main(String[] args) {

        int a = 10;
        float fl = 23.9688f;
        String str = "Sonal";

        //reference object declaration for non-static method
        Day1 d1 = new Day1();
        d1.cityDetails1();

        System.out.println(a);
        System.out.println(fl);
        System.out.println(str);

        //Calling static method directly in the main() method
        cityDetails();
    }

    //Static method
    public static void cityDetails() {
        String city = "Mumbai";
        System.out.println(city);
    }

    //Non-static method
    public void cityDetails1() {
        String city1 = "Bangalore";
        System.out.println(city1);
    }
}
