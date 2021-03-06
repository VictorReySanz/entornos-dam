/*
 * Victor Rey Sanz
 * 18/03/2022
 */
package juego;

import java.util.ArrayList;
import java.util.Iterator;

public class Arena {
    public static ArrayList<Integer> contadorGolpes = new ArrayList<Integer>();   
    
    public static int Lucha (Personaje p1, Personaje p2, ArrayList<Integer> contGol) {
        Integer dano;
        int mlp1= p1.movimientoLucha();
        p2.setVida(p2.getVida()-mlp1);
        int mlp2= p2.movimientoLucha();
        p1.setVida(p1.getVida()-mlp2);
        dano = Integer.valueOf(mlp1 + mlp2);
        contGol.add(dano);   
        return mlp1 + mlp2;
    }
    
    public static int Lucha (GuerreroFuerte p1, Personaje p2, ArrayList<Integer> contGol, int incremento) {
        Integer dano;
        int mlp1= p1.movimientoLucha();
        p2.setVida(p2.getVida()-mlp1);
        int mlp2= p2.movimientoLucha();
        p1.setVida(p1.getVida()-mlp2);
        p1.incrementarVida(incremento);
        dano = Integer.valueOf(mlp1 + mlp2);
        contGol.add(dano);   
        return mlp1 + mlp2;
    }
    
    public static void imprimeNivelDeVida (Personaje p) {
      System.out.println("Nivel de vida del " + p.getPersonaje()+ ": " + p.getVida());   
    }
    
    public static void main(String[] args) {
      int danoLucha;
      
      Guerrero gue1 = new Guerrero();
      imprimeNivelDeVida(gue1);
      
      System.out.println();
     
      Mago mag1 = new Mago();
      imprimeNivelDeVida(mag1);

      GuerreroFuerte gue2 = new GuerreroFuerte();
      imprimeNivelDeVida(gue2);

      System.out.println("??EMPIEZA LA LUCHA!!");
     
      danoLucha = Lucha (gue1, mag1, contadorGolpes);     
      System.out.println("Da?o de la lucha 1 es " + danoLucha);
      imprimeNivelDeVida(gue1);
      imprimeNivelDeVida(mag1);

      danoLucha = Lucha (gue2, mag1, contadorGolpes);     
      System.out.println("Da?o de la lucha 2 es " + danoLucha);
      imprimeNivelDeVida(gue2);
      imprimeNivelDeVida(mag1);
     
      Guerrero gueX;
      gueX= new GuerreroFuerte();
      danoLucha = Lucha (gueX, mag1, contadorGolpes);     
      System.out.println("Da?o de la lucha 3 es " + danoLucha);
      System.out.println("Nivel de vida antes de incrementar: ");
      imprimeNivelDeVida(gueX);
      ((GuerreroFuerte)gueX).incrementarVida(danoLucha);
      System.out.println("Nivel de vida antes de incrementar: ");
      imprimeNivelDeVida(gueX);
      imprimeNivelDeVida(mag1);
     
      danoLucha = Lucha (gue1, gue2, contadorGolpes);     
      System.out.println("Da?o de la lucha 4 es " + danoLucha);
      imprimeNivelDeVida(gue1);
      imprimeNivelDeVida(gue2);
 
      danoLucha = Lucha ((GuerreroFuerte)gueX, mag1, contadorGolpes, 10);     
      System.out.println("Da?o de la lucha 5 es " + danoLucha);
      imprimeNivelDeVida(gueX);
      imprimeNivelDeVida(mag1);
 
      danoLucha = Lucha (mag1, mag1, contadorGolpes);     
      System.out.println("Da?o de la lucha 6 es " + danoLucha);
      imprimeNivelDeVida(mag1);
     
      System.out.print("\n** Contador de golpes: ");
      Iterator<Integer> iteContGolpes = contadorGolpes.iterator();
      while(iteContGolpes.hasNext()){
            System.out.print(iteContGolpes.next()+" ");
      }
      System.out.println("\n");
    }
}
