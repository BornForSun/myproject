package com.hzx.admin;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AdminApplicationTests {

    @Test
    void testLeetCode() {
//        int a = 1235321;
//        isP(a);
//
//        removeDuplicates(new int[]{0,0,1,1,2,2});
//
//        removeElement(new int[]{0, 2, 1,3, 1, 2, 2}, 2);
        removeElement(new int[]{ 2, 2}, 2);
//        removeElement(new int[]{ 2,1}, 2);
    }

    private boolean isP(int a) {
        char c[] =( a + "").toCharArray();
        int l = 0, r = c.length - 1;
        boolean flag = true;
        while (flag) {
            if (l > r) {
                return flag;
            }
            if (c[l] != c[r]) {
                flag = false;
            }
            l++;
            r--;

        }
        System.out.println(flag);
        return flag;
    }

    public int removeElement(int[] nums, int val) {
        int p = 0;
        int q = nums.length;
        while (p < q) {
            if (nums[p] == val) {
                nums[p] = nums[q - 1];
                q--;
            } else {
                p++;
            }
        }
        return p;
    }
    @Test
    void plusOne() {
//        plusOne(new int[]{1, 2, 3});

    }

//    private  int[] plusOne(int[] digits){
//        String s = "";
//        for (int i = 0; i <digits.length ; i++) {
//            s += digits[i];
//        }
//        s = Long.valueOf(s) + 1+"";
//        char[] chars = s.toCharArray();
//        int[] ans = new int[chars.length];
//        for (int i = 0; i < chars.length; i++) {
//            ans[i]=Integer.parseInt(chars[i]+"");
//        }
//
//        return ans;

//    }

}
