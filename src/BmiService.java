public class BmiService {
    public double calculate(double weight, double height) {
        double max = Math.pow(height, 2);
        double index = weight / max;
        return (int) index;


    }
}
