class Solution {
    public boolean isLess(int mid, int[] arr, int t) {
        int sum = 0;

        for (int num : arr) {
            // ceil(num / mid)
            sum += (num + mid - 1) / mid;
        }

        return sum <= t;
    }

    public int smallestDivisor(int[] arr, int t) {
        int mx = Integer.MIN_VALUE;

        for (int num : arr) {
            mx = Math.max(mx, num);
        }

        int d = mx;
        int low = 1;       // FIXED
        int high = mx;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isLess(mid, arr, t)) {
                d = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return d;
    }
}