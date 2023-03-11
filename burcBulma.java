/* 
Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart

ÖDEV
Aynı örneği switch-case kullanmadan yapınız.
*/
package Java.ikinciKonu.egzersizler;

import java.util.Scanner;

public class burcBulma {
    public static void main(String[] main){
        int ay, gun;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Doğduğunuz ay: ");
        ay = scan.nextInt();

        System.out.print("Doğduğunuz gün: ");
        gun = scan.nextInt();

        if (ay == 1){
            if (gun >= 1 && gun <= 31){
                if (gun < 22){
                    System.out.print("Oğlak Burcusunuz.");
                }
                else {
                    System.out.print("Kova Burcusunuz.");
                }
            }
            else {
                System.out.print("Geçersiz bir gün girdiniz, lütfen tekrar giriniz.");
            }
        }

        else if (ay == 2){
            if (gun >= 1 && gun <= 28){
                if (gun < 20){
                    System.out.print("Kova Burcusunuz.");
                }
                else{
                    System.out.print("Balık Burcusunuz.");
                }
            }
            else {
                System.out.print("Geçersiz bir gün girdiniz, lütfen tekrar giriniz.");
            }
        }

        else if (ay == 3){
            if (gun >= 1 && gun <= 31){
                if (gun <= 21){
                    System.out.print("Balık Burcusunuz.");
                }
                else {
                    System.out.print("Koç Burcusunuz.");
                }
            }
            else {
                System.out.print("Geçersiz bir gün girdiniz, lütfen tekrar giriniz.");
            }
        }    

        else if (ay == 4){
            if (gun >= 1 && gun <= 30){
                if (gun < 21){
                    System.out.print("Koç Burcusunuz.");
                }
                else {
                    System.out.print("Boğa Burcusunuz.");
                }
            }
            else {
                System.out.print("Geçersiz bir gün girdiniz, lütfen tekrar giriniz.");
            }
        }

        else if (ay == 5){
            if (gun >= 1 && gun <= 31){
                if (gun < 22){
                    System.out.print("Boğa Burcusunuz.");
                }
                else {
                    System.out.print("İkizler Burcusunuz.");
                }
            }
            else {
                System.out.print("Geçersiz bir gün girdiniz, lütfen tekrar deneyiniz.");
            }
        }

        else if (ay == 6){
            if (gun >= 1 && gun <= 30){
                if (gun < 23){
                    System.out.print("İkizler Burcusunuz.");
                }
                else {
                    System.out.print("Yengeç Burcusunuz.");
                }
            }    
            else {
                System.out.print("Geçersiz bir gün girdiniz, lütfen tekrar deneyiniz.");
            }
        }

        else if (ay == 7){
            if (gun >= 1 && gun <= 31){
                if (gun < 23){
                    System.out.print("Yengeç Burcusunuz.");
                }
                else {
                    System.out.print("Aslan Burcusunuz.");
                }
            }   
            else {
                System.out.print("Geçersiz bir gün girdiniz, lütfen tekrar deneyiniz.");
            }
        }

        else if (ay == 8){
            if (gun >= 1 && gun <= 31){
                if (gun < 23){
                    System.out.print("Aslan Burcusunuz.");
                }
                else {
                    System.out.print("Başak Burcusunuz.");
                }
            }
            else {
                System.out.print("Geçersiz bir gün girdiniz, lütfen tekrar deneyiniz.");
            }
        }

        else if (ay == 9){
            if (gun >= 1 && gun <= 30){
                if (gun < 23){
                    System.out.print("Başak Burcusunuz.");
                }
                else {
                    System.out.print("Terazi Burcusunuz.");
                }
            }
            else {
                System.out.print("Geçersiz bir gün girdiniz, lütfen tekrar deneyiniz.");
            }
        }     

        else if (ay == 10){
            if (gun >= 1 && gun <= 31){
                if (gun < 23){
                    System.out.print("Terazi Burcusunuz.");
                }
                else {
                    System.out.print("Akrep Burcusunuz.");
                }
            }
            else {
                System.out.print("Geçersiz bir gün girdiniz, lütfen tekrar deneyiniz.");
            }
        }
       
        else if (ay == 11){
            if (gun >= 1 && gun <= 30){
                if (gun < 22){
                    System.out.print("Akrep Burcusunuz.");
                }
                else {
                    System.out.print("Yay Burcusunuz.");
                }
            }
            else {
                System.out.print("Geçersiz bir gün girdiniz, lütfen tekrar deneyiniz.");
            }
        }

        else if (ay == 12){
            if (gun >= 1 && gun <= 31){
                if (gun < 22){
                    System.out.print("Yay Burcusunuz.");
                }
                else {
                    System.out.print("Oğlak Burcusunuz.");
                }
            }
            else {
                System.out.print("Geçersiz bir gün girdiniz, lütfen tekrar deneyiniz.");
            }
        }

        else {
            System.out.print("Girilen değerler yanlış, kontrol edip tekrar giriniz.");
        }
    }
    
}
