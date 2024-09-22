class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long low = 0;
        long high = (long) 1e18;
        while (low < high) {
            long mid = low + (high - low) / 2;
            if (canComplete(mid, mountainHeight, workerTimes)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean canComplete(long timeLimit, int mountainHeight, int[] workerTimes) {
        long totalHeightReduced = 0;
        for (int t : workerTimes) {
            if (t == 0) continue;
            double D = 1 + 8.0 * timeLimit / t;
            if (D < 0) continue;
            long x = (long) ((-1 + Math.sqrt(D)) / 2);
            totalHeightReduced += x;
            if (totalHeightReduced >= mountainHeight) {
                return true;
            }
        }
        return totalHeightReduced >= mountainHeight;
    }
}