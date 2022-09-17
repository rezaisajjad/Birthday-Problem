public class Main {
    public static void main(String[] args) {
        BirthdayCalculator bc = new BirthdayCalculator(23);
        for (int i = 0; i < 1000; i++) {
            bc.isThereSameBirthday();
        }
        bc.printResult();
    }
}