class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(gte(nums1, nums2),gte(nums2,nums1));
        
    }
    public List<Integer>gte(int[] nums1,int []nums2){
        Set<Integer>s1=new HashSet<>();
        Set<Integer>s2=new HashSet<>();
        for(int num:nums2){
            s2.add(num);
        }
        for(int num:nums1){
            if(!s2.contains(num)){
                s1.add(num);
            }
        }
        return new ArrayList <>(s1);
    }
}