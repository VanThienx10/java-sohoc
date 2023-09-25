package lib;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class InputHelper {
    private static Scanner sc = new Scanner(System.in);
    public static int NhapSo(String mes, String error){
        System.out.println(mes);
        int so =0;
        try {
            so = Integer.parseInt(sc.nextLine());
            return so;
        }catch (Exception e){
            System.out.println(error);
            return NhapSo(mes,error);
        }
    }

    public static String NhapChuoi(String mes,String error, int min , int max){
        System.out.println(mes);
        String chuoi = sc.nextLine();

        if(chuoi.trim().length()<min || chuoi.trim().length()>max){
            System.out.println(error);
            return NhapChuoi(mes, error, min, max);
        }else {
            return chuoi;
        }
    }
}
