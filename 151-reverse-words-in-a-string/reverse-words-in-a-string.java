class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split("\\s+");
        String res="";
        for(int i=arr.length-1;i>=0 && arr[i]!=" ";i--){
            res+=arr[i];
            res+=" ";
        }
        res=res.strip();
        return res;
        
    }
}