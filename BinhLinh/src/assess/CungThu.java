package assess;

public class CungThu extends BinhLinh{
    @Override
    protected double TinhSucManh() {
        return trangBi?sucManh*=1.3:sucManh;
    }
}
