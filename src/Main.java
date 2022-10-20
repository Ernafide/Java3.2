public class Main {
    public static void main(String[] args) {
        BmiService service = new  BmiService ();
        double BMI = service.calculate(1.7,70);
        System.out.println(BMI);
    }
}