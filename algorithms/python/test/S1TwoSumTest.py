# encoding:utf-8

# @author:jessenpan
# desc: 

import unittest
from solution.S1TwoSum import TwoSum


class S1TwoSumTest(unittest.TestCase):
    twoSumObj = TwoSum()

    def test1(self):
        self.assertEqual([0, 1], self.twoSumObj.twoSum([2, 7, 11, 15], 9))
