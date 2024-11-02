class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer>res=new HashSet<>();
       Set<Integer>res1=new HashSet<>();
       

        for(int num:nums1){
            res.add(num);
        }
        for(int n:nums2){
            if(res.contains(n)){
                res1.add(n);
            }
        }
        int i=0;
        int []a=new int[res1.size()];
        for(int numm:res1){
            a[i++]=numm;
        }
        return a;
    }
}