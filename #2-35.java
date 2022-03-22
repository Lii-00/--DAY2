/*
题目：#35
给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
请必须使用时间复杂度为 O(log n) 的算法。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/search-insert-position
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0)return 0;           		//若为空则返回0，表示新插入该target
        int i = 0;
        for(i = 0; nums[i] <= target ; i++){
            if(nums[i] == target)
                return i;
            if(i != 0 ){		
                if(i + 1 == nums.length)return nums.length;
            }
            if(nums.length == 1)return 1;
        }
        return i;

    }
}