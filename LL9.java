public class LL9 
{

// REVERSE  LL

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

        public void reverse(){

            Node prev=null;
            Node curr=tail=head;
            Node next;

            while(curr!=null){

                next=curr.next;
                curr.next=prev;
                prev = curr;
                curr=next;
            }
            head=prev;

        }

public static void main(String[] args) {
    LL9 ll = new LL9();

    ll.AddLast(1);
    ll.AddLast(2);
    ll.AddLast(3);
    ll.AddLast(4);
    ll.AddLast(5);

    ll.print();

    ll.reverse();
    ll.print();
}
}
