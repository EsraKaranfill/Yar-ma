package com.esra.Yarisma;

import com.esra.Yarisma.controller.PuanlamaController;
import com.esra.Yarisma.entity.Puanlama;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YarismaApplication {

	public static void main(String[] args) {


		SpringApplication.run(YarismaApplication.class, args);
	}
	/**
	 * SORU!!!!
	 *
	 * Repositoryler oluşturulacak
	 * Controller ve servis katmanlarında methodlar simdilik birbirinin
	 * kopyası olacak şekilde yazılsın
	 * -> Controller -> Save();
	 * -> Service -> Save();
	 * -----------------
	 * 1. adet yarışma oluşturun.
	 * 10 adet soru
	 * 3 adet yarışmacı
	 * 1 adet ödül olsun kazanan 1 kişi kazananlar tablosuna eklensin
	 * her bir yarışmacıya puan verilecek
	 * 1. 2. 3. şeklinde sıralansınlar
	 * --------------------
	 * Sorgular;
	 * - yarışmaların kazananları kimlerdir? [yarışma adı, tarihi, kazanan kullanıcı]
	 * - Tüm zamanların en yüksek puanını alan yarışmacı kimdir?
	 * - en çok yarışma kazanan kullanıcı kimdir?
	 *
	 *
	 */

}
