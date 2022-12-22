package practice29.Task5;

public class ListNode {
    public Item data;
    public ListNode next;
    public ListNode prev;

    ListNode(Item data, ListNode next, ListNode prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
