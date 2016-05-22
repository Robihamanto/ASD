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
public class List {

    private Node nodeAwal;
    private Node nodeAkhir;
    private String nama;

    public List() {
        this("list");
    }

    public List(String namaList) {
        nama = namaList;
        nodeAwal = nodeAkhir = null;
    }

    public void sisipDiAwal(int dt) {
        if (kosong()) {
            nodeAwal = nodeAkhir = new Node(dt);
        } else {
            nodeAwal = new Node(dt, nodeAwal);
        }
    }

    public void sisipDiAkhir(int dt) {
        if (kosong()) {
            nodeAwal = nodeAkhir = new Node(dt);
        } else {
            nodeAkhir = nodeAkhir.next = new Node(dt);
        }
    }

    public int hapusDrDepan() {
        int itemDihapus = -1;
        if (!kosong()) {
            itemDihapus = nodeAwal.data;
            if (nodeAwal == nodeAkhir) {
                nodeAwal = nodeAkhir = null;
            } else {
                nodeAwal = nodeAwal.next;
            }
        }

        return itemDihapus;
    }

    public boolean kosong() {
        return nodeAwal == null;
    }

    public void cetak() {
        if (kosong()) {
            System.out.printf("Kosong %s\n", nama);
            return;
        }

        System.out.printf("Isi %s adalah : ", nama);
        Node kini = nodeAwal;

        while (kini != null) {
            System.out.printf("%s ", kini.data);
            kini = kini.next;
        }

        System.out.println("\n");
    }
}
