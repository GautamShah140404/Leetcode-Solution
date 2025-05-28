// Time Complexity :  O(n)
// Space Complexity : O(1)
struct ListNode* middleNode(struct ListNode* head){
    // Initialize two pointers p1 and p2 pointing to the head...
    struct ListNode* p1 = head;
    struct ListNode* p2 = head;
    // Base case...
    if(head == NULL) return NULL;
    else {
        while(p2 != NULL && p2->next != NULL) {
            // In each iteration, we move p1 one node forward and we move p2 two nodes forward...
            p2 = p2->next->next;
            p1 = p1->next;
        }
        // When p2 reaches the last node, p1 will be exactly at the middle point...
        return p1;
    }
}