package com.esra.Yarisma.controller;

import com.esra.Yarisma.entity.Kazananlar;
import com.esra.Yarisma.entity.Soru;
import com.esra.Yarisma.service.KazananlarService;
import com.esra.Yarisma.service.SoruService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/soru")
@RequiredArgsConstructor
public class SoruController {
    private  final SoruService service;
    List<Soru> soruList=new ArrayList<>();

    @GetMapping("/save")
    public void save(){
        Soru soru1=Soru.builder()
                .soru("Java'da hangi anahtar kelime ile bir sınıf tanımlanır?")
                .sure(10)
                .cevaplar(new HashMap<>(Map.of("A","class","B","interface",
                        "C","object","D","enum")))
                .dogruCevap("A")
                .puan(10).build();

        Soru soru2=Soru.builder()
                .soru("Dünyanın en büyük okyanusu hangisidir?")
                .sure(10)
                .cevaplar(new HashMap<>(Map.of("A","Atlantik","B","Hint",
                        "C","Arktik","D","Pasifik")))
                .dogruCevap("D")
                .puan(10).build();
        Soru soru3=Soru.builder()
                .soru("Hangi gezegen Güneş Sistemi'ndeki en büyük gezegendir?")
                .sure(10)
                .cevaplar(new HashMap<>(Map.of("A","Mars","B","Jüpiter",
                        "C","Venüs","D","Satürn")))
                .dogruCevap("B")
                .puan(10).build();
        Soru soru4=Soru.builder()
                .soru("İnsan vücudundaki en büyük organ nedir?")
                .sure(10)
                .cevaplar(new HashMap<>(Map.of("A","Kalp","B","Akciğer",
                        "C","Deri","D","Karaciğer")))
                .dogruCevap("C")
                .puan(10).build();
        Soru soru5=Soru.builder()
                .soru("En yüksek dağ zirvesi nedir?")
                .sure(10)
                .cevaplar(new HashMap<>(Map.of("A","Kilimanjaro","B","Denali",
                        "C","Everest","D","Aconcagua")))
                .dogruCevap("C")
                .puan(10).build();
        Soru soru6=Soru.builder()
                .soru("Hangi elementin sembolü Hg dır?")
                .sure(10)
                .cevaplar(new HashMap<>(Map.of("A","Gümüş","B","Civa",
                        "C","Altın","D","Demir")))
                .dogruCevap("B")
                .puan(10).build();
        Soru soru7=Soru.builder()
                .soru("Hangi renk karışımı moru oluşturur?")
                .sure(10)
                .cevaplar(new HashMap<>(Map.of("A","Kırmızı ve Mavi","B","Sarı ve Yeşil",
                        "C","Mavi ve Yeşil","D","Kırmızı ve Sarı")))
                .dogruCevap("A")
                .puan(10).build();
        Soru soru8=Soru.builder()
                .soru("DNA'nın açılımı nedir?")
                .sure(10)
                .cevaplar(new HashMap<>(Map.of("A","Dinamik Nükleik Asit","B","Deoksiribonükleik Asit",
                        "C","Duygusal Nükleer Aktarım","D","Dolaşımdaki Nükleik Asit")))
                .dogruCevap("B")
                .puan(10).build();
        Soru soru9=Soru.builder()
                .soru("En kalabalık şehir hangisidir?")
                .sure(10)
                .cevaplar(new HashMap<>(Map.of("A","Pekin","B","İstanbul",
                        "C","Tokyo","D","Delhi")))
                .dogruCevap("C")
                .puan(10).build();
        Soru soru10=Soru.builder()
                .soru("Hangi gezegen Kırmızı Gezegen olarak bilinir?")
                .sure(10)
                .cevaplar(new HashMap<>(Map.of("A","Venüs","B","Mars",
                        "C","Jüpiter","D","Uranüs")))
                .dogruCevap("B")
                .puan(10).build();
        service.save(soru1);
        service.save(soru2);
        service.save(soru3);
        service.save(soru4);
        service.save(soru5);
        service.save(soru6);
        service.save(soru7);
        service.save(soru8);
        service.save(soru9);
        service.save(soru10);
        soruList.add(soru1);
        soruList.add(soru2);
        soruList.add(soru3);
        soruList.add(soru4);
        soruList.add(soru5);
        soruList.add(soru6);
        soruList.add(soru7);
        soruList.add(soru8);
        soruList.add(soru9);
        soruList.add(soru10);
    }


    @GetMapping("/get-all")
    public  List<Soru> findAll(){
        return service.findAll();
    }
}
