public class LargeSmall {
    public static void main(String[] args){
        int arr[]={10,20,15,35,6};
        int large=arr[0];
        int small=arr[0];
        for(int i=1 ; i<arr.length ; i++){
            if (arr[i]>large){
                large=arr[i];
            }
            else if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println(large);
        System.out.println(small);
    }
}
