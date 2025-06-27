class Solution {
    public int firstUniqChar(String s) {
        int arr[]=new int[26];
        char carr[]=s.toCharArray();
        for(char c:carr){
            arr[c-'a']++;
        }
        for(int i=0;i<=s.length()-1;i++){
            if((arr[carr[i]-'a'])==1){
                return i;
            }
        }
        return -1;
    }
}