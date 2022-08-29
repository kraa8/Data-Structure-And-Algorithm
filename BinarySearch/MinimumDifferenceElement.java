public class MinimumDifferenceElement {
    public static int MinDiff(int []arr, int target){
        int start = 0;
        int end = arr.length-1;
        // Applying Binary Search
        while ( start <= end ){
            int mid = start + ( end - start )/2;
            if (arr[mid]==target)
                return arr[mid];
            else if ( target > arr[mid] )
                start =mid + 1;
            else if ( target < arr[mid] )
                end =mid - 1;
        }
        int a =Math.abs(arr[start]-target);
        int b = Math.abs(arr[end]-target);
        return Math.min(a,b);
    }
    public static void main(String[] args) {
        int [] arr= new int[]{1,3,8,10,15};
        int target = 10;
        int ans = MinimumDifferenceElement.MinDiff(arr,target);
        System.out.println( ans );
    }
}
