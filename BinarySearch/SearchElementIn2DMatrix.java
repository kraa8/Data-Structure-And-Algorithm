import java.util.Arrays;
public class SearchElementIn2DMatrix {

    public static int[] SearchEle(int [][]arr, int target){
        int row =0;
        int col = arr.length - 1 ;
        int size = arr.length;

        while (col >0 && row<arr.length && row >=0 && col <arr.length){
            if (arr[row][col] == target)
                return new int[]{row, col};
            else if (arr[row][col] < target)
                row++;
            else if (arr[row][col] > target)
                col--;
        }
        return new int []{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
        int target = 23;
        System.out.println(Arrays.toString(SearchEle(arr,target)));
    }

}
