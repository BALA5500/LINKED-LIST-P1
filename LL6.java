public class LL6
{

// REMOVELAST() IN LL

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
        public static int size; 


        public void AddLast(int data)
        {
            size++;
            Node newnode = new Node(data);

            if(head==null)
            {
                head=tail=newnode;
                return;
            }

            tail.next=newnode;
            tail= newnode;

        }

        public int removelast(){

                if(size==0){
                // System.out.println(" ll is empty");
                 return Integer.MIN_VALUE;
                }
                else if(size ==1){
                 size=0;
                 int val=head.data;
                 head=tail=null;
                 return val;
                 
                }
                 Node prev=head;

                for(int i=0;i<size-2;i++){
                  prev=prev.next;
                }
                 int val= prev.next.data;  // TAIL.DATA
                 prev.next=null;
                 tail=prev;
                 size--;
                 return val;

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
    LL6 ll = new LL6();
   

   // ll.print();
    ll.AddLast(1);
   // ll.print();
    ll.AddLast(2);
    ll.print();
  
    

    ll.removelast();
    ll.print();
}
}
