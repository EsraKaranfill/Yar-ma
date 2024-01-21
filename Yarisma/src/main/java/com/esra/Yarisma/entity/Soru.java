package com.esra.Yarisma.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_soru")
public class Soru {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(length = 800)
    String soru;
    Integer sure;
    /**
     * cevaplar.put("A","bu doğru cevap mıdır?");
     * cevaplar.put("B","bu doğru cevap mıdır?");
     * cevaplar.put("C","bu doğru cevap mıdır?");
     * cevaplar.put("D","bu doğru cevap mıdır?");
     */
    @ElementCollection
    Map<String,String> cevaplar;
    /**
     * doğru cevap için cevaplar mapinin key i kullanılacak
     * A
     */
    String dogruCevap;
    Integer puan;
}
