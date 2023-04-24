public class LL11 
{

// CHECK PALINDROME LL

   public static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
        public static Node head;
        public static Node tail;


        public void AddLast(int data)
        {

            Node newnode = new Node(data);

            if(head==null)
            {
                head=tail=newnode;
                return;
            }

            tail.next=newnode;
            tail= newnode;

        }

        public void print(){
            if(head == null){
                System.out.println(" LL is empty");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"-> ");
                temp=temp.next;
            }
            System.out.println("null");

        }


        public Node FindMid(Node head){
            Node slow = head;
            Node fast = head;

            while(fast!=null && fast.next!= null){
                 
                slow=slow.next;
                fast=fast.next.next;

            }
            return slow;
        }

        public boolean checkPalidrome(){

            if(head == null || head.next == null){
                return true;
            }
          // step 1
            Node midNode = FindMid(head);
            //System.out.println(midNode.data);

            // step 2
           Node prev= null;
           Node curr= midNode;
           Node next;

           while(curr!=null){
             next= curr.next;
             curr.next= prev;
             prev=curr;
             curr=next;
           }

           Node right = prev;
           Node left = head;
        
           

           // step 3

           while(right!=null){

            if(left.data!=right.data){
            return false;
            }

            right=right.next;
            left=left.next;
           
           }

           return true;
        }

public static void main(String[] args) {
    LL11 ll = new LL11();
    ll.AddLast(1);
    ll.AddLast(5);
    ll.AddLast(3);
    ll.AddLast(5);
    ll.AddLast(1);

    ll.print();

    System.out.println(ll.checkPalidrome());
   
}
}
