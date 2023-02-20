import java.util.HashMap;

class DoublyLinkedList {

    int key;
    int value;
    DoublyLinkedList previous;
    DoublyLinkedList next;

    DoublyLinkedList(int key, int value) {
        this.key = key;
        this.value = value;
    }
}


class LRUCache {

    int capacity;
    DoublyLinkedList head;
    DoublyLinkedList tail;

    HashMap<Integer, DoublyLinkedList> map = new HashMap<>();

    LRUCache(int capacity) {
        this.capacity = capacity;
        head = new DoublyLinkedList(0, 0);
        tail = new DoublyLinkedList(0, 0);

        head.next = tail;
        tail.previous = head;
        head.previous = null;
        tail.next = null;

    }


    void put(int key, int value) {
        DoublyLinkedList doublyLinkedList = map.get(key);

        if (doublyLinkedList != null) {
            removeDoublyLinkedList(doublyLinkedList);
        }
        if (map.size() == capacity) {
            removeDoublyLinkedList(tail.previous);
        }

        insertDoublyLinkedList(new DoublyLinkedList(key, value));

    }


    int get(int key) {

        DoublyLinkedList doublyLinkedList = map.get(key);
        if (doublyLinkedList==null)
            return -1;

        removeDoublyLinkedList(doublyLinkedList);
        insertDoublyLinkedList(doublyLinkedList);
        return doublyLinkedList.value;
    }

    void insertDoublyLinkedList(DoublyLinkedList doublyLinkedList) {
        map.put(doublyLinkedList.key, doublyLinkedList);
        doublyLinkedList.next = head.next;
        head.next.previous = doublyLinkedList;
        head.next = doublyLinkedList;
        doublyLinkedList.previous = head;

    }

    void removeDoublyLinkedList(DoublyLinkedList doublyLinkedList) {
        map.remove(doublyLinkedList.key);
        doublyLinkedList.previous.next = doublyLinkedList.next;
        doublyLinkedList.next.previous = doublyLinkedList.previous;
    }


}


public class LRU {

    public static void main(String args[]) {

        LRUCache lruCache =new LRUCache(2);
        lruCache.put(1,1);
        lruCache.put(2,2);
        int ans1 = lruCache.get(1);
        System.out.println(ans1);
        lruCache.put(3,3);
        int ans2=lruCache.get(2);
        System.out.println(ans2);
        lruCache.put(4,4);
        int ans3 = lruCache.get(1);
        int ans4 = lruCache.get(3);
        int ans5 = lruCache.get(4);

        System.out.println(ans3+"/"+ans4+"/"+ans5);
    }
}
