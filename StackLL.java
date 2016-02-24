/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT_ArrayStack;

/**
 *
 * @author Robi
 */
class NodeLL {

    int data;
    NodeLL next;
}

public class StackLL {

    NodeLL pointer;

    public void push(int data) {
        NodeLL baru = new NodeLL();
        baru.data = data;
        if (pointer == null) {
            pointer = baru;
        } else {
            baru.next = pointer;
            pointer = baru;
        }
    }

    public int pop() {
        int pop = -1;
        if (!isEmpty()) {
            pop = pointer.data;
            pointer = pointer.next;
        }
        return pop;
    }

    public void cetak(String kom) {
        System.out.println(kom);
        NodeLL cetak = pointer;
        while (cetak != null) {
            System.out.print(cetak.data + " → ");
            cetak = cetak.next;
        }
        System.out.println("NULL");
    }

    public boolean isEmpty() {
        return pointer == null ? true : false;
    }

    public static void main(String[] args) {
        StackLL sll = new StackLL();
        sll.push(10);
        sll.push(1);
        sll.push(7);
        sll.push(12);
        sll.push(4);
        sll.cetak("Stack Awal");
        sll.pop();
        sll.cetak("Stack setelah di pop");

    }

}
