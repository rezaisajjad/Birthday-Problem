import java.util.Arrays;
import java.util.Random;

public class BirthdayCalculator {
    private static final int YEAR_DAYS = 365;
    private int _count;
    private static final Random random = new Random();
    private int _trueResult = 0;
    private int _falseResult = 0;

    public BirthdayCalculator(int count) {
        _count = count;
    }

    void printResult()
    {
        System.out.println("result:\t"+_trueResult/(_trueResult+_falseResult));
        System.out.println(((float) _trueResult)/(((float) _trueResult)+((float) _falseResult)));
    }

    boolean isThereSameBirthday() {
        int[] dayNumbers = getNumbers(_count, YEAR_DAYS);
        return calculateResult(checkSameNumbers(dayNumbers));
    }
    private boolean calculateResult(boolean result) {
        if (result)
            _trueResult++;
        else
            _falseResult++;
        return result;
    }

    private int[] getNumbers(int count, int limit) {
        int[] dayNumbers = new int[_count];
        for (int i = 0; i < _count; i++) {
            dayNumbers[i] = (random.nextInt() % limit) + 1;
        }
        return dayNumbers;
    }

    private boolean checkSameNumbers(int[] numbers) {
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; )
            if (numbers[i] == numbers[++i])
                return true;
        return false;
    }
}
