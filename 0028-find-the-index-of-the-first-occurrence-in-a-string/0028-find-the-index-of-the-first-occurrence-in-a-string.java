class Solution {
    public int strStr(String haystack, String needle) {
        String bw=haystack;
        String sw=needle;
        for(int i=0;i<=bw.length()-sw.length();i++){
            if(bw.charAt(i)==(sw.charAt(0))){
                if(bw.substring(i,sw.length()+i).equals(sw)){
                    return i;
                }
            }
        }
        return -1;
    }
}