//package leetcode_questions;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i=1 ;i<n;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");

            }else{
                list.add(Integer.toString(i));
            }
        }return list;
    }
}
