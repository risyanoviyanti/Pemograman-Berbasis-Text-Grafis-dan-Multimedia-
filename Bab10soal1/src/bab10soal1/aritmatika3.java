/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab10soal1;

/**
 *
 * @author admin
 */
public class aritmatika3 {
    int angka;
    
    void setTambah(int bi11, int bi12){
        angka= bi11+bi12;
    }
    
    void setPengurangan(int bi11, int bi12){
        angka= bi11-bi12;
    }
    
    void setPerkalian(int bi11, int bi12){
        angka= bi11*bi12;
    }
    
    void setPembagian(int bi11, int bi12){
        angka= bi11/bi12;
    }
    
    void setPangkat(int bi11, int bi12){
        angka= bi11^bi12;
    }
    int getAngka(){
        return angka;
    }
}
