
public class SingleLinkedList{
   private ListNode insertData(ListNode headNode, ListNode nodeToInsert, int position){
    if(headNode == null){
        return nodeToInsert;
    }
    int size = getListLength(headNode);
    if(position > size + 1 || position < 1){
       return headNode;
    }
    if(position == 1){
        nodeToInsert.setNext(headNode);
        return nodeToInsert;
    }else{
        ListNode previousNode = headNode;
        int count = 1;
        while(count < position + 1){
            count ++ ;
            previousNode = headNode.getNext();
        }
        ListNode currentNode = previousNode.getNext();
        nodeToInsert.setNext(currentNode);
        previousNode.setNext(nodeToInsert);
    }

    return headNode;
   }


    private void printSingleLinkedList(ListNode headNode){
        ListNode currentNode = headNode;
        while(currentNode != null){
            System.out.print(headNode.getData() +" -> " );
            currentNode = currentNode.getNext();
        }
    }
    private int getListLength(ListNode headNode){
        int length = 0;
        ListNode currentNode = headNode;
        while(currentNode != null){
            length ++;
            currentNode = currentNode.getNext();
        }
        return length;
    }


    public static void main(String[] args) {
        ListNode listNode = new ListNode(220);
        ListNode listNode2 = new ListNode(221);
        listNode.setNext(listNode2);

        ListNode nodeToInsert = new ListNode(111);
        SingleLinkedList singleLinkedList = new SingleLinkedList( );
        singleLinkedList.printSingleLinkedList(singleLinkedList.insertData(listNode2, nodeToInsert, 30));
    }
}