//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double x = 1.86; //рост
        System.out.println("Ваш рост:" + x);
        double y = 98; //вес
        System.out.println("Ваш вес:" + y);
        double bmiIndex = service.calculate(x, y);
        System.out.println("Индекс массы тела:" + bmiIndex);
    }
}
