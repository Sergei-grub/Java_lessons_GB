package Temp;

import java.util.LinkedList;


public class Printer {

    static class MyQueue<T> {
        private LinkedList<Object> elements = new LinkedList<>();

        public MyQueue() {
        }

        public MyQueue(LinkedList<Object> elements) {

            this.elements = elements;
        }

        public void enqueue(T element) {

            elements.add(element);
        }

        public T dequeue() {
            Object first = elements.getFirst();
            elements.removeFirst();
            return (T) first;
        }

        public Object first() {

            return elements.getFirst();
        }

        public LinkedList<Object> getElements() {
            return elements;
        }

        public void setElements(LinkedList<Object> elements) {

            this.elements = elements;
        }
    }


    public static void main(String[] args) {

        MyQueue queue = new MyQueue<>();

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