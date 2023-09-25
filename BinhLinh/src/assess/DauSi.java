package assess;

public class DauSi extends BinhLinh{
    @Override
    protected double TinhSucManh() {
        return trangBi?sucManh*=1.7:sucManh;
    }


}
