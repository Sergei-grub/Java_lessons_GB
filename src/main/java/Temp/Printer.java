package Temp;


import java.util.LinkedList;

class MyQueue<T> {
    private LinkedList<T> elements = new LinkedList<>();

    public MyQueue() {
    }

    public MyQueue(LinkedList<T> elements) {
        this.elements = elements;
    }

    public void enqueue(T element) {
        elements.add(element);
    }

    public void dequeue() {
        T first = (T) elements.getFirst();
        elements.removeFirst();
    }

        public Object first() {

            return elements.getFirst();
        }

    public LinkedList<T> getElements() {
        return elements;
    }

    public void setElements(LinkedList<T> elements) {
        this.elements = elements;
    }
}

class Task_33 {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        if (args.length == 0) {
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}