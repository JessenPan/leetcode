package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S825FriendsOfAppropriateAges {

    //TODO 
    public int numFriendRequests(int[] ages) {
        if (ages.length <= 1) {
            return 0;
        }
        //1.统计每个年龄的人数
        int[] people = new int[121];
        for (int age : ages) {
            people[age]++;
        }

        //2.按照年龄从小到大，只能后面元素向前面元素发送请求
        int res = 0;
        //3.固定一个元素，统计大于等于这个元素的元素给它发送的好友请求总和
        for (int i = 15; i < people.length; i++) {
            for (int j = i; j < people.length; j++) {
                if (i <= 0.5 * j + 7) {
                    break;
                } else {
                    if (i == j) {
                        //同龄人
                        res += people[i] * (people[j] - 1);
                    } else {
                        //非同龄人
                        res += people[i] * people[j];
                    }
                }
            }
        }

        return res;
    }

}
