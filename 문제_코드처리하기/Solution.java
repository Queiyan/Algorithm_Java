class Solution {
    public String solution(String code) {
             
        char[] codes = code.toCharArray();
        String ret = "";
        int mode = 0;
        
        for(int idx = 0; idx < codes.length; idx++){          
            
            if(mode == 0){
                if(codes[idx] != '1'){
                    if(idx%2 == 0){
                        ret = ret + codes[idx];
                    }
                } else{
                    mode = 1;
                }
            } else{
                if(codes[idx] != '1'){
                    if(idx%2 == 1){
                        ret = ret + codes[idx];
                    }
                } else{
                    mode = 0;
                }
            }
        } 
        return ret;
    }
}