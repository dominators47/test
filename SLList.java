public class SLList {
    private static class IntNode {

        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }
    private IntNode first;
    private  int  size;

    public SLList(int x) {
        first = new IntNode(x, null);
        size = 1;
    }

    public void addfirst(int x){
        first = new IntNode(x , first);
    }
    public int getfirst(){
        return first.item;
    }
    public void addlast(int x){
        IntNode p = first;
        while(p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }
    private static int size(IntNode p){
        if (p.next == null){
            return 1;
        }
        return 1 + size(p.next);
    }
    public int size(){
        return size(first);
    }
    public static void main(String[] args) {
        SLList L = new SLList(15);
        L.addfirst(10);
        L.addfirst(5);
        L.addlast(20);
        System.out.println(L.size());
    }
    }