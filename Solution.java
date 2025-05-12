
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode prev=null;
        ListNode front;

        while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;

        }
        head=prev;
        return head;
    }
public static void printLinkedList(ListNode head) {
    ListNode temp = head;
    while (temp != null) {
        System.out.print(temp.val + " ");
        temp = temp.next;
    }
    System.out.println();
}
public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(3);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(4);

    
    System.out.print("Original Linked List: ");
    printLinkedList(head);

   
    Solution sol = new Solution();

    head = sol.reverseList(head);
    System.out.print("Reversed Linked List: ");
    printLinkedList(head);
   }

}

