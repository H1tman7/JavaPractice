package practice23.Task1;

/*
Класс ArrayQueue должен реализовывать очередь в виде класса
(с неявной передачей ссылки на экземпляр очереди).
 */

public class ArrayQueue {
    private int front = -1;
    private int rear = -1;
    private Object[] elements = new Object[8];

    public ArrayQueue() {
    }

    public void enqueue(Object element) {
        if ((this.rear + 1) % this.elements.length != this.front) {
            if (this.front == -1) {
                this.front = this.rear = 0;
                this.elements[this.front] = element;
            } else {
                this.rear = (this.rear + 1) % this.elements.length;
                this.elements[this.rear] = element;
            }
        }

    }

    public Object element() {
        return !this.isEmpty() ? this.elements[this.front] : -1;
    }

    public Object dequeue() {
        if (!this.isEmpty()) {
            Object tmp = this.elements[this.front];
            if (this.front == this.rear) {
                this.front = this.rear = -1;
            } else {
                this.front = (this.front + 1) % this.elements.length;
            }

            return tmp;
        } else {
            return -1;
        }
    }

    public int size() {
        return this.rear - this.front + 1 + (this.front > this.rear ? this.elements.length : 0);
    }

    public boolean isEmpty() {
        return this.front == -1;
    }

    public void clear() {
        while(!this.isEmpty()) {
            this.dequeue();
        }

    }

    public void print() {
        if (!this.isEmpty()) {
            Object var10001;
            int i;
            if (this.rear >= this.front) {
                for(i = this.front; i < this.rear + 1; ++i) {
                    var10001 = this.elements[i];
                    System.out.print("" + var10001 + " ");
                }
            } else {
                for(i = this.front; i < this.elements.length; ++i) {
                    var10001 = this.elements[i];
                    System.out.print("" + var10001 + " ");
                }

                for(i = 0; i < this.rear + 1; ++i) {
                    var10001 = this.elements[i];
                    System.out.print("" + var10001 + " ");
                }
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        ArrayQueue tmp = new ArrayQueue();
        tmp.enqueue(1);
        tmp.enqueue(2);
        System.out.println("Текущее состояние очереди: ");
        tmp.print();
        System.out.println("Первый элемент в очереди: " + tmp.element());
        tmp.dequeue();
        System.out.println("Текущее состояние очереди(после вызова dequeue) ");
        tmp.print();
        tmp.clear();
        System.out.println("Текущее состояние очереди(после вызова clear) ");
        tmp.print();
    }
}
