public class Main {
    public static void main(String[] args) {
        BirthdayCalculator bc = new BirthdayCalculator(23);
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 1000000; j++) {
                bc.isThereSameBirthday();
            }
            bc.printResult();
        }
    }
}