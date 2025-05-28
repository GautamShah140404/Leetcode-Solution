class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null) return null;

        // Step 1: Copy all values into a list
        ArrayList<Integer> list = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }

        // Step 2: Sort the list
        Collections.sort(list);

        // Step 3: Reassign sorted values to the linked list
        current = head;
        for (int val : list) {
            current.val = val;
            current = current.next;
        }

        return head;
    }
}
