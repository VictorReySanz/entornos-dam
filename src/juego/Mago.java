/*
 * Victor Rey Sanz
 * 18/03/2022
 */
package juego;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public final class Mago extends Personaje{
    private int magia;
    private Date nacimiento;
         
    Mago (){
     this.magia = 10;
     System.out.println("Mago--> Constructor");
     
     super.setVida((int) (super.getVida()*1.1));
     
     SimpleDateFormat nacimientoM = new SimpleDateFormat("dd/MM/YYYY");
     GregorianCalendar fecha = new GregorianCalendar(2003,8,30);
     nacimiento = fecha.getTime();
     
     System.out.println("El mago nació el "+nacimientoM.format(nacimiento));
    }
         
    public int movimientoLucha() {
     int golpe;
     golpe = (int)(Math.random() * this.magia);
     System.out.println("*****Hechizo: "+golpe+" *****");
     return golpe;
    }
    public String getPersonaje() {
        return "Mago";
    }
}
