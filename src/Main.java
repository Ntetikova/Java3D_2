
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 65; // вес
        double height = 1.7; // рост
        double index = service.calculate(weight, height);
        System.out.println(index);
    }
}