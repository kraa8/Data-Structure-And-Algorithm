public class TimesOfArrayRotated {

    public static int rotated(int []arr, int start, int end) {
        int n = arr.length;



        int mid = start + (end - start) / 2;
        int next = (mid + 1) % n;
        int prev = (mid + n - 1) % n;
        // To find the minimum element in the array
        if (arr[mid] < arr[next] && arr[mid] < arr[prev])
            return mid;
        // to find where it goes
        if (arr[end] > arr[mid])
            return rotated(arr, start, mid - 1);
        return rotated(arr,mid+1,end);
    }

    public static void main(String[] args) {
        int [] arr= new int []{10,12,16,18,2,5,6,8};
        int n=arr.length;
        int i=TimesOfArrayRotated.rotated(arr,0,n-1);
        System.out.println(i);
    }
}
