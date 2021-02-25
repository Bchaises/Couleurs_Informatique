package Bchaises;

public class ColorManager {

    // attributs
    private int R;
    private int G;
    private int B;

    // constructeur par défaut
    public ColorManager(){
        this.R = 0;
        this.G = 0;
        this.B = 0;
    }

    // constructeur paramétré
    public ColorManager(int r, int g, int b){
        this.R = r;
        this.G = g;
        this.B = b;
    }

    // constructeur en double
    public ColorManager(double r, double g, double b){
        this.R = (int)(r * 255.0);
        this.G = (int)(r * 255.0);
        this.B = (int)(r * 255.0);
    }

    // constructeur
    public ColorManager(int c){

    }


    // accesseur
    // getter
    public int getR() { return this.R; }
    public int getB() { return this.B; }
    public int getG() { return this.G; }

    // setter
    public void setR(int r) { this.R = r; }
    public void setB(int b) { this.B = b; }
    public void setG(int g) { this.G = g; }

    // méthodes
    public void fromBinary(String strBits){

        int R = 0;
        int G = 0;
        int B = 0;

        R += Integer.parseInt(strBits.substring(0,8), 2);
        G += Integer.parseInt(strBits.substring(8,16), 2);
        B += Integer.parseInt(strBits.substring(16,24), 2);

        System.out.println(strBits);
        System.out.println("[" + R + ", " + G + ", " + B + "]");
    }

    public void fromHexa(String strHexa){

        int R = 0;
        int G = 0;
        int B = 0;

        R += Integer.parseInt(strHexa.substring(1,3), 16);
        G += Integer.parseInt(strHexa.substring(3,5), 16);
        B += Integer.parseInt(strHexa.substring(5,7), 16);

        setR( R );
        setG( G );
        setB( B );
    }

    public String toBinary(){

        String R = Integer.toBinaryString(getR());
        String G = Integer.toBinaryString(getG());
        String B = Integer.toBinaryString(getB());

        return R+G+B;
    }

    public String toHexa(){

        String R = Integer.toHexString(getR());
        String G = Integer.toHexString(getG());
        String B = Integer.toHexString(getB());

        return R+G+B;
    }

    public int[] getIntValues(){
        int [] res = new int[3];

        res[0] = getR();
        res[1] = getG();
        res[2] = getB();

        return res;
    }

    public double[] getDoubleValues(){
        double [] res = new double[3];

        res[0] = (R / 255.0);
        res[1] = (G / 255.0);
        res[2] = (B / 255.0);

        return res;
    }

    public String padleft(String s, int taille){
        for(int i = 0; i < (taille - s.length()); i++){
            s = "0" + s;
        }
        return s;
    }

}
