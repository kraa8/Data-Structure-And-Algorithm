public class FloorElement {

    public static int FindEle(int [] arr, int target){
        int start =0;
        int end =arr.length-1;
        int res = -1;
        while ( start <= end ){
            int mid = start + ( end - start )/2;
            if ( arr[mid] == target )
                return arr[mid];
            else if ( arr[mid] < target ){
                res=arr[mid];
                start = mid + 1;
            }
            else if ( arr[mid] > target){
                end =mid-1;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int [] arr= new int []{1,2,8,14,25,36,47};
        int target = 25;
        int n= arr.length;
        int ans = FloorElement.FindEle(arr,target);
        System.out.println(ans);
    }
}
