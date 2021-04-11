/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author farul
 */
 class person {
    //Atribut OOP
   private String fName, stuId, stuStatus;
    
   //Deklarasi variabel
   public person(String fName, String stuId, String stuStatus){
       this.fName = fName;
       this.stuId = stuId;
       this.stuStatus = stuStatus;
   }   
   //Mengambil data variabel
   public String getfName() {
       return fName;
   }
   public String getstuId(){
       return stuId;
   }
   public String getstuStatus(){
       return stuStatus;
   }
}
