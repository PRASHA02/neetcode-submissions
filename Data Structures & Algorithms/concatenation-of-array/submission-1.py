class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        n = len(nums)
        ans = []
        for index,value in enumerate(nums):
            ans.append(index,value)
            ans.append((index+n),value)
        return ans
