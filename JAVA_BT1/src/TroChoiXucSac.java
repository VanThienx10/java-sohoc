import java.util.Random;
import java.util.Scanner;
import java.util.WeakHashMap;

public class TroChoiXucSac {
    private int giaTri_1, giaTri_2;
    private Boolean thang =false, hoa=false, thua=false;

    public int getGiaTri_1() {
        return giaTri_1;
    }

    public void setGiaTri_1(int giaTri_1) {
        this.giaTri_1 = giaTri_1;
    }

    public int getGiaTri_2() {
        return giaTri_2;
    }

    public void setGiaTri_2(int giaTri_2) {
        this.giaTri_2 = giaTri_2;
        if(giaTri_1>giaTri_2) thang=true;
        else if(giaTri_1==giaTri_2) hoa=true;
        else thua=true;
    }

    public Boolean getThang() {
        return thang;
    }



    public Boolean getHoa() {
        return hoa;
    }



    public Boolean getThua() {
        return thua;
    }

    Scanner sc= new Scanner(System.in);
    private int NhapGiaTri(){
        int so=0;
        Boolean ktra=false;
        do {
            try {
                System.out.print("Nhap gia tri muon cuoc: ");
                so =Integer.parseInt(sc.nextLine());
                ktra=true;
            }catch (Exception e){
                System.out.println("Nhap sai kieu gia tri !");
            }
        }while (!ktra);
        return so;
    }

    private void InThongTin(){
        if (thang) System.out.println("Nguoi choi thang");
        else if (hoa) System.out.println("Nguoi choi hoa");
        else System.out.println("Nguoi choi thua");
    }


    public void BatDau(){
        do {
            setGiaTri_1(NhapGiaTri());

            if(getGiaTri_1()<3 || getGiaTri_1()>18){
                System.out.println("Ket thuc");
                return;
            }else {
                Random rd = new Random();
                int l1 = rd.nextInt(6)+1;
                int l2 = rd.nextInt(6)+1;
                int l3 = rd.nextInt(6)+1;
                setGiaTri_2(l1+l2+l3);
                System.out.println("Ket qua: "+l1+"-"+l2+"-"+l3+" = "+(l1+l2+l3));
                InThongTin();
                thang=false;thua=false;hoa=false;
            }
        }while (getGiaTri_2()>=3 &&getGiaTri_2()<=18);
    }


}
