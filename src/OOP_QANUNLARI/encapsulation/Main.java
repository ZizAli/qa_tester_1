package OOP_QANUNLARI.encapsulation;

public class Main {
    public static void main(String[] args) {

        Adress adres = new Adress();

        adres.setAd("Azad ");
        adres.setSoyad( "Sailov ");
        adres.setYash(25);
        System.out.println(adres.getAd() + " " +adres.getSoyad() + "\nyasi  " + adres.getYash()+ " \ngmail adrtesi: " +adres.getEmailAdress());


    }



}
