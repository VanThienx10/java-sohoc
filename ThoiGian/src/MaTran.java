import java.util.Arrays;
import java.util.Scanner;

public class MaTran {
    private int soHang,soCot;
    private int[][] maTrix = new int[100][100];

    public int getSoHang() {
        return soHang;
    }

    public void setSoHang(int soHang) {
        this.soHang = soHang;
    }

    public int getSoCot() {
        return soCot;
    }

    public void setSoCot(int soCot) {
        this.soCot = soCot;
    }

    public int[][] getMaTrix() {
        return maTrix;
    }

    public void setMaTrix(int[][] maTrix) {
        this.maTrix = maTrix;
    }
    Scanner sc = new Scanner(System.in);
    public int NhapSo(String mes,String error){
        int so =0;
        do{
            System.out.print(mes);
            try {
                so = Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                System.out.println(error);
            }
        }while (so<1);
        return so;
    }
    public MaTran(){
        setSoHang(NhapSo("Nhap so hang: ","Nhap ko dung !"));
        setSoCot(NhapSo("Nhap so cot: ","Nhap ko dung !"));
        setMaTrix(NhapmaTran(maTrix,soHang,soCot));
    }

    public int[][] NhapmaTran(int [][] matrix, int soCot,int soHang){
        for(int i=0;i<soHang;i++){
            for (int j=0;j<soCot;j++){
                System.out.println("Nhap matix["+i+","+j+"] = ");
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }

    public void InMaTran(){
        System.out.println("Ma tran vua nhap la: ");
        for(int i=0;i<soHang;i++){
            for (int j=0;j<soCot;j++){
                System.out.print(maTrix[i][j] +"   ");
            }
            System.out.println();
        }
    }
}
