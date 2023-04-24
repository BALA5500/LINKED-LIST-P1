public class LL10 
{

// Remove Nth Node  FROM BACKSIDE IN LL

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

public void RemoveNthNode(int n){
    int sz = 0;
    Node temp=head;

    while(temp!=null){
        temp=temp.next;
        sz++;
    }
   // System.out.println(sz);
    if(sz==n){
        head=head.next;
        return;
    }
    int i=1;
    int iToFind=sz-n; 
    Node prev=head;

    while(i<iToFind){
        prev=prev.next;
        i++;
    }
  
    prev.next=prev.next.next;
    return;

}        



public static void main(String[] args) {
    LL10 ll = new LL10();
    ll.AddLast(1);
    ll.AddLast(2);
    ll.AddLast(3);
    ll.AddLast(4);
    ll.AddLast(5);

    ll.print();

   ll.RemoveNthNode(2);
    ll.print();
}
}
