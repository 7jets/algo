class Solution {
    public List<Integer> sortArray(int[] nums) {
        int len = nums.length;
        for(int i=1;i<len;i++){
            for(int j=i-1;j>=0&&nums[j]>nums[j+1];j--){
                int mid = nums[j+1];
                nums[j+1]=nums[j];
                nums[j]=mid;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<len;i++){
            list.add(nums[i]);
        }
        return list;
    }
}
