class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        if(arr.length==0){
            return false;
        }
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        Set <Integer>set=new HashSet<>(map.values());
        if(set.size()==map.size()){
            return true;
        }
        return false;
    }
}