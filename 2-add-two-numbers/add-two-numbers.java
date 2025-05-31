/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.math.BigInteger;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Step 1: Convert to strings
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();

        while (l1 != null) {
            num1.append(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            num2.append(l2.val);
            l2 = l2.next;
        }

        // Step 2: Reverse and parse as BigInteger
        BigInteger n1 = new BigInteger(num1.reverse().toString());
        BigInteger n2 = new BigInteger(num2.reverse().toString());

        // Step 3: Add the numbers
        BigInteger sum = n1.add(n2);

        // Step 4: Reverse sum and make linked list
        String resultStr = new StringBuilder(sum.toString()).reverse().toString();

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (char c : resultStr.toCharArray()) {
            current.next = new ListNode(Character.getNumericValue(c));
            current = current.next;
        }

        return dummy.next;
    }
}
