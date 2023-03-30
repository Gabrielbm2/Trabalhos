public class MDC {

    public static int mdc(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mdc(b, a % b);
        }
    }

    public static void main(String[] args) {
        System.out.println(mdc(115, 200));
    }
}