package org.example.alisverissepeti;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {


    static LinkedList products(){
        LinkedList ls = new LinkedList();
        Product product = new Product();
        product.setTrademark("Lumberjack");
        product.setExplanation("Yüksek konforlu tasarım");
        product.setPrice(1259.99);
        product.setStars(4.5);
        product.setImageSrc("/org/example/alisverissepeti/resimler/shoe.png");
        ls.sonaEkle(product);

        product = new Product();
        product.setTrademark("Koton");
        product.setExplanation("Yüksek kalite kot pantolon");
        product.setPrice(799.99);
        product.setStars(4.2);
        product.setImageSrc("/org/example/alisverissepeti/resimler/pantolon.png");
        ls.sonaEkle(product);

        product = new Product();
        product.setTrademark("Tudors");
        product.setExplanation("%100 pamuk rahat kalıp tişört");
        product.setPrice(299.99);
        product.setStars(3.9);
        product.setImageSrc("/org/example/alisverissepeti/resimler/tisort.png");
        ls.sonaEkle(product);

        product = new Product();
        product.setTrademark("Arzum");
        product.setExplanation("Yüksek hava gücü ve benzersiz tasarım");
        product.setPrice(899.99);
        product.setStars(5);
        product.setImageSrc("/org/example/alisverissepeti/resimler/kurutma.png");
        ls.sonaEkle(product);

        product = new Product();
        product.setTrademark("Samsung");
        product.setExplanation("Ergonomik tasarım ve yüksek kalite");
        product.setPrice(2299.99);
        product.setStars(4.2);
        product.setImageSrc("/org/example/alisverissepeti/resimler/kulaklik.png");
        ls.basaEkle(product);

        product = new Product();
        product.setTrademark("Siemens");
        product.setExplanation("Zarif tasarım ve enerji tasarruflu");
        product.setPrice(2999.99);
        product.setStars(2.9);
        product.setImageSrc("/org/example/alisverissepeti/resimler/blender.png");
        ls.sonaEkle(product);

        product = new Product();
        product.setTrademark("Lescon");
        product.setExplanation("4 Bölmeli, su geçirmez, hafif çanta");
        product.setPrice(399.99);
        product.setStars(1.8);
        product.setImageSrc("/org/example/alisverissepeti/resimler/canta.png");
        ls.sonaEkle(product);

        product = new Product();
        product.setTrademark("Pensan");
        product.setExplanation("Ergonomik tasarım ve şık tasarım");
        product.setPrice(199.99);
        product.setStars(5);
        product.setImageSrc("/org/example/alisverissepeti/resimler/kalem.png");
        ls.sonaEkle(product);

        product = new Product();
        product.setTrademark("Bosch");
        product.setExplanation("Sıcaklık ayarlı, uzun kablolu su ısıtıcısı");
        product.setPrice(499.99);
        product.setStars(4.0);
        product.setImageSrc("/org/example/alisverissepeti/resimler/ketil.png");
        ls.arayaEkle(product,4);

        product = new Product();
        product.setTrademark("LC Waikiki");
        product.setExplanation("Orijinal deri, yüksek kalite ceket");
        product.setPrice(2499.99);
        product.setStars(3.5);
        product.setImageSrc("/org/example/alisverissepeti/resimler/ceket.png");
        ls.sonaEkle(product);

        product = new Product();
        product.setTrademark("Philips");
        product.setExplanation("20W A sınıf 3'lü lamba");
        product.setPrice(89.99);
        product.setStars(3.7);
        product.setImageSrc("/org/example/alisverissepeti/resimler/lamba.png");
        ls.sonaEkle(product);

        product = new Product();
        product.setTrademark("Pongori");
        product.setExplanation("Rahat tutuş ve yüksek kalite kauçuk ile top hediye");
        product.setPrice(899.99);
        product.setStars(4.6);
        product.setImageSrc("/org/example/alisverissepeti/resimler/raket.png");
        ls.sonaEkle(product);

        product = new Product();
        product.setTrademark("Mavi");
        product.setExplanation("Mavi logolu ayarlanabilir yazlık şapka");
        product.setPrice(299.99);
        product.setStars(2.7);
        product.setImageSrc("/org/example/alisverissepeti/resimler/sapka.png");
        ls.sonaEkle(product);

        product = new Product();
        product.setTrademark("Mikasa");
        product.setExplanation("Şişirilmiş Mikasa marka futbol topu");
        product.setPrice(499.99);
        product.setStars(5);
        product.setImageSrc("/org/example/alisverissepeti/resimler/top.png");
        ls.sonaEkle(product);

        product = new Product();
        product.setTrademark("My Valice");
        product.setExplanation("Fonksiyonel, modern, inovatif uygun valiz");
        product.setPrice(899.99);
        product.setStars(4.3);
        product.setImageSrc("/org/example/alisverissepeti/resimler/valiz.png");
        ls.sonaEkle(product);

        product = new Product();
        product.setTrademark("Gezer");
        product.setExplanation("İçi yünlü, sıcak tutan, rahat ev terliği");
        product.setPrice(199.99);
        product.setStars(1.3);
        product.setImageSrc("/org/example/alisverissepeti/resimler/terlik.png");
        ls.sonaEkle(product);


        return ls;
    }
    static Stack sepet = new Stack();

    static int count = 0;

    static int star = 0;

    static double totals = 0;

    static LinkedList products = App.products();

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/org/example/alisverissepeti/AnaEkran.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Sepetify");
        stage.show();


    }

    public static void main(String[] args) {

        launch();
    }
}