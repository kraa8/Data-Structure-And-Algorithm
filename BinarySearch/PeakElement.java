public class PeakElement {
    public static int PeakEle(int arr[]){
        if ( arr.length == 1 )
            return 0;
        int n=arr.length;
        if ( arr[0]> arr[1])
            return 0;
        if ( arr[n - 1] > arr[n - 2] ) {
            return n-1 ;
        }


        int start = 1;
        int end = arr.length-2;


         while ( start <=end ){
             int mid = start + (  end - start )/2;

             if ( arr[ mid ] > arr[ mid-1 ] && arr[ mid ] >arr[ mid + 1])
                 return mid;
             else if ( arr[mid-1] > arr[mid] )
                 end = mid-1;
             else if (arr[mid+1] > arr[mid])
                 start = mid + 1;
         }
         return -1;
    }
    public static void main(String[] args) {
        int [] arr= new int []{1,2,1,3,5,6,4};
        int ans = PeakElement.PeakEle(arr);
        System.out.println(ans);
    }
}
