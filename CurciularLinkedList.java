public class CurciularLinkedList{
 
    Node head;
    int size = 0;     //������ ����Ʈ ����
        class Node{          // Node Ŭ���� 
            int data;
            Node next;
            
            Node(int i){
                this.data = i;
            }
        }
        
    public void insert(int i){      // ����Ʈ�� ��� ���� �Լ�
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
    
    public void print(){          // ����Ʈ ��� �Լ� 
        Node temp = head;
        for(int i = 0; i < size+3; i++) {
        	System.out.print(temp.data+"->");
        	 temp = temp.next;
        }System.out.println("...");
    }
    
    public void makeCircle(){      // ��ȯ�� ����� �Լ� 
        Node temp = head;
        Node temp1 = head;

        for(int i = 0; i < 2; i++){
            temp = temp.next;        // 3�� ���Ҹ� ��ȯ ���۳��� ����
        }

        while(temp1.next != null){
            temp1 = temp1.next;          //temp1 ������ ���Ҹ� ����Ŵ
        }
        temp1.next = temp;           //temp1�� next�� ���۳��� �����Ͽ� 
        print();
    }                                //��ȯ ����
    
    public int find(){          //��ȯ�� ���� �˻�� ��ȯ�� ���۳�带 ��ȯ�ϴ� �Լ�
        Node hare=head;       
        Node tortoise=head;   
        
        while(hare.next !=null&&tortoise.next !=null){
        	hare = hare.next.next;   // 2 step�� �̵��ϴ� ������
        	tortoise = tortoise.next;  // 1 step�� �̵��ϴ� ������
        	                           //�ΰ��� �ӵ��� �ٸ� �����ͷ� ��ȯ ������ Ȯ���Ѵ�.
        	
            if(hare == tortoise){     //�ΰ��� �����Ͱ� �����ٸ� ��ȯ�� �ִ� (�ӵ��� ���� �����Ͱ� ��ȯ������ ������)
            	int d = detect(tortoise);     //���� ��带 ��ȯ�ϴ� �Լ� ȣ��
                return d;
            }
        }
        return 0;        //�ΰ��� �����Ͱ� ������ �����Ƿ� ��ȯ�� ����(�ӵ��� ���� �����Ͷ� �ӵ��� ���� �����Ͷ� ������ ����)
        
    }
    
    public int detect(Node tortoise){        // ��ȯ�Ǵ� �κ��� ���� ��带 ��ȯ�ϴ� �Լ�
                                             // ��ȯ������ ù ������ �˱� ����, �� �����Ͱ� ���� ��忡��
    	                                     //hare�� ����Ʈ ó�� ��ġ��, tortoise�� ���� ��忡�� ��ĭ �̵���
    	                                     // �� �����Ͱ� �ٽ� ������ ������ ��ȯ������ ó����ġ
    	
    	 Node hare = head;  // ����Ʈ�� �� ù ����                 
    	 tortoise = tortoise.next;   // hare�� tortoise�� ���� ������ ���� ����
    	 
    	 while(hare != tortoise) {    // �� �����Ͱ� �������� �κ��� ��ȯ�� ù ��尡 �ȴ�.
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


