class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None (modifies nums in-place)
        """
        n = len(nums)
        k = k % n  # Handle cases where k > n
        
        # Step 1: Reverse the entire array
        nums.reverse()
        
        # Step 2: Reverse first k elements
        nums[:k] = reversed(nums[:k])
        
        # Step 3: Reverse the remaining elements
        nums[k:] = reversed(nums[k:])
