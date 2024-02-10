public class Main {

    public static void main(String[] args) {
        System.out.println(arrOdds(6).toString());
    }

    public static int[] arrOdds(int num) {
        if(num%2 != 0) num += 1;
        int[] arr = new int[(num)/2];
        for (int i=1; i <= (num)/2; i++) {
            arr[i-1] = (i*2)-1;
        }
        return arr;
    }
}
