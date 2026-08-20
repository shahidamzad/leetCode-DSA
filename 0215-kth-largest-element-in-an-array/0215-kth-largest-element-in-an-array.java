class Solution {
    static int ans;
     public  void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private  int partition(int[] arr, int low, int high) {
        int pivotIdx = low + (int)(Math.random() * (high - low + 1));
        int pivot = arr[pivotIdx];
        // Count elements smaller than or equal to pivot
        int smallestCount = 0;

        for (int i = low ; i <= high; i++) {
            if(i == pivotIdx) continue;
            if (arr[i] <= pivot) {
                smallestCount++;
            }
        }

        // Find correct position of pivot
        int correctIndex = low  + smallestCount;

        // Put pivot at correct position
        swap(arr, pivotIdx, correctIndex);

        // Partition
        int i = low;
        int j = high;

        while (i < correctIndex && j > correctIndex) {
            if (arr[i] <= pivot) {
                i++;
            }
            else if (arr[j] > pivot) {
                j--;
            }
            else {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return correctIndex;
    }

    public  void quickSelect(int[] arr, int low, int high , int k) {

        // Base condition
        if (low > high) {
            return;
        }
        int idx = partition(arr, low, high);

        if (idx == k - 1) {
            ans = arr[idx];
            return;
        }

        if(k-1 < idx) quickSelect(arr, low, idx - 1,k);
        else  quickSelect(arr, idx + 1, high,k);
    }


    public int findKthLargest(int[] arr, int k) {
        ans = -1;
        int n =arr.length;
        quickSelect(arr, 0, n - 1 ,n - k + 1);
        return ans ;
    }
}