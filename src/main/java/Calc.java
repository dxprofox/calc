
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DXproFOX
 */
public class Calc {
    public static void main (String[] args)
    {
        
        
        int N;
        
        do{
        System.out.println("Masukan Angka Pertama dan Kedua = ");
        Scanner inp = new Scanner (System.in);
        int num1 ,num2;
        num1 =inp.nextInt();
        num2 =inp.nextInt();
        int ans;
        System.out.println("Masukan Metode Yang Ingin Digunakan : \n1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian");
        int choose;
        do{
            choose = inp.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Hasil penjumlahan "+num1+" dan "+ num2 +" adalah "+add(num1,num2));
                    break;
                case 2:
                    System.out.println("Hasil penjumlahan "+num1+" dan "+ num2 +" adalah "+sub(num1,num2));
                    break;
                case 3:
                    System.out.println("Hasil penjumlahan "+num1+" dan "+ num2 +" adalah "+mult(num1,num2));
                    break;
                case 4:
                    System.out.println("Hasil penjumlahan "+num1+" dan "+ num2 +" adalah "+div(num1,num2));
                    break;
                default : System.out.println("Masukkan nomor yang benar");
            }
        } while (choose>4);
            System.out.println("Apakah ingin mengulangnya?\n1.Ya\n2.Tidak");
        N=inp.nextInt();
        
        }
        while (N==1);
        
        
    }
    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
        
    }
    public static int sub(int x, int y)
    {
        int result = x - y;
        return result;
        
    }
    public static int mult(int x, int y)
    {
        int result = x * y;
        return result;
        
    }
    public static int div(int x, int y)
    {
        int result = x / y;
        return result;
        
    }
    
}
