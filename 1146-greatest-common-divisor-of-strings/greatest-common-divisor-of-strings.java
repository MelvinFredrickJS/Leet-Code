class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String big=str1.length()>str2.length()?str1:str2;
        String small=str2.length()<str1.length()?str2:str1;
        if(!big.startsWith(small)){
            return "";
        }

        if(big.equals(small)){
            return big;
        }
        return gcdOfStrings(big.substring(small.length()),small);
    }
}