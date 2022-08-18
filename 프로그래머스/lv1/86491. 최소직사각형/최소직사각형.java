class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int w = 0;
        int h = 0;
        // 2차원 배열 순회하면서, 배열 0번 인덱스값(왼쪽값,가로)이 최댓값이 되도록 정렬
        for (int i = 0; i < sizes.length; i++) {
            int left = sizes[i][0];
            int right = sizes[i][1];
            if (left < right) {
                sizes[i][0] = right;
                sizes[i][1] = left;
            }
            // 2차원 배열의 왼쪽값(가로) 중 최댓값 찾기
            w = Math.max(w, sizes[i][0]);
            // 2차원 배열의 오른쪽(세로) 중 최댓값 찾기
            h = Math.max(h, sizes[i][1]);
        } 
        answer = w*h;

        return answer;
    }
}