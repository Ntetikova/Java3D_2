
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        /*
        weight = 65; // вес
        height = 1.7; // рост
        */
        System.out.println();
        double imt = service.calculate(65, 1.7);
        if (imt < 18.5) {
            System.out.println("Ваш индекс составляет: " + imt);
            System.out.println("Недовес: меньше чем 18.5");
        } else if (imt < 25) {
            System.out.println("Ваш индекс составляет: " + imt);
            System.out.println("Норма: между 18.5 и 25");
        } else if (imt < 30) {
            System.out.println("Ваш индекс составляет: " + imt);
            System.out.println("Избыточный вес: между 25 и 30");
        } else {
            System.out.println("Ваш индекс составляет: " + imt);
            System.out.println("Ожирение: 30 или больше");
        }
    }
}