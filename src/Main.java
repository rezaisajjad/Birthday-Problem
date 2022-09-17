public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            BirthdayCalculator bc = new BirthdayCalculator(23);
            for (int j = 0; j < 1000; j++) {
                bc.isThereSameBirthday();
            }
            bc.printResult();
        }
    }
}