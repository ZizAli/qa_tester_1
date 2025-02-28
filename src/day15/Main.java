package day15;

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog("Qizil", "white-black", 1);

        d.setName("Bob");
        d.setColor("grey");

        System.out.println("My Dog's name is " + d.getName() + " and its color is " + d.getColor() + ". I haave only " + d.getQuantity()+ " dog" );



    }
}
