package powerpackage;

public class PowerFinder {
    public static int findPower(int exponent, int base) {
        int result = 1;
        for (int index = 0; index<base; index++) {
            result = getResult(exponent, result);
        }
        return result;
    }

    private static int getResult(int exponent, int result) {
        result *= exponent;
        return result;
    }
}
