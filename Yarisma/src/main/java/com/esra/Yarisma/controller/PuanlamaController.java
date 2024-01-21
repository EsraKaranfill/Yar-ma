package com.esra.Yarisma.controller;

import com.esra.Yarisma.entity.Kazananlar;
import com.esra.Yarisma.entity.Puanlama;
import com.esra.Yarisma.entity.Yarismaci;
import com.esra.Yarisma.service.KazananlarService;
import com.esra.Yarisma.service.PuanlamaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/puanlama")
@RequiredArgsConstructor
public class PuanlamaController {
    private final PuanlamaService service;

    @GetMapping("/save")
    public void save(){
        service.save(Puanlama.builder()
                .yarismaciId(1L)
                .yarismaId(1L)
                .puan(80L)
                .build());
        service.save(Puanlama.builder()
                .yarismaciId(2L)
                .yarismaId(1L)
                .puan(70L)
                .build());
        service.save(Puanlama.builder()
                .yarismaciId(3L)
                .yarismaId(1L)
                .puan(60L)
                .build());
    }


    @GetMapping("/get-all")
    public List<Puanlama> findAll(){
        return service.findAll();
    }
    public Puanlama findTopByOrderByPuanDesc(){
        return service.findTopByOrderByPuanDesc();
    }
}
