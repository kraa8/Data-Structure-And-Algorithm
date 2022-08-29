public class CeilElement {
    // Ceiling Of An Element
    public static int CeilSearch (int []arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid])
                return mid;
            else if (arr[mid] > target) {
                result=arr[mid];
                end = mid - 1;
            }
            else if ( arr[mid] < target ){
                start = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr= new int []{1,2,8,14,25,36,47};
        int target = 38;
        int n= arr.length;
        int ans = CeilElement.CeilSearch(arr,target);
        System.out.println(ans);
    }
}
