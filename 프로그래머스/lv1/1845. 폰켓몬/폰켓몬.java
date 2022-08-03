import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int MAXPICK = nums.length / 2;
        Map<Integer, Integer> pocketmonMap = new HashMap<>();
        for (Integer pocketmon : nums) {
            if (!pocketmonMap.containsKey(pocketmon)) {
                pocketmonMap.put(pocketmon, 1);
            } else {
                pocketmonMap.replace(pocketmon, pocketmonMap.get(pocketmon) + 1);
            }
        }
        if (pocketmonMap.size() >= MAXPICK) {
            answer = MAXPICK;
            return answer;
        }
        answer = pocketmonMap.size();
        return answer;
    }
}