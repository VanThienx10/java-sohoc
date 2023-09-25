package thuvien;

import java.util.Scanner;

public class InputHelper {
    static Scanner sc = new Scanner(System.in);
    public static int Nhapso(String mes, String error){
        System.out.println(mes);
        int so= 0;
        try {
            so= Integer.parseInt(sc.nextLine());
            return so;
        }catch (Exception e){
            System.out.println(error);
            return Nhapso(mes,error);
        }
    }
    public static String NhapChuoi(String mes, String error,int min, int max){
        System.out.println(mes);
        String chuoi = sc.nextLine();
        if (chuoi.length()>min &&chuoi.length()<max){
            return chuoi;
        }else {
            System.out.println(error);
            return NhapChuoi(mes, error, min, max);
        }

    }


}
