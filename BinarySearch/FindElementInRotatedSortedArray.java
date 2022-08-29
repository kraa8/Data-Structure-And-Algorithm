public class FindElementInRotatedSortedArray {

    public static int FindEle(int []arr,int n, int target){
        int index = FindElementInRotatedSortedArray.MinEle(arr);
        int start=0;
        int last=arr.length-1;
        if(arr[index] == target)
            return index;
        if(arr[start]<target)
            return BinarySearch(arr,start, index-1, target);
        return BinarySearch(arr, index, last, target);

    }
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


    public static int BinarySearch(int arr[], int low, int high,
                            int key)
    {

        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return BinarySearch(arr, (mid + 1), high, key);
        return BinarySearch(arr, low, (mid - 1), key);
    }

    public static void main(String[] args) {
        int [] arr= new int []{10,12,14,16,2,4,5,6};
        int n=arr.length;
        int target=12;
        int k=FindElementInRotatedSortedArray.FindEle(arr,n,target);
        System.out.println(k);
    }
}
