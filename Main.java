

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(15);
        list.insert(35);
        list.insert(16);
        list.insertAtStart(22);

        list.insertAt(0,50);

        list.insertAt(2, 33);

        list.deleteAt(2);
        list.show();



    }
}