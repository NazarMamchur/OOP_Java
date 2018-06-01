package ua.lpnuai.Mamchur08;

import java.io.*;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Lab9 implements Collection, Serializable {

    private Node head, tail;
    private int size = 0;
    private StringBuffer str = new StringBuffer();

    public void add(String data) {

        Node node = new Node();
        node.setData(data);
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

    public String get(int index) {

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

        if (size == 0 || size - 1 < index || index < 0) {
            return false;
        }
        if (index == 0) {
            head = head.getNext();
            size--;
            return true;
        }

        Node toDelete = head;
        for (int i = 0; i < index - 1; i++) {
            toDelete = toDelete.getNext();
        }
        if (toDelete.getNext() == tail) {
            tail = toDelete;
        }
        toDelete.setNext(toDelete.getNext().getNext());
        size--;
        return true;
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {

        if (size == 0) {
            return null;
        }
        Node toGet = head;
        str.append(toGet.data).append(" ");
        for (int i = 0; i < size - 1; i++) {
            toGet = toGet.getNext();
            str.append(toGet.data).append(" ");
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

    public void remove(String string) {

        if (size == 0) {
            return;
        }
        Node toGet = head;
        for (int i = 0; i < size - 1; i++) {
            if(string.equals(toGet.getData())) {
                delete(i);
                return;
            }
            toGet = toGet.getNext();
        }
    }

    public String[] toArray() {
        String[] arr = new String[size];
        Node toGet = head;
        for (int i = 0; i < size; i++) {
            arr[i] = toGet.getData();
            if(i < size - 1) {
                toGet = toGet.getNext();
            }
        }
        return arr;
    }

    public boolean contains(String string) {
        Node toGet = head;
        for (int i = 0; i < size; i++) {
            if(string.equals(toGet.getData())) {
                return true;
            }
            if(i < size - 1) {
                toGet = toGet.getNext();
            }
        }
        return false;
    }

    public boolean containsAll(String[] arr) {
        int has = 0;
        Node toGet = head;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < size - 1; j++) {
                    if (arr[i].equals(toGet.getData())) {
                        has++;
                        break;
                    }
                    toGet = toGet.getNext();
                }
            }
            return has >= arr.length;
        } catch(NullPointerException e) {
            return false;
        }
    }

    public void save(Object object){
        try {
            FileOutputStream fos = new FileOutputStream("data.bin");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(object);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Lab9 load(){
        Lab9 list = new Lab9();
        try {
            FileInputStream fis = new FileInputStream("data.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            list = (Lab9) ois.readObject();

            ois.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Iterator getIterator() {
        return new LabIterator();
    }

    private class Node implements Serializable{
        private Node next;
        private String data;

        Node getNext() {
            return next;
        }
        void setNext(Node next) {
            this.next = next;
        }
        String getData() {
            return data;
        }
        void setData(String data) {
            this.data = data;
        }
    }
    private class LabIterator implements java.util.Iterator {

        int index = 0;
        Node node = null;

        @Override
        public boolean hasNext() {
            if(size == 0 || index >= size) {
                return false;
            }
            return true;
        }

        @Override
        public Object next(){
            if(size == 0) {
                throw new NoSuchElementException();
            }
            else if(node == null) {
                node = head;
                return node.getData();
            }
            else if(node.getNext() == null) {
                throw new NoSuchElementException();
            }
            index++;
            node = node.getNext();
            return node.getData();
        }

        @Override
        public void remove() throws UnsupportedOperationException{

        }
    }
}

interface Collection {

    Iterator getIterator();
}