package test;

public class Main {
    public static void main(String[] args) {
        // Create a Box to hold integers
        Box<Integer> intBox = new Box<>(42);
        System.out.println("Content of intBox: " + intBox.getContent());

        // Create a Box to hold strings
        Box<String> stringBox = new Box<>("Hello");
        System.out.println("Content of stringBox: " + stringBox.getContent());
    }
}
