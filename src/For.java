public class For {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4 , 5};
        int len=numbers.length;
        for(int i=0 ; i<len/2 ; i++) {
            int temp = numbers[len - (i+1)];
            numbers[len-(i+1)]=numbers[i];
            numbers[i]=temp;
        }
        for (int i=0 ; i<len ; i++)
            System.out.println(numbers[i]);
    }
}