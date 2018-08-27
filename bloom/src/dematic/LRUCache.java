package dematic;
import java.util.*;
public class LRUCache {
	int capacity;
    HashMap<Integer, Node> map = new HashMap<Integer, Node>();
    Node head=null;
    Node end=null;
 
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
 
    public int get(int key) {
        if(map.containsKey(key)){
            Node n = map.get(key);
            deleteNode(n);
            setHead(n);
            return n.value;
        }
        return -1;
    }
    public void deleteNode(Node n){
        if(n.left!=null){
            n.left.right = n.right;
        }else{
            head = n.right;
        }
        if(n.right!=null){
            n.right.left = n.left;
        }else{
            end = n.left;
        }
    }
 
    public void setHead(Node n){
        n.right = head;
        n.left = null;
        if(head!=null)
            head.left = n;
        head = n;
        if(end ==null)
            end = head;
    }
 
    public void set(int key, int value) {
        if(map.containsKey(key)){
            Node old = map.get(key);
            old.value = value;
            deleteNode(old);
            setHead(old);
        }else{
            Node newNode = new Node(key, value);
            if(map.size()>=capacity){
                map.remove(end.key);
                deleteNode(end);
                setHead(newNode);
            }else{
                setHead(newNode);
            }    
            map.put(key, newNode);
        }
    }
    public void print() {
    	while(head!=null) {
    		System.out.println(head.value);
    		head=head.right;
    	}
    }

}
