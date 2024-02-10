import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrOdds(6)));
        System.out.println(isJavaKeyword("Don't break my heart"));
        System.out.println(isJavaKeyword("I love to breakdance"));
    }

    public static int[] arrOdds(int num) {
        if(num%2 != 0) num += 1;
        int[] arr = new int[(num)/2];
        for (int i=1; i <= (num)/2; i++) {
            arr[i-1] = (i*2)-1;
        }
        return arr;
    }

    public static boolean isJavaKeyword(String sentence) {
        boolean isJavaKeyword = false;
        String[] listOfKeywords = {"abstract","continue","for","new","switch","assert","default","goto","package","synchronized","boolean","do","if","private","this","break","double","implements","protected","throw","byte","else","import","public","throws","case","enum","instanceof","return","transient","catch","extends","int","short","try","char","final","interface","static","void","class","finally","long","strictfp","volatile","const","float","native","super","while"};
        String[] sentenceArr = sentence.split(" ");

        for(String word : sentenceArr) {
            for(String keyword : listOfKeywords) {
                if(keyword.equals(word)) {
                    isJavaKeyword = true;
                    break;
                }
            }
        }

        return isJavaKeyword;
    }
}
