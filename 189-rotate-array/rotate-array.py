class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None (modifies nums in-place)
        """
        n = len(nums)
        k = k%n
        nums.reverse()
        
        nums[:k] = reversed(nums[:k])
        
        nums[k:] = reversed(nums[k:])
