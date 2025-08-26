class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        int min=Math.min(len1,len2);
        String lstr="";
        if(min==len1){
            lstr=word2;
        }else{
            lstr=word1;
        }
        StringBuilder sb=new StringBuilder();
        char arr1[]=word1.toCharArray();
        char arr2[]=word2.toCharArray();
        for(int i=0;i<min;i++){
            sb.append(arr1[i]);
            sb.append(arr2[i]);
        }
        sb.append(lstr.substring(min));
        return sb.toString();    
    }
}