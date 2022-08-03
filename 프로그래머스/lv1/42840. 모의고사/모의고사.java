import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        List<Integer> winner = new ArrayList<>();
        // 수포자2와 수포자3의 찍는 방식을 담은 배열 선언
        int[] student2 = new int[]{2,1,2,3,2,4,2,5};
        int[] student3 = new int[]{3,3,1,1,2,2,4,4,5,5};
        // 세명의 수포자의 맞은 문제개수를 차례대로 담을 배열 선언
        int[] score = new int[]{0, 0, 0};
        // answer의 길이만큼 순회
        for (int i = 0; i < answers.length; i++) {
            // 수포자1이 맞았는지 확인(정답을 5로 나눈 나머지가 인덱스+1을 5로 나눈 나머지와 같으면 맞음)
            if (answers[i] % 5 == (i + 1) % 5)
                score[0]++;
            // 수포자2가 맞았는지 확인(정답이 student 배열의 i%8 번째와 같으면 맞음)
            if (answers[i] == student2[i%8])
                score[1]++;
            // 수포자3가 맞았는지 확인(정답이 stuent 배열의 i%10 번째와 같으면 맞음)
            if (answers[i] == student3[i%10])
                score[2]++;
        }
        // 가장 큰 점수 찾기
        int maxScore = Math.max(Math.max(score[0], score[1]), score[2]);
        // 가장 큰 점수와 같으면 리스트에 추가한다.
        for (int i = 0; i < score.length; i++) {
            if (score[i] == maxScore)
                winner.add(i+1);
        }
        // 리스트를 결과 배열로 변환해서 리턴한다.
        answer = new int[winner.size()];
        for (int i = 0; i < winner.size(); i++) {
            answer[i] = winner.get(i);
        }
        
        return answer;
    }
}