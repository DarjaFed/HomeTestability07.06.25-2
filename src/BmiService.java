public class BmiService {
    public double calculate(double x, double y) {
        double max = x * x;
        double bmiIndex = y / max;
        return (int) bmiIndex;


    }
}
