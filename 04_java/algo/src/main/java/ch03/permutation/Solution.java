package ch03.permutation;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        boolean[] visited = new boolean[nums.length]; // 중복제거를 위함. [T,F,F,F]
        backtrack( new ArrayList<>(), nums, visited , result);

        return result;
    }

    // 10 backtrack new ArrayList<> () , 20 backtrack(List<Integer> curr ... **
    // backtrack 이라는개념 ?  매개변수를 가지는 함수 ? curr, nums, result 값가짐

    // 순열을 만들어서 result에  추가하는함수 ,
    // backtrack (nums = nums)
    // backtrack = 재귀의 내용을 포함하는애??  백트랙으로 하청을보냄 ?
    // backtrack 함수가 호출되면 result 에 순열을 만들어서 담아줌.
     void backtrack(List<Integer> curr, int[] nums , boolean[] visited ,List<List<Integer>> result) {

         //basecase
         if (curr.size() == nums.length) {
             result.add(new ArrayList<>(curr)); // 27 ArrayList 와  11 ArrayList 다르죠?
             return;
         }

         // recursive call
         // 여기에서 for문은  젤큰머리 1, 2 ,3 선택, 내가지정하는 수
         for (int i = 0; i < nums.length; i++) {
            if (visited [i]) continue; // 방문했던건 다시안하도록

             curr.add(nums[i]) ; // add  새로운 배열에 추가 , 새로운배열은 backtrack 에대한 newArray
             visited[i] = true ;  // 추가 제거할때 T , F 해줌

             backtrack(curr, nums, visited ,result);

             curr.remove(nums[i]); // remove 대가리 바꾸기. 엇 ? 근데 curr은 새로운배열인데
             // 뭘  remove하는걸까 ㅇㅎ 새로운 배열에 1이 고정되있는걸 1을 지우고 2해준다는말.
             //backtrack (curr, nums, result ) -> 밑에 가지치기 혼자알아서하는애
             visited[i] = false;
         }
    }


}
