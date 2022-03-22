/*
题目：#27	--数组
给你一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，并返回移除后数组的新长度。
不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并原地修改输入数组。
元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/remove-element
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;			//用于计数，计新数组中的数值个数
        for(int i = 0 ; i < nums.length ; i++){		//时间复杂度O（n）
            if(nums[i] != val){
                nums[count] = nums[i];		
                count++;			//可与上一句合并，即nums[count++] = nums[i];
            }
        }
        return count;
    }
}