package Bchaises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColorManagerTest {

    @Test
    void getR() {
    }

    @Test
    void getB() {
    }

    @Test
    void getG() {
    }

    @Test
    void setR() {
    }

    @Test
    void setB() {
    }

    @Test
    void setG() {
    }

    @Test
    void fromBinary() {
    }

    @Test
    public void fromHexa() {
        ColorManager cm = new ColorManager();
        cm.fromHexa("#FF0B02");
        assert(cm.getR() == 255);
        assert(cm.getG() == 11);
        assert(cm.getB() == 2);
    }

    @Test
    public void testToBinary() {
        ColorManager cm = new ColorManager(3,22,254);
        String res = cm.toBinary();
        assert(res == "000000110001011011111110");
    }

    @Test
    public void testToBinary2() {
        ColorManager cm = new ColorManager(255 ,255,255);
        String res = cm.toBinary();
        assert(res == "111111111111111111111111");
    }

    @Test
    void toHexa() {
    }

    @Test
    void getIntValues() {
    }

    @Test
    public void getDoubleValues() {
        ColorManager cm = new ColorManager(255, 255, 255);
        double [] res = cm.getDoubleValues();
        double [] res2 = {1.0,1.0,1.0};
        assert(res == res2);
    }

    @Test
    public void ColorManager(){
    }

    @Test
    public void padleft() {

    }
}