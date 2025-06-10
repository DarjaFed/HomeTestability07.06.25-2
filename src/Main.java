public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.86; //рост
        System.out.println("Ваш рост:" + height);
        double weight = 73; //вес
        System.out.println("Ваш вес:" + weight);
        double index = service.calculate(weight, height);
        System.out.println("Индекс массы тела:" + index);
    }
}
