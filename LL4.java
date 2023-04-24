public class LL4 {
    
    // ADD SIZE IN LL    //   <--------------------------------------------------
    
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
            public static int size;    //  <--------------------------------------------
    
    
            public void AddFirst(int data){
                size++;     // <-----------------------------------------------
    
                Node newnode = new Node(data);
    
                if(head==null){
                    head=tail=newnode;
                    return;
                }
    
                newnode.next=head;
                head= newnode;
    
            }
            public void AddLast(int data)
            {
               size++;    //  <-------------------------------------------------------
                Node newnode = new Node(data);
    
                if(head==null)
                {
                    head=tail=newnode;
                    return;
                }
    
                tail.next=newnode;
                tail= newnode;
    
            }

            public  void AddMid(int idx,int data){
    
                if(idx==0){
                    AddFirst(data);
                    return;
                }
              
                size++;   //  <----------------------------------------------------------
        
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
                LL4 ll = new LL4();
              
                ll.AddFirst(2);
                ll.AddFirst(1);

                ll.AddLast(3);
                ll.AddLast(4);

                System.out.println("size is "+ ll.size);
    
                
            }
        
    }
    