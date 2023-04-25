public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentaCanal(){
        canal++;
    }
    public void diminuiCanal(){
        canal--;
    }
    public void aumentaVolume(){
        volume++;
    }
    public void diminuiVolume(){
        volume--;
    }
}
