# encoding:utf-8

# @author:jessenpan
# tag:array 


class TwoSum:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        numWithIndexMap = {}
        for i, num in enumerate(nums):
            numWithIndexMap[num] = i
        result = []
        for j, oneOperatorNum in enumerate(nums):
            need_num = target - oneOperatorNum
            if (numWithIndexMap.__contains__(need_num)):
                otherOperatorIndex = numWithIndexMap[need_num]
            else:
                continue
            if (otherOperatorIndex != None and otherOperatorIndex != j):
                result.append(j)
                result.append(otherOperatorIndex)
                break
        return result
