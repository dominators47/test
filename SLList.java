public class SLList {
    private static class IntNode {

        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }
    private IntNode sentinel;
    private  int  size;

    public SLList(){
        sentinel = new IntNode(63, null);
        size = 0;
    }

    public SLList(int x) {
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    public void addfirst(int x){
        sentinel.next = new IntNode(x , sentinel.next);
        size += 1;
    }
    public int getfirst(){
        return sentinel.next.item;
    }
    public void addlast(int x){
        size += 1;
        IntNode p = sentinel;
        while(p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }
    public int size(){
        return size;
    }
    public static void main(String[] args) {
        SLList L = new SLList();
        L.addlast(20);
        L.addfirst(15);
        System.out.println(L.size());
    }
    }