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
public class Queue {

    final private List listAntrian;

    public Queue() {
        listAntrian = new List("Queue");
    }

    public void enqueue(int dt) {
        listAntrian.sisipDiAkhir(dt);
    }

    public int dequeue() {
        return listAntrian.hapusDrDepan();
    }

    public boolean kosong() {
        return listAntrian.kosong();
    }

    public void cetak() {
        listAntrian.cetak();
    }

    public static void main(String args[]) {
        Queue q = new Queue();
        q.enqueue(10);
        q.cetak();
        q.enqueue(40);
        q.cetak();
        q.enqueue(25);
        q.cetak();
        q.enqueue(30);
        q.cetak();

        int dtHapus = 0;
        while (!q.kosong()) {
            dtHapus = q.dequeue();
            System.out.printf("%s dihapus \n", dtHapus);
            q.cetak();
        }
    }
}
