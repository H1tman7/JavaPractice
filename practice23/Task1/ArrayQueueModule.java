package practice23.Task1;

/*
Класс ArrayQueueModule должен реализовывать один
экземпляр очереди с использованием переменных класса.
 */

public class ArrayQueueModule {
    private static int front = -1;
    private static int rear = -1;
    private static Object[] objs = new Object[8];

    public ArrayQueueModule() {
    }

    public static void enqueue(Object element) {
        if ((rear + 1) % objs.length != front) {
            if (front == -1) {
                rear = 0;
                front = 0;
                objs[front] = element;
            } else {
                rear = (rear + 1) % objs.length;
                objs[rear] = element;
            }
        }

    }

    public static Object element() {
        assert !isEmpty();

        return objs[front];
    }

    public static Object dequeue() {
        if (!isEmpty()) {
            Object tmp = objs[front];
            if (front == rear) {
                rear = -1;
                front = -1;
            } else {
                front = (front + 1) % objs.length;
            }

            return tmp;
        } else {
            return -1;
        }
    }

    public static int size() {
        return rear - front + (front > rear ? objs.length : 0);
    }

    public static boolean isEmpty() {
        return front == -1;
    }

    public static void clear() {
        while(!isEmpty()) {
            dequeue();
        }

    }

    public static void print() {
        if (!isEmpty()) {
            int i;
            Object var10001;
            if (rear >= front) {
                for(i = front; i < rear + 1; ++i) {
                    var10001 = objs[i];
                    System.out.print("" + var10001 + " ");
                }
            } else {
                for(i = front; i < objs.length; ++i) {
                    var10001 = objs[i];
                    System.out.print("" + var10001 + " ");
                }

                for(i = 0; i < rear + 1; ++i) {
                    var10001 = objs[i];
                    System.out.print("" + var10001 + " ");
                }
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(10);
        System.out.println("Текущее состояние очереди: ");
        print();
        System.out.println("Первый элемент в очереди: " + element());
        dequeue();
        System.out.println("Текущее состояние очереди(после вызова dequeue): ");
        print();
        clear();
        System.out.println("Текущее состояние очереди(после вызова clear): ");
        print();
    }
}
