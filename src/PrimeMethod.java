public class PrimeMethod {
    public static boolean isPrime(int num){
        for(int i=2 ; i<num ; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num=50;
        for(int i=2 ; i<=num ; i++){
            if (isPrime(i)){
                System.out.println(i+" is prime");
            }
        }
    }
}