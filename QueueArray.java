/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT_Queue;

/**
 *
 * @author Robi
 */
public class QueueArray {


    private int[] antri;
    private int size;
    private int rear, front;
    private int count;

    public QueueArray(int size) {
        this.size = size;
        antri = new int[this.size];
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public boolean isFull() {
        return (count == size);
    }

    public void enqueue(int dt) {
        if (!isFull()) {
            this.antri[++rear] = dt;
            count++;

        } else {
            System.out.println("isFull");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int temp = antri[front];
            for (int i = 0; i < this.size - 1; i++) {
                antri[i] = antri[i + 1];
            }
            rear--;
            count--;
            return temp;
        } else {
            System.out.println("Antrian Kosong, Ihiw");
            return rear;
        }
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        for (int i = 0; i < 5; i++) {
            System.out.print("Dequeue : ");
            System.out.println(q.dequeue());
        }
        q.dequeue();
    }
}

