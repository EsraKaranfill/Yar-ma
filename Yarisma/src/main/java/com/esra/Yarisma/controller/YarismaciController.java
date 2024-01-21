package com.esra.Yarisma.controller;

import com.esra.Yarisma.entity.Kazananlar;
import com.esra.Yarisma.entity.Yarismaci;
import com.esra.Yarisma.service.KazananlarService;
import com.esra.Yarisma.service.YarismaciService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/yarismaci")
@RequiredArgsConstructor
public class YarismaciController {
    private final YarismaciService service;
    List<Yarismaci> yarismaciList;

    @GetMapping("/save")
    public void save(){
        Yarismaci yarismaci3=Yarismaci.builder()
                .ad("Kazım")
                .username("kzmll")
                .email("kzmll@gmail.com").build();
        Yarismaci yarismaci2=Yarismaci.builder()
                .ad("Yaşar")
                .username("ysr")
                .email("ysr@gmail.com").build();
       Yarismaci yarismaci1= Yarismaci.builder()
                .ad("Esra")
                .username("esr")
                .email("esr@gmail.com").build();
       service.save(yarismaci1);
       service.save(yarismaci2);
       service.save(yarismaci3);
       yarismaciList.add(yarismaci1);
       yarismaciList.add(yarismaci2);
       yarismaciList.add(yarismaci3);

    }
    @GetMapping("/get-all")
    public List<Yarismaci> findAll(){
        return service.findAll();
    }
}
