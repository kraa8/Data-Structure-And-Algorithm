public class MinimumElementRotatedArray {


    public static int MinEle( int []arr){
        int start =0;
        int end= arr.length-1;
        while ( start < end ){
            int mid = ( start + end )/2;
            if (arr[end ]< arr[ mid ] )
                start = mid + 1;
            else if (arr[end ] > arr[ mid ])
                    end =mid;
        }
        return arr[end];
    }

    public static void main(String[] args) {
        int [] arr= new int [] { 4,5,6,7,0,1,2};
        int n=arr.length-1;
        int start =0;
        int end =n;
        System.out.println(MinimumElementRotatedArray.MinEle(arr));
    }
}
