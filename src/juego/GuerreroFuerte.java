package juego;

public class GuerreroFuerte extends Guerrero {
    GuerreroFuerte (){
     this.ataque = 10;
     System.out.println("GuerreroFuerte--> Constructor");
    }
         
    public int movimientoLucha() {
     int golpe;
     golpe = (int)(Math.random() * this.ataque) + 5;
     System.out.println("*****Espadazo Fuerte: "+golpe+" *****");
    return golpe;
   }
    
   public void incrementarVida(int incremento) {
         this.setVida(this.getVida()+incremento);
   }
   
   public String getPersonaje() {
       return "Guerrero Fuerte";
   }
    
}