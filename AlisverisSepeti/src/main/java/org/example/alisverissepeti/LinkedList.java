package org.example.alisverissepeti;

public class LinkedList {
    Node head;

    public LinkedList(){
        this.head = null;

    }
    public void basaEkle(Product product){
        Node urun = new Node(product);
        if (head == null){
            head = urun;
            System.out.println("Listeye ilk eleman eklendi");
        }
        else {
            urun.next = head;
            head = urun;
            System.out.println("Eleman listenin başına eklendi");
        }
    }
    public void arayaEkle(Product product,int n){
        Node urun = new Node(product);
        Node temp1 = head;
        int j = 0;
        while (temp1 != null){
            temp1 = temp1.next;
            j++;
        }
        if (j < n){
            System.out.println("Lütfen dizi boyutunu aşmayan bir değer giriniz");
        }
        else {
            Node temp = head;
            for (int i = 0; i < n-1; i++){
                temp = temp.next;
            }
            urun.next = temp.next;
            temp.next = urun;
            System.out.println("Eleman " + n + ". indise yerleştirildi.");
        }
    }
    public void sonaEkle(Product product){
        Node urun = new Node(product);
        if (head == null){
            head = urun;
            System.out.println("Listeye ilk eleman eklendi");
        }
        else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = urun;
            System.out.println("Eleman sona eklendi.");
        }
    }
    public void yazdir(){
        Node temp = head;
        while (temp.next != null){
            System.out.println("Marka: " + temp.data.getTrademark());
            System.out.println("Açıklama: " + temp.data.getExplanation());
            System.out.println("Fiyat: " + temp.data.getPrice());
            System.out.println("Değerlendirme: " + temp.data.getStars() + "\n");
            temp = temp.next;
        }
    }


}
