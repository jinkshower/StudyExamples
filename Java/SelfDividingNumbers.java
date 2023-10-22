package Leetcode;

import java.util.ArrayList;
import java.util.List;

class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left;i <= right; i++) {
            if (selfDividing(i)) {
                result.add(i);
            }
        }
        return result;
    }
    public boolean selfDividing(int i) {
        for (char c: String.valueOf(i).toCharArray()) {
            if(c == '0'|| (i % (c - '0') > 0)) {
                return false;
            }
        }
        return true;
    }
}