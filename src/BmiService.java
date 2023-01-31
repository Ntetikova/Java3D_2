/*public class BmiService {
    public int calculate(int I) {
        double m = 170;
        double h = 65;
        double imt = m / h * h;
        return imt;
    }

}
*/
public class BmiService {
    public double calculate(double weight, double height) {
        double index = weight / (height * height);
        if (index < 18.5) {
            System.out.println("Недовес: меньше чем 18.5");
        } else if (index < 25) {
            System.out.println("Нормальный: между 18.5 и 25");
        } else if (index < 30) {
            System.out.println("Избыточный вес: между 25 и 30");
        } else {
            System.out.println("Ожирение: 30 или больше");
        }
        return index;
    }
}