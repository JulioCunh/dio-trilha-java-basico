public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }

  public void aumentarVolume() {
    volume++;
    System.out.println("aumentarVolume " + volume);
  }

  public void diminuirVolume() {
    volume--;
    System.out.println("diminuirVolume " + volume);
  }

  public void mudarCanal(int NovoCanal) {
    canal = NovoCanal;
    System.out.println("mudarCanal " + canal);
  }

  public void aumentarCanal() {
    canal++;
  }

  public void diminuirCanal() {
    canal--;
  }

}
