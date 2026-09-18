package list;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:LRUCache
 * Description:
 */
public class LRUCache {
    class Node{
        int key,value;
        Node pre,next;
        Node(int k,int v){
            key = k;
            value = v;
        }
    }
    private int cap;
    private Map<Integer,Node> map = new HashMap<>();
    private Node head = new Node(0,0),tail = new Node(0,0);
    public LRUCache(int capacity){
        this.cap = capacity;
        head.next = tail;
        tail.pre = head;
    }
    public int get(int key){
        if (!map.containsKey(key)) return -1;
        Node node = map.get(key);
        moveToHead(node);
        return node.value;
    }

    public void put(int key,int value){
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            moveToHead(node);
        }else {
            if(map.size()>=cap){
                Node remove = tail.pre;
                removeNode(remove);
                map.remove(remove.key);
            }
            Node node = new Node(key, value);
            map.put(key,node);
            addToHead(node);
        }
    }

    private void removeNode(Node remove) {
        remove.pre.next = remove.next;
        remove.next.pre = remove.pre;
    }

    private void moveToHead(Node node) {
        removeNode(node);
        addToHead(node);
    }

    private void addToHead(Node node) {
        node.next = head.next;
        node.pre = head;
        head.next.pre = node;
        head.next = node;
    }
}
