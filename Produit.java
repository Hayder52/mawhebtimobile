/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit3;

/**
 *
 * @author ASUS
 */
public class Produit {
    private  int id;
   private  String nom;
   private float prix;
   
   public int getId(){
       return this.id;
   }
   public void setId(int id){
       this.id=id;
   }
    
 public String getNom(){
     return this.nom;
 }   
 
 public float getPrix(){
     return this.prix;
 }   
  public void  setPrix(float prix){
   this.prix=prix;
 }    
 public void  setNom(String nom){
   this.nom=nom;
 }   
 
 public Produit (int id, String nom,float prix){
     this.id=id;
     this.nom=nom;
     this.prix=prix;
 }
   
 public Produit (){
    
 }
 @Override
 public String toString(){
     return " produit :"+this.nom+" "+this.prix;
 }
 @Override
 public boolean equals(Object o){
     if(o==null) return false;
     if (!( o instanceof Produit))
         return false;
     
     if (!((this.nom.equals(((Produit)o).nom))&&
             (this.prix==(((Produit)o).prix))))
         return false ;
     return true;
 }
 
 public boolean comparer(Produit p){
     return (this.id ==p.id)&&(this.nom.equals(p.nom))&&
             (this.prix==p.prix);
 }
 
 
 
         
         
}
