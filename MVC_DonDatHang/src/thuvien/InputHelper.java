package thuvien;

import java.time.LocalDate;
import java.util.Scanner;

public class InputHelper {
    static Scanner sc = new Scanner(System.in);

    public static int NhapSo(String mes, String error){
            System.out.print(mes);
            int so = 0;
            try{
                so  =Integer.parseInt(sc.nextLine());
                    return so;

            }catch (Exception e){
                System.out.println(error);
                return NhapSo(mes,error);
            }
    }
    public static String NhapChuoi(String mes,String error,int min, int max){
        System.out.print(mes);
        String value = sc.nextLine();
        if(value.length() >min && value.length()<max){
            return value;
        }else {
            System.out.println(error);
            return NhapChuoi(mes, error, min, max);
        }
    }

    public static LocalDate NhapNgayTao(int nam,int thang,int ngay){


        LocalDate ld = LocalDate.of(nam,thang,ngay);
        return ld;

    }
    public static double NhapDiem(String mes, String error){
        double diem = 0;
        Boolean check = false;
        do {
            System.out.print(mes);
            try {
                diem = sc.nextDouble();
                if(diem >=0 &&diem<=10){
                    check =true;
                }else {
                    System.out.println("Nhap sai diem !");
                }
            }catch (Exception e){
                System.out.println(error);
                sc.nextLine();
            }
        }while (!check);
        return diem;
    }
}
