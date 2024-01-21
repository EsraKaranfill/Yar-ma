package com.esra.Yarisma.controller;

import com.esra.Yarisma.entity.Yarismaci;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cevap")
@RequiredArgsConstructor
public class CevapController {
    private final PuanlamaController puanlamaController;
    private final YarismaciController yarismaciController;
    private final KazananlarController kazananlarController;
    private final YarismaController yarismaController;

    @GetMapping("/en-yuksek-puanli-yarismaci")
    public Yarismaci enYuksekPuanliYarismaci(){
         Yarismaci enyuksekpuanliyarismaci=yarismaciController.findAll().stream()
                .filter(x->x.getId().equals(puanlamaController.findTopByOrderByPuanDesc()))
                 .findFirst().get();
         return enyuksekpuanliyarismaci;
    }
    @GetMapping("/kazanan-yarismaci-ve-yarisma")
    public void kazananYarismaciVeYarisma(){
        kazananlarController.findAll().stream()
                .forEach(x->{
                    System.out.println(yarismaController.findAll().stream().filter(e->e.getId().equals(x.getYarismaId())).findFirst().get().getAd());
                    System.out.println(yarismaController.findAll().stream().filter(e->e.getId().equals(x.getYarismaId())).findFirst().get().getBaslangicTarihi());
                    System.out.println(yarismaciController.findAll().stream().filter(e->e.getId().equals(x.getYarismaciId())).findFirst().get().getAd());
                });
    }
    @GetMapping("/en-cok-kazanan-yarismaci")
    public Long[] enCokKazananYarismaci(){
        Map.Entry<Long, Long> enCokTekrarEdenKisi=kazananlarController.findAll().stream()
                .collect(Collectors.groupingBy(x->x.getYarismaciId(),Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue())
                .orElseThrow();
        Long enCokTekrarEdenId=enCokTekrarEdenKisi.getKey();
        Long tekrarSayisi=enCokTekrarEdenKisi.getValue();
        return new Long[]{enCokTekrarEdenId,tekrarSayisi};
    }







}



