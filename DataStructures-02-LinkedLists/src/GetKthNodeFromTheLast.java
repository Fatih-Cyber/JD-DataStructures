public class GetKthNodeFromTheLast {
    public static void main(String[] args) {

        var myLinkedList= new MyLinkedList();
        for(int j=1; j<=10;j++) myLinkedList.addLast(j);
        System.out.println("Linked List----------------:");
        myLinkedList.printLinkedList();
        System.out.println(myLinkedList.getKthFromTheEnd(5));
    }
}
