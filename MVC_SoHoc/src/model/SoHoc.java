package model;

public class SoHoc {
    private int soNguyen;
    private Boolean laSoChan,laSoNguyenTo,laSoDoiXung;

    public SoHoc(int so) {

        soNguyen = so;
    }

    public int getSoNguyen() {
        return soNguyen;
    }

    public void setSoNguyen(int soNguyen) {
        this.soNguyen = soNguyen;
    }

    public Boolean getLaSoChan() {
        return laSoChan;
    }


    public Boolean getLaSoNguyenTo() {
        return laSoNguyenTo;
    }



    public Boolean getLaSoDoiXung() {
        return laSoDoiXung;
    }

    public Boolean KtraChan(){
        if(soNguyen%2!=0){
            return  false;
        }
        return true;
    }

    public Boolean KtraSoNgTo(){
        for (int i=2;i<=soNguyen/2;i++){
            if(soNguyen%i==0){
                return false;
            }
        }

        return true;
    }

    public Boolean KtraSoDoiXung(){
        char[] a = Integer.toString(soNguyen).toCharArray();
        for(int i=0;i<a.length/2-1;i++ ){
            if(a[i] != a[a.length-i-1]){
                return false;
            }
        }
        return true;
    }


}
