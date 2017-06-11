public class Main {
   public static void main(String args[]) {
      int a = 70, b = 35;
      ArvudeErinevus arvutus = new ArvudeErinevus();
      // Arvutus klassist ArvudeErinevus
      arvutus.erinevus(a, b);

      // Arvutus klassist Kalkulatsioonid
      arvutus.liitmine(a, b);
      arvutus.korrutamine(a, b);
   }
}