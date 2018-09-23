import java.util.Arrays;

class warmup {
    public static void main(String args[]) {
        int[] ar = {1,2,3};
        int[] ar2 = clone(ar, 3);
        int[] ar3 = cloneRepeat(ar, 3);

        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar2));
        System.out.println(Arrays.toString(ar3));
    }
    static int[] clone (int[] ar, int n) {
        int[] clone = new int[ar.length * n];

        

        for (int i = 0; i < ar.length; i++) {
            

        return clone;
        }
    }
}