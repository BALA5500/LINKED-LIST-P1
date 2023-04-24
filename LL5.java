public class LL5 {
    
    // REMOVE FIRST IN LL 
    
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
            public static int size;
    
    
            public void AddFirst(int data){
               size++;
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

            public int RemoveFirst(){

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

               size--;
                int val = head.data;
                head=head.next;
                return val;
                
            }
    
            public static void main(String[] args) {
                LL5 ll = new LL5();
            //   ll.print();
                ll.AddFirst(1);
                ll.AddFirst(2);
                ll.print();

                ll.RemoveFirst();
                ll.print();
            
    
                
            }
        
    }
    