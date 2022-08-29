import java.util.Arrays;

public class SearchInStrictlySorted2DMatrix {
    public static void main(String[] args) {
        int [][] arr= new int [][] {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target = 3;
        System.out.println(Arrays.toString(searchEle(arr, target)));

    }

    public static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (arr[row][mid] == target)
                return new int[]{row, mid};
            else if (arr[row][mid] < target) {
                cStart = mid + 1;
            } else
                cEnd = mid - 1;
        }
        return new int[]{-1, -1};
    }


    public static int[] searchEle(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length; // be cautious, matrix may be empty
        if (cols == 0) {
            return new int[]{-1, -1};
        }
        if (rows == 1) {
            return binarySearch(arr, 0, 0, cols - 1, target);
        }
        int rstart = 0;
        int rend = rows-1;
        int cmid = cols / 2;

        // run the loop till 2 rows are remaining
        while (rstart < (rend-1)) { // while this is true it will have more than 2 rows
            int mid = rstart + (rend - rstart) / 2;
            if (arr[mid][cmid] == target) {
                return new int[]{mid, cmid};
            }
            if (arr[mid][cmid] < target) {
                rstart = mid;
            }
            else {
                rend = mid;
            }
        }


        if (arr[rstart][cmid] == target) {
            return new int[]{rstart, cmid};
        }
        if (arr[rstart + 1][cmid] == target) {
            return new int[]{rstart + 1, cmid};
        }
        // Search in 1st half
        if (target <= arr[rstart][cmid - 1]) {
            return binarySearch(arr, rstart, 0, cmid - 1, target);
        }
        // Search in 2nd half
        if (target <= arr[rstart + 1][cmid - 1]) {
            return binarySearch(arr, rstart + 1, 0, cmid - 1, target);
        }
        // Search in 3rd half
        if (target <= arr[rstart][cmid + 1]) {
            return binarySearch(arr, rstart, cmid + 1, cols - 1, target);
        }else {
            return binarySearch(arr, rstart + 1, cmid + 1, cols - 1, target);
        }
    }
}
