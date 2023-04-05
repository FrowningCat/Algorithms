package lesson_3;

public class main {

    static int size(ListNode head) {
        ListNode iter = head;
        int size = 0;
        while (iter != null){
            size++;
            iter = iter.next;
        }
        System.out.println(size);
        throw new UnsupportedOperationException();
    }

    static String asString(ListNode head) {
        ListNode iter = head;
        System.out.print("[");
        while (iter != null){
            System.out.print(iter.value + " -> ");
            iter = iter.next;
        }
        System.out.print("]");
        throw new UnsupportedOperationException();
    }

    static void getByIndex(ListNode head, int index) {
        ListNode iter = head;
        int pos = 0;
        while (pos != index){
            pos ++;
            iter = iter.next;
        }
        System.out.println(iter.value);
        throw new UnsupportedOperationException();
    }

    static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        size(head);
        asString(head);
        getByIndex(head, 0);
    }
}