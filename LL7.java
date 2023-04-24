public class LL7 
{

//  SEARCH FOR KEY USING ITERATION

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

// ITERATIVE SEARCH -------------------------------------------------------

        public int itrsearch(int key){
            int idx=0;
            Node temp=head;

            while(temp!=null){
                if(temp.data==key){
                    return idx;
                }
                temp=temp.next;
                idx++;
            }

            return -1;
        }


//  OR

        public int itr(int key){

            Node temp=head;
            for(int i=0;i<size;i++){
                
                if(temp.data==key){
                    return i;
            
                }
                temp=temp.next;
            }
            return -1;

        }

public static void main(String[] args) {
    LL7 ll = new LL7();
   // ll.print();
    ll.AddLast(1);
   // ll.print();
    ll.AddLast(2);
    ll.print();

    System.out.println(ll.itrsearch(2));
}
}
