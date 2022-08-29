public class SearchElementInBitonicArray {
    public static int SearchEle( int []arr, int target ){
        int start =0;
        int end =arr.length-1;
        return -1;
    }
    public static void main(String[] args) {
        int [] arr=  new int [] { 1,3,8,12,4,2 };
        int target = 12;
        int ans = SearchElementInBitonicArray.SearchEle(arr, target);
        System.out.println(ans);
    }
}
