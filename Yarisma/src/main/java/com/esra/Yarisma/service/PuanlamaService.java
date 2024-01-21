package com.esra.Yarisma.service;

import com.esra.Yarisma.entity.Puanlama;
import com.esra.Yarisma.entity.Yarismaci;
import com.esra.Yarisma.repository.PuanlamaRepository;
import com.esra.Yarisma.repository.YarismaciRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PuanlamaService {
    private final PuanlamaRepository repository;
        public void save(Puanlama puanlama){
        repository.save(puanlama);
    }
    public List<Puanlama> findAll(){
        return repository.findAll();
    }
    public Puanlama findTopByOrderByPuanDesc(){
        return repository.findTopByOrderByPuanDesc();
    }
}
