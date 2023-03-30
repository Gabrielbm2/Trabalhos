public class CountIntegers {

    public static int countIntegers(int n, double[] data) {
        int count = 0;

        for (int i = 0; i < data.length; i++) {
            if (isInteger(data[i]) && data[i] >= 1 && data[i] <= n) {
                count++;
            }
        }

        return count;
    }

    private static boolean isInteger(double num) {
        return Math.floor(num) == num;
    }

    public static void main(String[] args) {
        double[] data = {};
        System.out.println(countIntegers(5, data));
    }
}