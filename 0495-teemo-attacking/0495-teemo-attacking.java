class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
    if (timeSeries.length == 0 || duration == 0) {
        return 0;
    }

    int totalDuration = 0;
    int prevAttackEnd = timeSeries[0] + duration - 1;

    for (int i = 1; i < timeSeries.length; i++) {
        int currentAttackStart = timeSeries[i];
        int currentAttackEnd = currentAttackStart + duration - 1;

        if (currentAttackStart <= prevAttackEnd) {
            totalDuration += currentAttackEnd - prevAttackEnd;
        } else {
            totalDuration += duration;
        }

        prevAttackEnd = currentAttackEnd;
    }

    totalDuration += duration; // Last attack duration

    return totalDuration;
}

}