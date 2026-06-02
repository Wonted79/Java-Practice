package collection.link;

public class MyLinkedListV2 {
    private Node first;
    private int size = 0;

    public void add(Object e){
        Node newNode = new Node(e);
        if(first == null){
            first = newNode;
        }
        else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }
    //중간에 추가
    public void add(int index , Object e){
        Node newNode = new Node(e);
        if (index == 0){
            newNode.next = first;
            first = newNode;
        }
        else {
            Node prev = getNode(index-1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }
    public Object remove(int index){
        //
        return null;
    }
    private Node getLastNode(){
        Node x = first;
        while (x.next == null){
            x = x.next;
        }
        return  x;
    }

    public Object get(int index){
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index){
        Node x = first;
        for (int i=0;i<index;i++){
            x = x.next;
        }
        return x;
    }
}
