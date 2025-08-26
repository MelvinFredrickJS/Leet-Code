class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        int min=Math.min(len1,len2);
        String longstr="";
        if(len1==min){
            longstr=word2;
        }else{
            longstr=word1;
        }
        StringBuilder obj=new StringBuilder();
        char[]arr1=word1.toCharArray();
        char[]arr2=word2.toCharArray();
        for(int i=0;i<min;i++){
            obj.append(arr1[i]);
            obj.append(arr2[i]);
        }
        obj.append(longstr.substring(min));
        return obj.toString();
    }
}