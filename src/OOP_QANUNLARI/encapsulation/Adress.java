package OOP_QANUNLARI.encapsulation;


public class Adress {
        private String ad;
        private String soyad;
        final private String EMAIL_ADRESS;
        private int yash;

        Adress(){
            this.ad = "Ali";
            this.soyad = "Aliyev";
            this.EMAIL_ADRESS= "ali@gmail.com";
            this.yash = 30;
        }

        public String getEmailAdress(){
            return this.EMAIL_ADRESS;
        }
        public String getAd(){
            return this.ad;}
        public String getSoyad(){
            return soyad;
            }
        public int getYash(){
            return this.yash;
    }
        public void  setAd(String ad){
                this.ad = ad;
        }
        public void setSoyad(String soyad){
            this.soyad = soyad;
        }
        public void setYash(int yash){
            this.yash = yash;
    }
    }





