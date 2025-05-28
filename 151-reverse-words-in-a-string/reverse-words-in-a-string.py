class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        arr=s.split()
        arr.reverse()
        return " ".join(arr)
        