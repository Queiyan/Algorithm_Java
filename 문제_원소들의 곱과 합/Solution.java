class Solution {
    public int solution(int[] num_list) {
        
        int answer = 0;
        int mul = 1;
        int add = 0;       
        
        for(int list : num_list){
            add = add + list;
            mul = mul * list;
        }
        
        if(mul < (add*add)){
            answer = 1;
        }
        
        return answer;
    }
}