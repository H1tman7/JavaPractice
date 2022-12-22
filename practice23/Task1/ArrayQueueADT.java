package practice23.Task1;

/*
Класс ArrayQueueADT должен реализовывать очередь в виде
абстрактного типа данных (с явной передачей ссылки на
экземпляр очереди).
 */

public class ArrayQueueADT {
    private int front = -1;
    private int rear = -1;
    private Object[] objs = new Object[8];

    public ArrayQueueADT() {
    }

    public static void enqueue(ArrayQueueADT queue, Object element) {
        if ((queue.rear + 1) % queue.objs.length != queue.front) {
            if (queue.front == -1) {
                queue.front = queue.rear = 0;
                queue.objs[queue.front] = element;
            } else {
                queue.rear = (queue.rear + 1) % queue.objs.length;
                queue.objs[queue.rear] = element;
            }
        }

    }

    public static Object element(ArrayQueueADT queue) {
        return !isEmpty(queue) ? queue.objs[queue.front] : -1;
    }

    public static Object dequeue(ArrayQueueADT queue) {
        if (!isEmpty(queue)) {
            Object tmp = queue.objs[queue.front];
            if (queue.front == queue.rear) {
                queue.front = queue.rear = -1;
            } else {
                queue.front = (queue.front + 1) % queue.objs.length;
            }

            return tmp;
        } else {
            return -1;
        }
    }

    public static int size(ArrayQueueADT queue) {
        return queue.rear - queue.front + (queue.front > queue.rear ? queue.objs.length : 0);
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.front == -1;
    }

    public static void clear(ArrayQueueADT queue) {
        while(!isEmpty(queue)) {
            dequeue(queue);
        }

    }

    public static void print(ArrayQueueADT queue) {
        if (!isEmpty(queue)) {
            Object var10001;
            int i;
            if (queue.rear >= queue.front) {
                for(i = queue.front; i < queue.rear + 1; ++i) {
                    var10001 = queue.objs[i];
                    System.out.print("" + var10001 + " ");
                }
            } else {
                for(i = queue.front; i < queue.objs.length; ++i) {
                    var10001 = queue.objs[i];
                    System.out.print("" + var10001 + " ");
                }

                for(i = 0; i < queue.rear + 1; ++i) {
                    var10001 = queue.objs[i];
                    System.out.print("" + var10001 + " ");
                }
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        ArrayQueueADT temp = new ArrayQueueADT();
        enqueue(temp, 10);
        enqueue(temp, 5);
        print(temp);
        System.out.println("Текущее состояние очереди: ");
        print(temp);
        System.out.println("Первый элемент в очереди: " + element(temp));
        dequeue(temp);
        System.out.println("Текущее состояние очереди(после вызова dequeue) ");
        print(temp);
        clear(temp);
        System.out.println("Текущее состояние очереди(после вызова clear) ");
        print(temp);
    }
}
