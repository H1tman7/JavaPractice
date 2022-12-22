package practice29.Task3;

public class Order{
    ListNode head;

    Order(){
        head = null;
    }
    Order(Item[] dataArr) {
        for (Item x : dataArr) {
            insert(x);
        }
    }
    public void insert(Item data) {
        if (head == null)
            head = new ListNode(data, null, null);
        else{
            ListNode new_node_ = head;
            while (new_node_.next != null)
                new_node_ = new_node_.next;
            ListNode new_node = new ListNode(data, null, new_node_);
            if (new_node_ == head)
                head.next = new_node;
            else
                new_node_.next = new_node;
        }
    }

    public boolean remove(Item data) {
        if (head == null)
            return false;
        ListNode currNode = head;
        while (currNode.next != null && currNode.data != data)
            currNode = currNode.next;
        if (currNode.data == data) {
            if (currNode == head) {
                if (currNode.next != null) {
                    head = head.next;
                    head.prev = null;
                    return true;
                } else {
                    head = null;
                    return true;
                }
            }
            currNode.prev.next = currNode.next;
            currNode.next.prev = currNode.prev;
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String result = "Заказ:\n";
        if (head == null)
            return result;
        else
            result = result + head.data.toString() + "\n";
        ListNode currNode = head.next;
        while (currNode != null) {
            result = result + currNode.data.toString() + "\n";
            currNode = currNode.next;
        }
        return result;
    }
}
