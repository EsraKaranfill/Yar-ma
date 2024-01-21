package com.esra.Yarisma.service;

import com.esra.Yarisma.entity.Kazananlar;
import com.esra.Yarisma.repository.KazananlarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KazananlarService {
    private final KazananlarRepository repository;
    public void save(Kazananlar kazananlar){
        repository.save(kazananlar);
    }
    public List<Kazananlar> findAll(){
        return repository.findAll();
    }
}
