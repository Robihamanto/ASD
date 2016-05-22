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
public class Node {

    int data;
    Node next;

    Node(int dt) {
        this(dt, null);
    }

    Node(int dt, Node node) {
        data = dt;
        next = node;
    }

    int getData() {
        return data;
    }

    Node getNext() {
        return next;
    }
}
