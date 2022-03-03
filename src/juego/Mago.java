package juego;

public final class Mago extends Personaje{
    private int magia;
         
    Mago (){
     this.magia = 10;
     System.out.println("Mago--> Constructor");
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