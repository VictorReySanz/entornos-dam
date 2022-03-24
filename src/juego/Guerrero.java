/*
 * Victor Rey Sanz
 * 18/03/2022
 */
package juego;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Guerrero extends Personaje{
  protected int ataque;
  
  private Date creacion;
  
  Guerrero (){
      this.ataque = 10;
      System.out.println("Guerrero--> Constructor");
      
      SimpleDateFormat creacionG = new SimpleDateFormat("hh:mm:ss");
      GregorianCalendar fecha = new GregorianCalendar();
      creacion = fecha.getTime();
      
      System.out.println("El guerrero fue creado a las "+creacionG.format(creacion));
  }
 
  public int movimientoLucha() {
    int golpe;
    golpe = (int)(Math.random() * this.ataque);
    System.out.println("*****Espadazo: "+golpe+" *****");
    return golpe;

  }
  public String getPersonaje() {
       return "Guerrero";
  }
  
  
}
