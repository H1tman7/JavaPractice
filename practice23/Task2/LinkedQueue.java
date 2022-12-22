package practice23.Task2;

/*
Реализуйте класс LinkedQueue — очередь на связном списке.
 */

public class LinkedQueue {

    //Узел содержит поля: информационное, указатель  на предыдущий и на следующий узлы
    private class Node {
        Object value;
        Node prev;
        Node next;
        Node(Object element, Node prev, Node next) {
            value = element;
            this.prev = prev;
            this.next = next;
        }
    }
    private Node front;
    private Node rear;
    private int size;
    protected void enqueue(Object element){
        rear = new Node(element, null, rear);
        if (isEmpty())
            front = rear;
        else
            rear.next.prev = rear;
        size++;
    }
    protected Object element() {
        return front.value;
    }
    protected void dequeue() {
        if (front.prev != null)
            front.prev.next = null;
        front = front.prev;
        size--;
    }

    protected int size(){
        return size;
    }

    protected boolean isEmpty(){
        return front == null;
    }

    public void print(){
        Node elem = front;
        for(int i = 0; i < size; i++){
            System.out.print(elem.value + " ");
            elem = elem.prev;
        }
    }

    public static void main(String[] args) {
        LinkedQueue temp = new LinkedQueue();
        temp.enqueue(5);
        temp.enqueue(6);
        temp.enqueue(7);
        System.out.println("Текущее состояние очереди: ");
        temp.print();
        System.out.println("\nПервый элемент в очереди: " + temp.element());
        temp.dequeue();
        System.out.println("Текущее состояние очереди(после вызова dequeue): ");
        temp.print();
    }
}

