package com.company;

public class Main {

    public static void main (String[] args) {
        BMIService service = new BMIService ();
        double weight;
        double height;
        double BMI = service.calculate ( 150, 2.0); // zdesi vvodim ves i rost cherez zapyatuyu//
        
        System.out.println(BMI);


    }
}
