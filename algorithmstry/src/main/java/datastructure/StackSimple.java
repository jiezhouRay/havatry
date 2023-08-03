package datastructure;

/**
 * 栈
 * 链表实现
 * 最小节点为node
 */
public class StackSimple<T> {
    private Node firstNode;//第一个元素，默认为null;



    /**
     * 初始化
     */
    public StackSimple() {
        this.firstNode = createFirstNode();
    }

    /**
     * 插入元素
     */
    public void pop(T t){
        firstNode.setNode(createNode(t, firstNode.getNode()));

    }

    /**
     * 取出元素
     * 取出最后插入的元素
     */
    public Object push(){
        Node node =firstNode.getNode();
        firstNode.setNode(node.getNode());
        node.setNode(null);
        return node.getObj();
    }
    public Node createFirstNode(){
        return  createNode(null,null);
    }

    public Node createNode(T t,Node node){
        return new Node(t,node);
    }

}

class Node<T> {
    T obj;
    Node node;

    public Node(T obj, Node node) {
        this.obj = obj;
        this.node = node;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }


    /**
     *
     */
    public static void main(String[] args){
        StackSimple  stackSimple = new StackSimple<String>();
        stackSimple.pop("1");
        stackSimple.pop("2");
        stackSimple.pop("3");

        System.out.println(stackSimple.push());
        System.out.println(stackSimple.push());
        System.out.println(stackSimple.push());

    }
}
