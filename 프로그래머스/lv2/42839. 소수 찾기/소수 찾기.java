import java.util.*;

class Solution {
        List<Integer> checked;
    
     public int solution(String numbers) {
        checked = new ArrayList<>();
        int answer = 0;
        int[] numArr = new int[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            numArr[i] = numbers.charAt(i) - '0';
        }
        boolean[] picked = new boolean[numArr.length];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= numArr.length; i++) {
            answer += permutation(queue, numArr, new boolean[numArr.length], i, 0);
        }
        return answer;
    }

    // 모든 숫자를 검사하는 재귀함수
    // 파라미터: 현재 들어있는 수 큐, 전체 숫자, 뽑았는지 확인할 boolean 배열, 뽑을 수, 결과값
    public int permutation(Queue<Integer> queue, int[] numArr, boolean[] isPicked, int pickNum, int result) {
        // queue의 크기가 뽑을 수에 도달하면 소수인지 확인
        if (queue.size() == pickNum) {
            String snumber = "";
            for (int i = 0; i < pickNum; i++) {
                snumber = snumber.concat(String.valueOf(queue.poll()));
            }
            int number = Integer.parseInt(snumber);
            if (!checked.contains(number)) {
                if (primeNumValid(number)) {
                    result++;
                }
                checked.add(number);
            }
            return result;
        }
        // 뽑지 않은 수라면 queue에 넣는다.
        for (int i = 0; i < numArr.length; i++) {
            if (!isPicked[i]) {
                isPicked[i] = true;
                Queue<Integer> q = new LinkedList<>(queue);
                q.offer(numArr[i]);
                result = permutation(q, numArr, isPicked, pickNum, result);
                isPicked[i] = false;
            }
        }
        return result;
    }

    // 소수인지 구하는 메서드 (소수라면 true 리턴)
    public boolean primeNumValid(int num) {
        if (num == 2) return true;
        if (num < 2 || num % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}