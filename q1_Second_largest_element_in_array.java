public class q1_Second_largest_element_in_array {
    public static int getSecondLargest(int[] arr) {
        int largest=-1,second=-1;
        for(int num: arr){
            if(num>largest){
                second=largest;
                largest=num;
            }
            else if (num>second && num< largest){
                second=num;
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int [] arr={12,35,1,10,34,1};
        System.out.println(getSecondLargest(arr));
        
    }

}
