package juego;

public abstract class Personaje {
  private int vida;
 
  Personaje (){
      this.vida = 100;
      System.out.println("Personaje--> Constructor");
  }
 
  public void setVida(int vida) {
      this.vida = vida;
  }
 
  public int getVida() {
      return this.vida;
  }
  public abstract int movimientoLucha();
  public abstract String getPersonaje();
 
}
