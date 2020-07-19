/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit3;

import prosit3.Magasin;
import prosit3.Produit;

/**
 *
 * @author ASUS
 */
public class Prosit3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creation des produits
        Produit p1= new Produit(0,"coca",12.500f);
        Produit p2= new Produit(1,"fanta",10.500f);
        Produit p3= new Produit(2,"sider",16.500f);
        
        Produit p4= new Produit(3,"Cake",0.500f);
        Produit p5= new Produit(4,"jus",0.900f);
        
        //Creation des magasins
        Magasin mg = new Magasin(0,"tunis, tunisia");
        Magasin cady = new Magasin(1,"Zahra, tunisia");
        
        //l'ajout des produits
        mg.ajouterProduit(p1);
        mg.ajouterProduit(p2);
        mg.ajouterProduit(p3);
          
        cady.ajouterProduit(p4);
        cady.ajouterProduit(p5);
          //affichage des produits
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        
        //chercher p1 dans mg
        System.out.println(mg.chercher(p1));
        System.out.println(mg.chercher2(p1));
        System.out.println("cady"+cady.chercher2(p5));
        
        //chercher p5 dans mg
        System.out.println("chercher p5 dans mg "+mg.chercher(p5));
        System.out.println("chercher p5 dans mg "+mg.chercher2(p5));
        
       //affichage de chaque caracteristique d'un magasin
        System.out.println(mg.toString());
        System.out.println(cady.toString());
        
        //nombre total de tous les produits
        System.out.println( mg.nbr);
        System.out.println( cady.nbr);
        System.out.println( cady.comparer(p1, p2));
        System.out.println( p2.comparer(p1));
        
        //ajouter p5 2 fois
        cady.ajouterProduit(p5);
        
        //suppression de p2
        cady.supprimer(p5);
        System.out.println(cady.toString());
        
        System.out.println(cady.magasinsup(mg).toString());
    }
    
}
