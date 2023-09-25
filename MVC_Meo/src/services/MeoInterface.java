package services;

import model.Meo;

public interface MeoInterface {
        public void addMeo(Meo meo);
        public void remakeMeo(Meo newMeo, int id);
        public void deleteMeo(int id);
        public void showFellMeo();
        public void showMeoID(int id);
        public void remakeTiengKeu(int id,String tiengnew);
}
