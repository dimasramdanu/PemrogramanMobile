package com.example.asus.makanan;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Resep> dataResep;
    private RecyclerView listResep;
    private ResepAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateData();
        listResep   = (RecyclerView) findViewById(R.id.list_resep);

        adapter     = new ResepAdapter(this, dataResep);
        listResep.setAdapter(adapter);
        listResep.setLayoutManager(new LinearLayoutManager(this));
    }

    private void generateData() {
        dataResep = new ArrayList<>();

        dataResep.add(new Resep("Nasi Goreng", "Nasi Goreng Rumahan Spesial !!!! ",
                "<b>Bahan Utama Nasi Goreng Rumahan Spesial : </b><br>" +
                        "5 piring nasi<br>" +
                        "75 g smoke beef<br>" +
                        "2 buah sosis, potong lingkaran<br>" +
                        "2-3 butir telur ayam<br>" +
                        "100 g cumi<br>" +
                        "100 g udang<br>"+
                        "100 g kacang polong<br>"+
                        "50 g jamur kancing <br>"+
                        "100 g daging ayam yang sudah direbus,potong dadu<br>"+
                        "3 sdm mentega untuk menumis<br>"+
                        "Tomat<br>"+
                        "Mentimun<br>"+
                        "Seladah<br>"+
                        "Telur<br>"+
                        "<br>" +

                        "<b> Bahan Bumbu Nasi Goreng Rumahan Spesial:</b><br>" +
                        "2 siung bawang merah, iris<br>"+
                        "3 siung bawang putih, iris<br>"+
                        "2 buah cabai merah, iris<br>"+
                        "1/2 buah bawang bombay, cincang<br>"+
                        "1 sdm saus tomat<br>"+
                        "1 sdm saus sambal<br>"+
                        "1 sdm saus tiram<br>"+
                        "kecap manis secukupnya<br>"+
                        "sambal terasi secukupnya<br>"+
                        "garam secukupnya<br>"+
                        "merica secukupnya<br>"+
                        "<br>"+

                        "<b>Langkah Pembuatan :</b><br>" +
                                "1. Langkahh pertama masukan mentega ke dalam wajan hingga mencair.<br>\n" +
                                "2. Kemudian masukan bawang bombay kemudian bawang putih dan bawang merah yang sudah diiris hingga harum.<br>\n" +
                                "3. Masukan potongan ayam , tumis.<br>\n" +
                                "4. Kemudian masukan udang,cumi, smoke beef aduk hingga merata dan setengah matang.<br>\n" +
                                "5. Selanjutnya masukan telur hingga tercampur di atas wajan, aduk rata.<br>\n"+
                                "6. Lalu masukan jamur kancing, kacang polong dan cabai merah . Aduk hingga tercampur.<br>\n" +
                                "7. Masukan juga nasi putih dan aduk hhingga benar benar tercampur.<br>\n" +
                                "8. Kemudian masukan bumbu yang diberikan sambal terasi, hingga nasi berubah menjadi merah dan tercampur.<br>\n" +
                                "9. Jangan lupa untuk memberikan kecap manis sesuai dengan selera, aduk hingga rata.<br>\n" +
                                "10. Terakhir masukan bumbu , garam , kaldu bubuk hingga merata, aduk dan hidangkan selagi panas.<br>","nasigorengrumahan"));

        dataResep.add(new Resep("Mie Goreng", "Mie Goreng Rumahan Spesial !!!! ",
                "<b>Bahan Utama Mie Goreng Rumahan Spesial : </b><br>" +
                        "- 1 bungkus (2 potong) mie telur kering, rebus hingga matang lalu tiriskan dan tambahkan 1 sendok makan minyak goreng, aduk rata<br>" +
                        "- 5 butir kemiri sangrai<br>" +
                        "- 4 siung bawang putih<br>" +
                        "- 2 sendok makan Kecap Bango Manis Pedas Gurih<br>" +
                        "- 1/4 sendok teh lada putih bubuk<br>" +
                        "- 1/4 sendok teh garam<br>" +
                        "- 1 sendok teh gula pasir<br>" +
                        "- 5 butir bakso sapi, potong<br>" +
                        "- 100 gram udang pancet atau udang galah kupas<br>" +
                        "- 200 gram kol, potong<br>" +
                        "- 200 gram sawi hijau / caisim, potong-potong<br>" +
                        "- 2 tangkai daun bawang, potong bulat 1 cm<br>" +
                        "- 1 tangkai daun seledri, potong kasar<br>" +
                        "- 1 bungkus Royco sapi<br>" +
                        "- 2 butir telur ayam, kocok lepas<br>" +
                        "- 5 sendok makan minyak goreng<br>" +


                        "<b>Langkah Pembuatan :</b><br>" +
                        "- Tumis bumbu halus hingga harum dan matang betul, kemudian masukkan bakso, udang, tumis hingga berubah warna lalu tambahkan telur. Setelah telur matang, masukkan sayuran, Royko, garam, dan gula.<br>\n" +
                        "- Tambahkan mie dan kecap. Aduk hingga bumbu merata dengan mie.","miegorengrumahan"));


    }


}
