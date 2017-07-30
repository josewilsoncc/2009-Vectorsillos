package vectores;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class ElCanvas extends Canvas
{
    public final static int VECTORES=0;
    public final static int LINEAS_3D_Y_VECTORES=1;
    public final static int LINEAS_3D=2;
    public final static int CUBO_3D=3;
    public final static int CUBO_3D_Y_VECTORES=4;
    public final static int CUBO_3D_VECTORES_Y_LINEAS_3D=5;

    private static int CENTROX=300;
    private static int CENTROY=300;
    public static int estandar=20;
    public static int modo=VECTORES;

    public static int[] vector1;
    public static int[] vector2;
    public static int[] vector3;

    public ElCanvas()
    {
        vector1=new int[]{0,0,0};
        vector2=new int[]{0,0,0};
        vector3=new int[]{0,0,0};
    }

    public void paint(Graphics gr)
    {
        //Pintada fondo blanco
        gr.setColor(Color.WHITE);
        gr.fillRect(0, 0, this.getWidth(), this.getHeight());
        //Pintada del plano
        if(vector1[0]!=0 || vector1[1]!=0 || vector1[2]!=0 || vector2[0]!=0 || vector2[1]!=0 || vector2[2]!=0 || vector3[0]!=0 || vector3[1]!=0 || vector3[2]!=0)
        {
            gr.setColor(new Color(125,125,125));
            gr.drawLine(CENTROX, CENTROY, 0, this.getHeight());
            gr.drawLine(CENTROX, CENTROY, this.getWidth(), this.getHeight()/2);
            gr.drawLine(CENTROX, CENTROY, this.getWidth()/2, 0);
            //Pintada Vectores
            switch(modo)
            {
                case VECTORES:
                    pintarVector(gr, vector1, Color.RED);
                    pintarVector(gr, vector2, Color.GREEN);
                    pintarVector(gr, vector3, Color.BLUE);
                    break;
                case LINEAS_3D_Y_VECTORES:
                    pintarLineas3D(gr, vector1);
                    pintarLineas3D(gr, vector2);
                    pintarLineas3D(gr, vector3);
                    pintarVector(gr, vector1, Color.RED);
                    pintarVector(gr, vector2, Color.GREEN);
                    pintarVector(gr, vector3, Color.BLUE);
                    break;
                case LINEAS_3D:
                    pintarLineas3D(gr, vector1);
                    pintarLineas3D(gr, vector2);
                    pintarLineas3D(gr, vector3);
                    break;
                case CUBO_3D:
                    pintarCubo3d(gr, vector1, vector2, vector3);
                    break;
                case CUBO_3D_Y_VECTORES:
                    pintarCubo3d(gr, vector1, vector2, vector3);
                    pintarVector(gr, vector1, Color.RED);
                    pintarVector(gr, vector2, Color.GREEN);
                    pintarVector(gr, vector3, Color.BLUE);
                    break;
                case CUBO_3D_VECTORES_Y_LINEAS_3D:
                    pintarLineas3D(gr, vector1);
                    pintarLineas3D(gr, vector2);
                    pintarLineas3D(gr, vector3);
                    pintarCubo3d(gr, vector1, vector2, vector3);
                    pintarVector(gr, vector1, Color.RED);
                    pintarVector(gr, vector2, Color.GREEN);
                    pintarVector(gr, vector3, Color.BLUE);
                    break;
            }

            //Pintada de puntos en el plano
            gr.setColor(new Color(0));
            if(estandar>1)
            for(int i = 0;i*estandar<this.getHeight();i++)
            {
                gr.drawLine(CENTROX-i*estandar, CENTROY+i*estandar, CENTROX-i*estandar, CENTROY+i*estandar);
                gr.drawLine(CENTROX+i*2*estandar,CENTROY,CENTROX+i*2*estandar,CENTROY);
                gr.drawLine(CENTROX,CENTROY-i*2*estandar,CENTROX,CENTROY-i*2*estandar);
            }
        }
        else
        {
            ImageIcon miImagenIcono = new ImageIcon(getClass().getResource("/recursos/intro.png"));
            gr.drawImage(miImagenIcono.getImage(), 0, 0, this);
        }
    }

    public void pintarLineas3D(Graphics gr, int[]vectorx)
    {
        gr.setColor(Color.lightGray);
        gr.drawLine(CENTROX, CENTROY, CENTROX - estandar*vectorx[0], CENTROY + estandar*vectorx[0]);
        gr.drawLine(CENTROX - estandar*vectorx[0], CENTROY + estandar*vectorx[0], CENTROX - estandar*vectorx[0] + estandar*2*vectorx[1], CENTROY + estandar*vectorx[0]);
        gr.drawLine(CENTROX - estandar*vectorx[0] + estandar*2*vectorx[1], CENTROY + estandar*vectorx[0], CENTROX - estandar*vectorx[0] + estandar*2*vectorx[1], CENTROY + estandar*vectorx[0] - estandar*2*vectorx[2]);
    }

    public void pintarCubo3d(Graphics gr, int[]vector1, int[]vector2, int[]vector3)
    {
        gr.setColor(Color.DARK_GRAY);
        int Ax=(2*estandar*vector1[1])-(estandar*vector1[0]);
        int Ay=(estandar*vector1[0])-(2*estandar*vector1[2]);
        int Bx=(2*estandar*vector2[1])-(estandar*vector2[0]);
        int By=(estandar*vector2[0])-(2*estandar*vector2[2]);
        int Cx=(2*estandar*vector3[1])-(estandar*vector3[0]);
        int Cy=(estandar*vector3[0])-(2*estandar*vector3[2]);
        gr.drawLine(CENTROX, CENTROY, CENTROX+Ax, CENTROY+Ay);
        gr.drawLine(CENTROX, CENTROY, CENTROX+Bx, CENTROY+By);
        gr.drawLine(CENTROX, CENTROY, CENTROX+Cx, CENTROY+Cy);
        int T1x=Ax+Bx;
        int T1y=Ay+By;
        int T2x=Ax+Cx;
        int T2y=Ay+Cy;
        int T3x=T2x+Bx;
        int T3y=T2y+By;
        int T4x=T1x+Cx;
        int T4y=T1y+Cy;
        gr.drawLine(CENTROX+Ax, CENTROY+Ay, CENTROX+T1x, CENTROY+T1y);
        gr.drawLine(CENTROX+Ax, CENTROY+Ay, CENTROX+T2x, CENTROY+T2y);
        gr.drawLine(CENTROX+T2x,CENTROY+T2y,CENTROX+T3x,CENTROY+T3y);
        gr.drawLine(CENTROX+T1x, CENTROY+T1y, CENTROX+T4x, CENTROY+T4y);
        int W1x=Bx+Ax;
        int W1y=By+Ay;
        int W2x=Bx+Cx;
        int W2y=By+Cy;
        int W3x=Cx+Ax;
        int W3y=Cy+Ay;
        int W4x=Cx+Bx;
        int W4y=Cy+By;
        gr.drawLine(CENTROX+Bx, CENTROY+By, CENTROX+W1x, CENTROY+W1y);
        gr.drawLine(CENTROX+Bx, CENTROY+By, CENTROX+W2x, CENTROY+W2y);
        gr.drawLine(CENTROX+Cx, CENTROY+Cy, CENTROX+W3x, CENTROY+W3y);
        gr.drawLine(CENTROX+Cx, CENTROY+Cy, CENTROX+W4x, CENTROY+W4y);
        int Fx=W4x+Ax;
        int Fy=W4y+Ay;
        gr.drawLine(CENTROX+W4x, CENTROY+W4y, CENTROX+Fx, CENTROY+Fy);

    }

    public void pintarVector(Graphics gr, int[]vectorx, Color color)
    {
        gr.setColor(color);
        gr.drawLine(CENTROX, CENTROY, CENTROX - estandar*vectorx[0] + estandar*2*vectorx[1], CENTROY + estandar*vectorx[0] - estandar*2*vectorx[2]);
        gr.fillRect(CENTROX - estandar*vectorx[0] + estandar*2*vectorx[1]-1, CENTROY + estandar*vectorx[0] - estandar*2*vectorx[2]-1,3,3);
    }

    public int[] productoCruz(int[]vectorA, int[]vectorB)
    {
        int[] retorno= new int[3];

        retorno[0] = (vectorA[1]*vectorB[2]-vectorB[1]*vectorA[2]);
        retorno[1] = (vectorB[0]*vectorA[2]-vectorA[0]*vectorB[2]);
        retorno[2] = (vectorA[0]*vectorB[1]-vectorB[0]*vectorA[1]);
        
        return retorno;
    }

}
