class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int n=words.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                String a=words[i];
                String k=words[j];
                if( a.length()>k.length())continue;
                if(k.startsWith(a)&&(k.endsWith(a))){
                    count++;

                }
            }
        }
        return count;
        
    }
}