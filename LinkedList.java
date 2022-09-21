import javax.annotation.processing.SupportedSourceVersion;

java.util.*;
public class LinkedList{
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

    }
  }
     public ListNode(int data){
        this.data = data;
        this.next = null;

    }
  }
     public void display(){
         ListNode current = head;
         while(current!=null){
             System.out.println(current.data +"-->");
             current=current.next;

         }
         System.out.println("null");

     }
     public int length(){
         if(head==null){
             return 0;
         }
         int count = 0;
         ListNode current = head;
         while(current!=null){
             count++;
             current = current.next;
         }
         return count;
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
        System.out.println("Length is:"+ll.length());
    }

}     