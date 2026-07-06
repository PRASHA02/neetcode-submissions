class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        n = len(nums)
        ans = []
        for value in nums:
            ans.append(value)
        for value in nums:
            ans.append(value)
        return ans
