public class _2_singleLinkedList {
    static class node {
        int data;
        node next;

        node(int value) {
            data = value;
            next = null;
        }
    }

    static node head;

    // display the list
    static void printList() {
        node p = head;
        System.out.print("\n[");

        // start from the beginning
        while (p != null) {
            System.out.print(" " + p.data + " ");
            p = p.next;
        }
        System.out.print("]");
    }

    // insertion at the beginning
    static void insertatbegin(int data) {

        // create a link
        node lk = new node(data);

        // point it to old first node
        lk.next = head;

        // point first to new first node
        head = lk;
    }

    // insertion at the end
   static void insertatend(int data) {
        node lk = new node(data);
        node link = head;

        //start until last node
        while(link.next != null) {
            link = link.next;
        }

        link.next = lk;
   }

   static void deleteatbegin() {
        head = head.next;
   }

   //reversal of linked list
   static void reverseLinkedList() {
        node prev = null;
        node curr = head;
        node temp = null;

        while(curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        head = prev;
   }

    public static void main(String args[]) {
        int k = 0;
        insertatbegin(12);
        insertatbegin(22);
        insertatbegin(30);
        insertatbegin(44);
        insertatbegin(50);
        insertatbegin(33);
        insertatend(30);
        deleteatbegin();
        System.out.println("Linked List: ");

        // print list
        printList();

        reverseLinkedList();

        printList();
    }
}