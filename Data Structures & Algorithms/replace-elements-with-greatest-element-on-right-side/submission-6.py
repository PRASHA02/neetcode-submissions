class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        maxRight = -1
        current = 0
        ary = []
        for i,value in enumerate(arr[::-1]):
            current = value
            ary.append(maxRight)
            maxRight = max(maxRight,current)
        
        return ary[::-1]