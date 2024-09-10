package LlImplementation;

import LlImplementation.InsertAtBegin;
import LlImplementation.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {

        LinkedList head = new LinkedList(3);
        head.add(5).add(6).add(7);
        System.out.println(" head value: "+head.data);
        head = InsertAtBegin.insertAtBegin(head,69);
//        head = InsertAtBegin.insertAtBegin(head,23);
//        head = InsertAtBegin.insertAtBegin(head,22);
//        head = InsertAtBegin.insertAtBegin(head,21);
//        head = InsertAtBegin.insertAtEnd(head,88);
        head.printElements(head);
        System.out.println("-".repeat(1000));
        head = InsertAtBegin.reversList(head);
        head.printElements(head);

    }


}