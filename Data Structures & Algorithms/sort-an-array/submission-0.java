//[10,9,1,2]
// [10,9] [1,2] -> [9,10][1,2]
// 

class Solution {

    private int[] subArray(int origin, int end, int arr[]) {
        int[] result = new int[end - origin];

        if(end > arr.length || origin < 0) {
            return result;
        }

        for(int i = origin; i < end; i++) {
            result[i - origin] = arr[i];
        }

        return result;
    }

    public int[] sortArray(int[] nums) {

        int len = nums.length;
        if(len == 0) {
            return new int[0];
        }
        if(len == 1) {
            return nums;
        }

        int mid = (nums.length)/2;

        int[] left = subArray(0, mid, nums);
        int[] right = subArray(mid, nums.length, nums);

        return merge(sortArray(left),sortArray(right));        
    }

    // i      j        [6,7,10,11]
    // [6,10] [7,11]

    public int[] merge(int[] left, int right[]) {
        
        int lenL = left.length;
        int lenR = right.length;
        if(lenL == 0 && lenR == 0) {
            return new int[0];
        } else if(lenL == 1 && lenR == 0) {
            return left;
        } else if(lenL ==  0 && lenR == 1)
            return right;

        int[] result = new int[lenL + lenR];

        int i = 0;
        int j = 0;
        int k = 0;
        while(i < lenL && j < lenR) {
            if(left[i] < right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }

        if(j < lenR) {
            while(j < lenR) {
                result[k] = right[j];
                j++;
                k++;
            }
        } 
        
        if(i < lenL) {
            while(i < lenL) {
                result[k] = left[i];
                i++;
                k++;
            }
        }

        return result;
    };
}