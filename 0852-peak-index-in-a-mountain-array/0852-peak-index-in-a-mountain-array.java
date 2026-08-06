class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // if we are in increasing part
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                // peak is at mid or left side
                high = mid;
            }
        }

        return low; // or return high;
    }
}