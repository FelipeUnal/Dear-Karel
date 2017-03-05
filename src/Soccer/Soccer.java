/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soccer;

/**
 *
 * @author Grimma
 */
public class Soccer {
    private  City Bogota;
    private  Thing balon;
    private  Robot jugador;
    
    public Soccer() {
        this.Bogota = new City(12,12);
        this.balon = new Thing (Bogota,4,9);
        this.jugador = new Robot (Bogota,4,9,Direction.WEST);
    }
    
    public void gol(){ 
        jugador.putThing();
    }

    public void jugar(){ 
        jugador.pickThing();
    }
    
    public void regate(){
        jugador.putThing();
        jugador.pickThing();
    }
  
    public void avanzar(){
        this.jugador.move();
    }
    
    public void girarIzquierda(){
        this.jugador.turnLeft();
    }
    
    public void girarDerecha(){
        for (int i=0; i<3; i=i+1){
           this.jugador.turnLeft();
           }
    }
    
}
