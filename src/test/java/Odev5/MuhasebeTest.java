package Odev5;

public class MuhasebeTest {

    int gunlukUcret=300;
    int maas;
    int pirim;

    public int maasHesaplama(int gunSayisi)
    {
        maas=(gunSayisi*gunlukUcret);
        return maas;
    }

    public int primHesaplama(int gunSayisi)
    {
        pirim = (gunSayisi-25) * 1000;
        return pirim;
    }

    public void maasKiyas(int gunSayisi)
    {
        if(gunSayisi>0 && gunSayisi<=25)
        {
            maasHesaplama(gunSayisi);
        }
        else if(gunSayisi>25)
        {
            int sonMaas=maasHesaplama(gunSayisi)+primHesaplama(gunSayisi);
        }
        else if(gunSayisi<0)
        {
            System.out.println("Gün sayısı 0 dan küçük olamaz!");
        }
        else
        {
            System.out.println("Maaş hakkı kazanılamadı");
        }
    }


}
