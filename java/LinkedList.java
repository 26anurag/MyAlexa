 import java.util.*;
 public class LinkedList{
    public  ListNode head;

    public static class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
    
}

     public void display(){
         ListNode current = head;
         while(current!=null){
             System.out.print(current.data +"-->");
             current=current.next;

         }
         System.out.print("null");

    }
     
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(6);
        ll.head.next = second;
        second.next = third;
        third.next = fourth;
        ll.display(); 
    }

}     