/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node sortedInsert(Node head, int data) {
            Node newNode = new Node(data);
            Node curr = head;
            
            while(true) {
                if(curr.data <= data && data <= curr.next.data) break;
                
                if(curr.data > curr.next.data)
                  if(data >= curr.data || data <= curr.next.data) break;
                
                curr = curr.next;
            }
            
            newNode.next = curr.next;
            curr.next = newNode;
            if(newNode.data < head.data) return newNode;
            return head;
    }
}