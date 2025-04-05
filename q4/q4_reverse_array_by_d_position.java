package q4;

public class q4_reverse_array_by_d_position {
    static void rotateArr(int arr[], int d) {
        int n=arr.length;
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        
    }
    private static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        rotateArr(arr, 2);
        for(int num : arr){
            System.out.print(num+" ");
        }
        
    }

}
