package assess;

public class BinhLinh {
    protected String tenBinhLinh;
    protected double sucManh = 50;
    protected Boolean trangBi=false;

    public String getTenBinhLinh() {
        return tenBinhLinh;
    }

    public void setTenBinhLinh(String tenBinhLinh) {
        this.tenBinhLinh = tenBinhLinh;
    }

    public double getSucManh() {
        return sucManh;
    }
    public Boolean getTrangBi() {
        return trangBi;
    }

    public void setTrangBi(Boolean trangBi) {
        this.trangBi = trangBi;
    }

    protected double TinhSucManh(){
        return  trangBi ? sucManh =sucManh*1.1 : sucManh;
    }

    public void InThongTin(){
        System.out.println(tenBinhLinh+" co chi so suc manh la: "+(int)TinhSucManh());
    }


    public void ChienDau(BinhLinh bl){
        if(TinhSucManh()>bl.TinhSucManh()){
            System.out.println(getTenBinhLinh()+" thang "+ bl.getTenBinhLinh());
        }else {
            System.out.println(getTenBinhLinh()+" thua "+ bl.getTenBinhLinh());
        }
    }
}
