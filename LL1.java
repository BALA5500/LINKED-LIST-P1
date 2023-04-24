public class LL1 {
    
// ADD FIRST IN LL

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public static Node head;
        public static Node tail;


        public void AddFirst(int data){

            Node newnode = new Node(data);

            if(head==null){
                head=tail=newnode;
                return;
            }

            newnode.next=head;
            head= newnode;

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
            LL1 ll = new LL1();
          ll.print();
            ll.AddFirst(1);
            ll.print();
            ll.AddFirst(2);
            ll.print();

            
        }
    
}
