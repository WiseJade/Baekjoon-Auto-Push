class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        if (n == 2) {
           return 1; 
        }
        // k진법으로 변환 후 0을 기준으로 잘라서 배열로 변환
        String[] numArr = Integer.toString(n, k).split("0");
        
        for (String s : numArr) {
            // 0이 연속되어 빈 문자열일 경우 넘어감
            if (s.equals("")) continue;
            // 소수인지 확인
            if (primeNum(s)) answer++;
        } 
        return answer;
    }
    
    // 매개변수로 입력받은 수가 소수인지 확인하는 메서드
    public boolean primeNum(String str) {
        long num = Long.parseLong(str);
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (long i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}