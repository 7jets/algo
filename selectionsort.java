class Solution {
    public List<Integer> sortArray(int[] nums) {
        int len = nums.length;
        for(int i=0;i<len;i++){
            int min=i;
            for(int j=i+1;j<len;j++){
                if(nums[j]<nums[i]){
                    min = j;
                }
            }
            int mid = nums[i];
            nums[i] = nums[min];
            nums[min] = mid;
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<len;i++){
            list.add(nums[i]);
        }
        return list;
    }
}
