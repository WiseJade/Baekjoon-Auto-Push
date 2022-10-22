class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        for (int idx = 0; idx < n; idx++) {
            answer[idx] = num;
            num += x;
        }
        return answer;
    }
}