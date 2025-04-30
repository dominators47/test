public class SLList {
    private class IntNode {

        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }
    public IntNode first;

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    public void addfirst(int x){
        first = new IntNode(x , first);
    }
    public int getfirst(){
        return first.item;
    }
    public static void main(String[] args) {
        SLList L = new SLList(15);
        L.addfirst(10);
        L.addfirst(5);
        System.out.println(L.getfirst());
    }
    }