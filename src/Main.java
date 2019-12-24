public class Main {
    public static void main(String[] args) {
        //Linked List
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");
//        System.out.println(linkedList.size());
//        System.out.println(linkedList.get(2));

        System.out.println(concatAllValues(linkedList));

        //Array List
        MyArrayList arrayList = new MyArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");
        arrayList.add("7");
        arrayList.add("8");
        arrayList.add("9");
        arrayList.add("10");
        arrayList.add("11");
        arrayList.add("12");
//        System.out.println(arrayList.get(10));
        System.out.println(concatAllValues(arrayList));
    }

    public static int concatAllValues(List list){
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            result += Integer.parseInt(list.get(i));
        }
        return result;
    }
}
