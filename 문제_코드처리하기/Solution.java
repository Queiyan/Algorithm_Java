class Solution {
    public String solution(String code) {
        char[] codes = code.toCharArray();
        StringBuilder ret = new StringBuilder();
        int mode = 0;

        for (int idx = 0; idx < codes.length; idx++) {
            if (mode == 0) {
                if (codes[idx] != '1') {
                    if (idx % 2 == 0) ret.append(codes[idx]);
                } else {
                    mode = 1;
                }
            } else { // mode == 1
                if (codes[idx] != '1') {
                    if (idx % 2 == 1) ret.append(codes[idx]);
                } else {
                    mode = 0;
                }
            }
        }

        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}
