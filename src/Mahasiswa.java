/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Mahasiswa {
//deklarasi
    String nama, nim;
    int usia;
    double nilaiUts,nilaiUas;
//mengambil nilai dari Main class
    public Mahasiswa(String nama, String nim, int usia, double nilaiUts, double nilaiUas) {
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }
//mencari hasil nilai akhir 
    double nilaiAkhir() {
        return (nilaiUts+nilaiUas)/2;
    }
}
