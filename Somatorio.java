public class Somatorio {

    public static int somatorio(int[] nums) {
        int resultado = 0;
        for (int i = 0; i < nums.length; i++) {
            resultado += nums[i];
        }
        return resultado;
    }


    public static void main(String[] args) {
        int[] nums = {5, 6, 10};
        System.out.println(somatorio(nums));
        int[] nums2 = {15, 10, -5};
        System.out.println(somatorio(nums2));
    }
}