public class BMIService {

    public double calculate(double weight, double height) {

        double BMI = weight / (height * height);

        return BMI;
    }

}
