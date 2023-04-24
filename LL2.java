public class LL2 
{

// ADDLAST() IN LL

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

public static void main(String[] args) {
    LL2 ll = new LL2();
    ll.print();
    ll.AddLast(1);
    ll.print();
    ll.AddLast(2);
    ll.print();
}
}
