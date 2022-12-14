class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int [arr1.length][arr1[0].length];     // 배열 길이 할당 (안 할 시 Index 0 out of bounds 오류 발생)

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}

// 나의 풀이 보완 : answer를 만들지 말고, arr1에 할당
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] += arr2[i][j];
            }
        }
        return arr1;
    }
}