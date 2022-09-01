public class SortedTwoSum {

    public static int[] target(int []arr, int target ){
        int left=0;
        int right = arr.length-1;
        while(left<right){
            int sum= arr[left]+arr[right];
            if (sum==target) {
                return new int[]{left, right};
            }
            else if (target>sum){
                left++;
            }
            else{
                right--;
            }
        }
        return new int []{-1,-1};

    }
    public static void main(String[] args) {
        int [] arr= new int[] {2,7,11,15};
        int target=9;
        int []ans=SortedTwoSum.target(arr,target);
        System.out.println("[" + ans[0] + " " + ans[1] + "]");
    }
}
