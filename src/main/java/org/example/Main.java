package org.example;

import java.util.ArrayList;

import java.util.*;

class Solution {
    public int mix(int first, int second){
        int result = 0;
        return first+second*2;
    }
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> scQ= new PriorityQueue<Integer>();

        for(int i : scoville){
            scQ.offer(i);
        }
        while(scQ.peek()<K){
            if(scQ.size()<2) return -1;
            int mixed = mix(scQ.poll(),scQ.poll());
            scQ.offer(mixed);
            answer++;

        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution test = new org.example.Solution();

        System.out.println(test.solution(new int[] {1, 2, 3, 9, 10, 12},7));



    }
}
