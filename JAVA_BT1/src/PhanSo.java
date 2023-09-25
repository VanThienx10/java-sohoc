import java.util.Scanner;

public class PhanSo {
    private int tuSo, mauSo;
    Scanner sc = new Scanner(System.in);

    public PhanSo(){
        System.out.print("Nhap tu so: ");
        setTuSo(sc.nextInt());
        System.out.print("Nhap mau so: ");
        setMauSo(sc.nextInt());
    }
    public PhanSo(int tu, int mau){
        this.tuSo =tu;
        this.mauSo=mau;
    }

    public void InThongTin(){
        System.out.println(tuSo+"/"+mauSo);
    }

    public PhanSo ToiGianPS(){
        int tu =tuSo,mau =mauSo;
        if(mau==0)return null;
        while (Math.abs(tu) !=Math.abs(mau)){
            if(Math.abs(tu)>Math.abs(mau)){
                tu = Math.abs(tu)-Math.abs(mau);
            }else {
                mau = Math.abs(mau)-Math.abs(tu);
            }
        }

        return new PhanSo(tuSo/tu,mauSo/tu);
    }
    public PhanSo CongPs(PhanSo ps){
        return (new PhanSo(tuSo*ps.getMauSo()+mauSo*ps.getTuSo(),mauSo*ps.mauSo)).ToiGianPS();
    }
    public PhanSo TruPS(PhanSo ps){
        return (new PhanSo(tuSo*ps.getMauSo()-mauSo*ps.getTuSo(),mauSo*ps.mauSo)).ToiGianPS();
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }


}
