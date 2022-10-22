class Solution {
    public int solution(int n) {
        int answer = 0;
        out: for (int i = 2; i <= n; i++) {
            if (i == 2 || i == 3) {
                answer++;
                continue out;
            }
            if (i % 2 == 0) continue out;
            for (int j = 3; j <= Math.sqrt(i); j += 2) {
                if (i % j == 0) continue out;
            }
            answer++;
        }
        return answer;
    }
}