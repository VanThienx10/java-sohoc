package assess;

public class KiemSi extends BinhLinh{
    @Override
    protected double TinhSucManh() {
        return trangBi?sucManh*=1.5:sucManh;
    }
}
