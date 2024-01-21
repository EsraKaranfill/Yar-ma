package com.esra.Yarisma.controller;

import com.esra.Yarisma.entity.Kazananlar;
import com.esra.Yarisma.entity.Soru;
import com.esra.Yarisma.entity.Yarisma;
import com.esra.Yarisma.service.KazananlarService;
import com.esra.Yarisma.service.YarismaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/yarisma")
@RequiredArgsConstructor
public class YarismaController {
    private final YarismaService service;
    private final SoruController soruController;
    private final YarismaciController yarismaciController;

    @GetMapping("/save")
    public void save(){
        service.save(Yarisma.builder()
                .ad("BilgeKedi")
                .baslangicTarihi(System.currentTimeMillis()-(1000*60*60))
                .suresi(20L)
                .sorular(soruController.findAll())
                .yarismacilar(yarismaciController.findAll())
                .oduller(odulList)
                .build());
    }


    @GetMapping("/get-all")
    public List<Yarisma> findAll(){
        return service.findAll();
    }
    Map<Integer,String> odulList=new HashMap<>(Map.of(1,"Tam Altın"));


}
