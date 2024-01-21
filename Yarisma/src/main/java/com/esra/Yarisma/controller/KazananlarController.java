package com.esra.Yarisma.controller;

import com.esra.Yarisma.entity.Kazananlar;
import com.esra.Yarisma.service.KazananlarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kazananlar")
@RequiredArgsConstructor
public class KazananlarController {
    private final KazananlarService service;

    @GetMapping("/save")
    public void save(){
        Kazananlar kazanan=Kazananlar.builder()
                .yarismaciId(1L)
                .yarismaId(1L)
                .siralama(1)
                .odul("Tam altın")
                .build();
        service.save(kazanan);

    }


    @GetMapping("/get-all")
    public List<Kazananlar> findAll(){
        return service.findAll();
    }
}
