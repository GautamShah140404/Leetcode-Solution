import java.util.*;
class Solution {
    public int hammingWeight(int n) {
        String num=Integer.toBinaryString(n);
        char str[]=num.toCharArray();
        int count=0;
        for(int i=0;i<str.length;i++){
            if(str[i]=='1')count++;
        }
        return count;
    }
}