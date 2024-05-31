package org.example.alisverissepeti;

public class Stack {
    Node head ;
    int top ;
    int size;
    public Stack(){
        this.head = null;
        this.top = -1;
        this.size = 10;
    }
    public void push(Product p){
        Node yeni = new Node(p);
        if (isFull()){
            System.out.println("Stack yapısı dolu !!");
        }
        else {
            if (isEmpty()){
                head = yeni;
                top++;
                System.out.println("Stack'e ilk eleman eklendi");
            }
            else {
                yeni.next = head;
                head = yeni;
                top++;
                System.out.println("Stack'e eleman eklendi.");
            }
        }
    }
    public Product pop(){
        if (isEmpty()) {
            System.out.println("Stack boş !!");
            return null;
        }
        else {
            Product temp;
            temp = head.data;
            head = head.next;
            top--;
            System.out.println("Stack'ten eleman silindi");
            return temp;
        }
    }
    public Product peek(int n){
        Node temp = head;
        for (int i = 0; i < n; i++){
            temp = temp.next;
        }
        return temp.data;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == size-1;
    }
    public void yazdir(){
        if (isEmpty()) {
            System.out.println("Stack boş!!");
        }
        else {
            Node temp = head;
            while (temp != null){
                System.out.println(temp.data.getTrademark());
                temp = temp.next;
            }
        }
    }
}
