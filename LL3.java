public class LL3 {
      
// ADD IN THE MIDDLE OF NODE

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

    public void AddFirst(int data){

        Node newnode = new Node(data);

        if(head==null){
            head=tail=newnode;
            return;
        }

        newnode.next=head;
        head= newnode;

    }
  
    // NOW ADD IN MID FUNCTION

    // we cannot call a non static function into static function

    public  void AddMid(int idx,int data){
    
        if(idx==0){
            AddFirst(data);
            return;
        }


      int i=0;
      Node temp=head;

        while(i<idx-1){
         temp=temp.next;
         i++;
        }
        
        Node newnode = new Node(data);
         
        newnode.next=temp.next;
        temp.next= newnode;

    }

    public static void main(String[] args) {
        LL3 ll = new LL3();

        ll.AddFirst(3);
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.print();

        ll.AddMid(1,5);
        ll.print();

        
    }

}
