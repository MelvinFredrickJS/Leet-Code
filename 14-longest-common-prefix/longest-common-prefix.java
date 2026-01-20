class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String start=strs[0];
        String last=strs[strs.length-1];
        int i=0;
        while(i<start.length()&&i<last.length()){
            if(start.charAt(i)==last.charAt(i)){
                i++;
            }else{
                break;
            }
        }
        if(i==0){
            return "";
        }
        return start.substring(0,i);
    }
}