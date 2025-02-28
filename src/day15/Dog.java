package day15;

/*
Write a Java program to create a class called Dog with instance variables name and color.
Implement a parameterized constructor that takes name
and color as parameters and initializes
the instance variables. Print the values of the variables.

Note: make color and name private. Getter/setter metod used
 */

public class Dog {
    private String color;
    private String name;
    private int quantity= 1;

    Dog(String name, String color, int quantity) {
        this.color = color;
        this.name = name;
        this.quantity = quantity;
    }
    Integer getQuantity(){
        return this.quantity;
    }

    String getName() {
        return this.name;
    }

    String getColor() {
        return this.color;
    }

    void setName(String name) {
        this.name = name;
    }

    void setColor(String color) {
        this.color = color;

    }
}
