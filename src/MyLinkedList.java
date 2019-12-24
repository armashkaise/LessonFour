public class MyLinkedList implements List{
    private Element head;
    private int size;

    @Override
    public void add(String value){
        Element newElement = new Element(value);
        if (head == null){
            head = newElement;
        } else {
            Element lastElement;
            for (lastElement = head; lastElement.getNext() != null; lastElement = lastElement.getNext());
            lastElement.setNext(newElement);
        }
        size++;
    }
    @Override
    public String get(int index){
        boolean checkIfIndexIbBoundaries = index >= 0 && index < size;
        if (!checkIfIndexIbBoundaries) return "Значение индекса не соответствует диапазону";
        Element element = head;
        for (int i = 0; i < index; i++) {
            element = element.getNext();
        }
        return  element.getValue();
    }

    @Override
    public int size(){
        return size;
    }

    private class Element {
        private Element next;
        private String value;
        public Element(String value) {
            this.value = value;
        }
        public Element getNext() {
            return next;
        }
        public void setNext(Element next) {
            this.next = next;
        }
        public String getValue() {
            return value;
        }
        public void setValue(String value) {
            this.value = value;
        }
    }

}

