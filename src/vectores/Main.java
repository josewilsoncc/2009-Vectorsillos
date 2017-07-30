package vectores;

public class Main
{
    public static IDE ide;
    public static void main(String[] args)
    {
        ide = new IDE();
        new Interfaz().setVisible(true);
    }
}
