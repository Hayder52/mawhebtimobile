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
public class Magasin {
    
  private  int id;
  private String adresse;
  
  private final int CAPACITE=50;
  public Produit[] prod;
  public int nbr = 0;
  
  public Magasin(int id,String adresse){
      this.id=id;
      this.adresse=adresse;
      prod=new Produit[CAPACITE];
  } 
  
  public String getAdresse(){
     return this.adresse;
 }     
   
  public int getId(){
     return this.id;
 } 
  
 public void setAdresse(String adresse){
     this.adresse=adresse;
 } 
  public void setId(int id){
     this.id=id;
 } 
  
  public void ajouterProduit(Produit p){
      if(this.nbr<this.CAPACITE && !chercher(p)){
          prod[nbr]=p;
          nbr++;
      }else System.out.println("impossible d'inserer");
  }
  
  public boolean chercher(Produit p){
      for(int i=0;i<nbr;i++){
          if(this.prod[i].equals(p)){
              return true;
          }
      }
      return false;
  }
  public int chercher2(Produit p){
      for(int i=0;i<nbr;i++){
          if(this.prod[i].equals(p)){
              return i;
          }
      }
      return -1;
  }
  
  public void supprimer(Produit p){
      int pos = this.chercher2(p);
      if(pos>-1){
          for(int i=pos ;i<nbr-1;i++){
              prod[i]=prod[i+1];
          }
          nbr--;
          prod[nbr]=null;
      }
  }

  @Override
  public String toString(){
      String chaine ="  Magasin : { id : "+ this.id+"  adresse :"+this.adresse;
      for(int i=0;i<nbr;i++){
          chaine+=prod[i].toString();
      }
      return chaine;
  }
  public boolean comparer(Produit p1,Produit p2){
     return (p1.getId() ==p2.getId())&&(p1.getNom().equals(p2.getNom()))&&
             (p1.getPrix()==p2.getPrix());
   
   
 }
  
  public Magasin magasinsup( Magasin m) {
       if(this.nbr>m.nbr)
           return this;
       return m;
   }
}
