public class LL8
{

//  SEARCH FOR A KEY USING RECURSION

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

        public int helper(Node head,int key){
            if(head== null){
                return -1;
            }
            if(head.data==key){
                return 0;
            }

            int idx=helper(head.next,key);
            if(idx== -1){
                return -1;
            }

            return idx+1 ;
        }

        public int recsearch(int key){
            return helper( head,key);

        }

public static void main(String[] args) {
    LL8 ll = new LL8();
    ll.print();
    ll.AddLast(1);
    ll.print();
    ll.AddLast(2);
    ll.print();

    System.out.println(ll.recsearch(2));
}
}
