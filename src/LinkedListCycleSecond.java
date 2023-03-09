import java.util.HashMap;
import java.util.Map;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycleSecond {


    static ListNode find(ListNode head)
    {
        Map<ListNode,Integer> map=new HashMap<>();

        while(head.next!=null)
        {
            if(map.containsKey(head))
            {
                return head;
            }
            else{
                map.put(head, head.val);
            }

            head=head.next;
        }

        return null;
    }


    public static void main(String args[])
    {
        ListNode head = new ListNode(3);
        ListNode headNext = new ListNode(2);
        head.next=headNext;
        ListNode headNextNext = new ListNode(0);
        headNext.next = headNextNext;
        ListNode tail = new ListNode(-4);
        headNextNext.next=tail;
        tail.next=headNext;

        System.out.println(find(head).val);
    }
}
