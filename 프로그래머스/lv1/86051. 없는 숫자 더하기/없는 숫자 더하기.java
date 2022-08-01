class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] numArr = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for (int i : numbers) {
            numArr[i] = -1;
        }
        
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] != -1) {
                answer += i;
            }
        }
        return answer;
    }
}