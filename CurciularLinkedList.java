public class CurciularLinkedList{
 
    Node head;
    int size = 0;     //삽입한 리스트 갯수
        class Node{          // Node 클래스 
            int data;
            Node next;
            
            Node(int i){
                this.data = i;
            }
        }
        
    public void insert(int i){      // 리스트에 노드 삽입 함수
        if(head == null){
            head = new Node(i);
            size +=1;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
        temp.next = new Node(i);   
        size +=1;
        
        }
       
    }
    
    public void print(){          // 리스트 출력 함수 
        Node temp = head;
        for(int i = 0; i < size+3; i++) {
        	System.out.print(temp.data+"->");
        	 temp = temp.next;
        }System.out.println("...");
    }
    
    public void makeCircle(){      // 순환을 만드는 함수 
        Node temp = head;
        Node temp1 = head;

        for(int i = 0; i < 2; i++){
            temp = temp.next;        // 3번 원소를 순환 시작노드로 설정
        }

        while(temp1.next != null){
            temp1 = temp1.next;          //temp1 마지막 원소를 가리킴
        }
        temp1.next = temp;           //temp1의 next를 시작노드로 연결하여 
        print();
    }                                //순환 만듦
    
    public int find(){          //순환의 유무 검사와 순환의 시작노드를 반환하는 함수
        Node hare=head;       
        Node tortoise=head;   
        
        while(hare.next !=null&&tortoise.next !=null){
        	hare = hare.next.next;   // 2 step씩 이동하는 포인터
        	tortoise = tortoise.next;  // 1 step씩 이동하는 포인터
        	                           //두개의 속도가 다른 포인터로 순환 구조를 확인한다.
        	
            if(hare == tortoise){     //두개의 포인터가 만난다면 순환이 있다 (속도가 빠른 포인터가 순환구조에 빠져서)
            	int d = detect(tortoise);     //시작 노드를 반환하는 함수 호출
                return d;
            }
        }
        return 0;        //두개의 포인터가 만나지 않으므로 순환이 없다(속도가 빠른 포인터랑 속도가 느린 포인터랑 만날수 없음)
        
    }
    
    public int detect(Node tortoise){        // 순환되는 부분의 시작 노드를 반환하는 함수
                                             // 순환구조의 첫 위리를 알기 위해, 두 포인터가 만난 노드에서
    	                                     //hare는 리스트 처음 위치로, tortoise는 만난 노드에서 한칸 이동후
    	                                     // 두 포인터가 다시 만나는 지점이 순환구조의 처음위치
    	
    	 Node hare = head;  // 리스트의 맨 첫 노드로                 
    	 tortoise = tortoise.next;   // hare와 tortoise가 만난 지점의 다음 노드로
    	 
    	 while(hare != tortoise) {    // 두 포인터가 같아지는 부분이 순환의 첫 노드가 된다.
    		 hare = hare.next.next;     
    		 tortoise=tortoise.next;
    	 }
 	
    	return hare.data;

       
    }
    
    public static void main(String[] args) {
    	CurciularLinkedList hello = new CurciularLinkedList();
        hello.insert(1);
        hello.insert(2);
        hello.insert(3);
        hello.insert(4);
        hello.insert(5);
        hello.insert(6);
        hello.insert(7);
        hello.insert(8);
        hello.makeCircle();
        if(hello.find() !=0){
            System.out.println("Circle's first node is "+hello.find());
        }else{
            System.out.println("NO Circle");
        }
    }
 
}


