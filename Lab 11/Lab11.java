package ua.lpnuai.Mamchur08;

public class Lab11<T1, T2, T3, T4, T5> {

    private T1 t1;
    private T2 t2;
    private T3 t3;
    private T4 t4;
    private T5 t5;

    private Node head, tail;
    private int size = 0;
    private StringBuffer str = new StringBuffer();

    public Lab11() {

    }

    public Lab11(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.t5 = t5;
    }

    public T1 getT1() {
        return t1;
    }

    public T2 getT2() {
        return t2;
    }

    public T3 getT3() {
        return t3;
    }

    public T4 getT4() {
        return t4;
    }

    public T5 getT5() {
        return t5;
    }

    public static <T1, T2, T3, T4, T5> boolean compare(Lab11<T1, T2, T3, T4, T5> ob1, Lab11<T1, T2, T3, T4, T5> ob2) {
        return ob1.getT1().equals(ob2.getT1()) && ob1.getT2().equals(ob2.getT2()) && ob1.getT3().equals(ob2.getT3())
                && ob1.getT4().equals(ob2.getT4()) && ob1.getT5().equals(ob2.getT5());
    }

    public void add(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        Node node = new Node();
        Lab11<T1, T2, T3, T4, T5> ob = new Lab11<>(t1, t2, t3, t4, t5);
        node.setData(ob);
        if (tail == null) {
            head = node;
            tail = node;
        }
        else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public Lab11<T1, T2, T3, T4, T5> get(int index) {

        if (size == 0 || size - 1 < index || index < 0) {
            return null;
        }
        Node toGet = head;
        for (int i = 0; i < index; i++) {
            toGet = toGet.getNext();
        }
        return toGet.getData();
    }

    public boolean delete(int index) {

        if (size == 0 || size < index || index < 0) {
            return false;
        }
        if (index == 0) {
            head = head.getNext();
            size--;
            return true;
        }
        if(index == size - 1) {
            tail = null;
            return true;
        }

        Node toDelete = head;
        if(head != null) {
            for(int i = 0; i < index; i++) {
                if(toDelete.getNext() == null) {
                    return false;
                }
                toDelete = toDelete.getNext();
            }
            toDelete.setNext(toDelete.getNext().getNext());
        }
        size--;
        return true;
    }

    public int size() {
        return this.size;
    }

    public String[] toArray() {
        String[] arr = new String[size];
        Node toGet = head;
        for (int i = 0; i < size - 1; i++) {
            arr[i] = toGet.getData().getT1().toString() + " " +  toGet.getData().getT2().toString() + " " +  toGet.getData().getT3().toString()
                    + " " +  toGet.getData().getT4().toString() + " " +  toGet.getData().getT5().toString();
            if(i < size - 1) {
                toGet = toGet.getNext();
            }
        }
        return arr;
    }

    @Override
    public String toString() {

        if (size == 0) {
            return null;
        }
        str.delete(0, str.length());
        Node toGet = head;
        str.append(toGet.getData().getT1().toString()).append(" ");
        str.append(toGet.getData().getT2().toString()).append(" ");
        str.append(toGet.getData().getT3().toString()).append(" ");
        str.append(toGet.getData().getT4().toString()).append(" ");
        str.append(toGet.getData().getT5().toString()).append(" ");
        for (int i = 0; i < size - 1; i++) {
            toGet = toGet.getNext();
            str.append(toGet.getData().getT1().toString()).append(" ");
            str.append(toGet.getData().getT2().toString()).append(" ");
            str.append(toGet.getData().getT3().toString()).append(" ");
            str.append(toGet.getData() .getT4().toString()).append(" ");
            str.append(toGet.getData().getT5().toString()).append(" ");
        }
        return str.toString();
    }

    public void clear() {

        if (size == 0) {
            return;
        }
        for (int i = 0; i < size; i++) {
            delete(i);
        }
    }

    private class Node {
        private Node next;
        private Lab11<T1, T2, T3, T4, T5> data;

        Node getNext() {
            return next;
        }
        void setNext(Node next) {
            this.next = next;
        }
        Lab11<T1, T2, T3, T4, T5> getData() {
            return data;
        }
        void setData(Lab11<T1, T2, T3, T4, T5> data) {
            this.data = data;
        }
    }
}
