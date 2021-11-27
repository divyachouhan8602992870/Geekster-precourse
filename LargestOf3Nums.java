public class LargestOf3Nums {
 
    public static void main(String[] args) {
        int a = 198;
        int b = 82;
        int c = 389;
         
        int largest = (a>b)?(a>c?a:c):(b>c?b:c);
         
        System.out.print(largest + " is the largest.");
    }
}
