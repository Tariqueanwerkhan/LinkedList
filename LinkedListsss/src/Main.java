public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(60);
        list.insert(100, 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
//        list.insertRec(88,2);
//        list.display();



//        DLL list = new DLL();
//        list.insertFirst(7);
//        list.insertFirst(5);
//        list.insertFirst(10);
//        list.insertFirst(17);
//        list.insertLast(90);
//        list.insert(10, 65);
//        list.display();


//        CLL list = new CLL();
//        list.insert(30);
//        list.insert(21);
//        list.insert(19);
//        list.insert(23);
//        list.insert(67);
//
//        list.delete(19);
//        list.display();
    }
}