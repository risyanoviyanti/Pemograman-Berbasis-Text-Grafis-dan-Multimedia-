/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab10soal2;

/**
 *
 * @author admin
 */
public class aritmatika1 {
    int angka;
    
     void setTambah(int bilangan1, int bilangan2) { 
        angka= bilangan1+bilangan2;
    }
     
     void setPengurangan(int bilangan1, int bilangan2) { 
        angka= bilangan1-bilangan2;
     }  
     void setPerkalian(int bilangan1, int bilangan2) { 
        angka= bilangan1*bilangan2;
     } 
     
     void setPembagian(int bilangan1, int bilangan2) { 
        angka= bilangan1/bilangan2;
     }
     
      void setPangkat(int bilangan1, int bilangan2) { 
        angka= bilangan1^bilangan2;
    }
    int getAngka() {
        return angka;
    }
  
  } 


