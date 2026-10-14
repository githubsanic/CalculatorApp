package uebungen.calculaterapp;

public class Main {
    //Compiler fängt immer bei der Main-Methode an.
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println(calc.addition(2, 3));
        System.out.println(calc.subtraction(5,2));
    }
}
