import java.util.ArrayList;

public class Fibonacci {

    public static ArrayList<Integer> fibonacci(int n) {
        ArrayList<Integer> seq = new ArrayList<Integer>();
        if (n <= 0) {
            return seq;
        } else if (n == 1) {
            seq.add(0);
            return seq;
        } else if (n == 2) {
            seq.add(0);
            seq.add(1);
            return seq;
        } else {
            seq.add(0);
            seq.add(1);
            for (int i = 2; i < n; i++) {
                seq.add(seq.get(i - 1) + seq.get(i - 2));
            }
            return seq;
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(9));
    }
}