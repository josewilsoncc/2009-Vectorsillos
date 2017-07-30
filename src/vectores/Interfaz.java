package vectores;

import java.awt.Toolkit;
import java.util.StringTokenizer;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz()
    {
        initComponents();
        this.setLocation((int)((Toolkit.getDefaultToolkit().getScreenSize().getWidth()-this.getWidth())/2), (int)((Toolkit.getDefaultToolkit().getScreenSize().getHeight()-this.getHeight())/2));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        miCanvas = new ElCanvas();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldEscalaDelPlano = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldVectorRojo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldVectorVerde = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldVectorAzul = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaConsola = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonGenerar = new javax.swing.JButton();
        jButtonExtras = new javax.swing.JButton();
        jComboBoxModo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Escala del plano (en pixeles):");

        jTextFieldEscalaDelPlano.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEscalaDelPlano.setText("20");

        jLabel2.setText("Vector Rojo<I,J,K>:");

        jTextFieldVectorRojo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Vector Verde<I,J,K>:");

        jTextFieldVectorVerde.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("Vector Azul<I,J,K>:");

        jTextFieldVectorAzul.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextAreaConsola.setColumns(20);
        jTextAreaConsola.setRows(5);
        jScrollPane1.setViewportView(jTextAreaConsola);

        jLabel5.setText("Consola:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Jose Wilson Capera Castaño - josewilsoncc@hotmail.com - JWCORPORACION 2010");

        jButtonGenerar.setText("Generar");
        jButtonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarActionPerformed(evt);
            }
        });

        jButtonExtras.setText("Extras");
        jButtonExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExtrasActionPerformed(evt);
            }
        });

        jComboBoxModo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vectores", "Lineas 3D y Vectores", "Lineas 3D", "Cubo 3D", "Cubo 3D y Vectores", "Cubo 3D Vectores y Lineas 3D" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(miCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEscalaDelPlano, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(jTextFieldVectorRojo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldVectorVerde, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldVectorAzul, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(jComboBoxModo, javax.swing.GroupLayout.Alignment.LEADING, 0, 264, Short.MAX_VALUE)
                            .addComponent(jButtonGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonExtras, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(miCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEscalaDelPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldVectorRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldVectorVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldVectorAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxModo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonGenerar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExtras)
                        .addGap(12, 12, 12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarActionPerformed
        try
        {
            ElCanvas.vector1 = new int[]{0,0,0};
            StringTokenizer tokensVectorRojo = new StringTokenizer(jTextFieldVectorRojo.getText(), " ,");
            if(tokensVectorRojo.hasMoreTokens())ElCanvas.vector1[0]=Integer.parseInt(tokensVectorRojo.nextToken());
            if(tokensVectorRojo.hasMoreTokens())ElCanvas.vector1[1]=Integer.parseInt(tokensVectorRojo.nextToken());
            if(tokensVectorRojo.hasMoreTokens())ElCanvas.vector1[2]=Integer.parseInt(tokensVectorRojo.nextToken());
        }
        catch(Exception e)
        {
            jTextFieldVectorRojo.setText(ElCanvas.vector1[0]+", "+ElCanvas.vector1[1]+", "+ElCanvas.vector1[2]);
        }
        try
        {
            ElCanvas.vector2 = new int[]{0,0,0};
            StringTokenizer tokensVectorVerde = new StringTokenizer(jTextFieldVectorVerde.getText(), " ,");
            if(tokensVectorVerde.hasMoreTokens())ElCanvas.vector2[0]=Integer.parseInt(tokensVectorVerde.nextToken());
            if(tokensVectorVerde.hasMoreTokens())ElCanvas.vector2[1]=Integer.parseInt(tokensVectorVerde.nextToken());
            if(tokensVectorVerde.hasMoreTokens())ElCanvas.vector2[2]=Integer.parseInt(tokensVectorVerde.nextToken());
        }
        catch(Exception e)
        {
            jTextFieldVectorVerde.setText(ElCanvas.vector2[0]+", "+ElCanvas.vector2[1]+", "+ElCanvas.vector2[2]);
        }
        try
        {
            ElCanvas.vector3 = new int[]{0,0,0};
            StringTokenizer tokensVectorAzul = new StringTokenizer(jTextFieldVectorAzul.getText(), " ,");
            if(tokensVectorAzul.hasMoreTokens())ElCanvas.vector3[0]=Integer.parseInt(tokensVectorAzul.nextToken());
            if(tokensVectorAzul.hasMoreTokens())ElCanvas.vector3[1]=Integer.parseInt(tokensVectorAzul.nextToken());
            if(tokensVectorAzul.hasMoreTokens())ElCanvas.vector3[2]=Integer.parseInt(tokensVectorAzul.nextToken());
        }
        catch(Exception e)
        {
            jTextFieldVectorAzul.setText(ElCanvas.vector3[0]+", "+ElCanvas.vector3[1]+", "+ElCanvas.vector3[2]);
        }
        try
        {
            if(Integer.parseInt(jTextFieldEscalaDelPlano.getText())>0)
            ElCanvas.estandar = Integer.parseInt(jTextFieldEscalaDelPlano.getText());
            else
            {
                jTextFieldEscalaDelPlano.setText("1");
                ElCanvas.estandar = 1;
            }
        }
        catch(Exception e)
        {
            ElCanvas.estandar = 1;
            jTextFieldEscalaDelPlano.setText("1");
        }
        ElCanvas.modo=jComboBoxModo.getSelectedIndex();
        Actualizar();
    }//GEN-LAST:event_jButtonGenerarActionPerformed

    private void jButtonExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExtrasActionPerformed
        Main.ide = new IDE();
        Main.ide.setVisible(true);
    }//GEN-LAST:event_jButtonExtrasActionPerformed

    public void Actualizar()
    {
        miCanvas.repaint();
        String cadenaSalidaConsola="";
        int volumen = 0;
        int[]VectorResultante = miCanvas.productoCruz(miCanvas.vector1, miCanvas.vector2);
        cadenaSalidaConsola+="ROJOxVERDE=<"+VectorResultante[0]+","+VectorResultante[1]+","+VectorResultante[2]+">\n";
        VectorResultante = miCanvas.productoCruz(miCanvas.vector1, miCanvas.vector3);
        cadenaSalidaConsola+="ROJOxAZUL=<"+VectorResultante[0]+","+VectorResultante[1]+","+VectorResultante[2]+">\n";
        VectorResultante = miCanvas.productoCruz(miCanvas.vector2, miCanvas.vector1);
        cadenaSalidaConsola+="VERDExROJO=<"+VectorResultante[0]+","+VectorResultante[1]+","+VectorResultante[2]+">\n";
        VectorResultante = miCanvas.productoCruz(miCanvas.vector2, miCanvas.vector3);
        cadenaSalidaConsola+="VERDExAZUL=<"+VectorResultante[0]+","+VectorResultante[1]+","+VectorResultante[2]+">\n";
        VectorResultante = miCanvas.productoCruz(miCanvas.vector3, miCanvas.vector1);
        cadenaSalidaConsola+="AZULxROJO=<"+VectorResultante[0]+","+VectorResultante[1]+","+VectorResultante[2]+">\n";
        VectorResultante = miCanvas.productoCruz(miCanvas.vector3, miCanvas.vector2);
        cadenaSalidaConsola+="AZULxVERDE=<"+VectorResultante[0]+","+VectorResultante[1]+","+VectorResultante[2]+">\n.\n";
        volumen += (miCanvas.vector1[0]*miCanvas.productoCruz(miCanvas.vector2, miCanvas.vector3)[0]);
        volumen += (miCanvas.vector1[1]*miCanvas.productoCruz(miCanvas.vector2, miCanvas.vector3)[1]);
        volumen += (miCanvas.vector1[2]*miCanvas.productoCruz(miCanvas.vector2, miCanvas.vector3)[2]);
        if(volumen<0)volumen*=-1;
        cadenaSalidaConsola+="Volumen del paralelepipedo:\n"+volumen+" u^3";
        jTextAreaConsola.setText(cadenaSalidaConsola);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExtras;
    private javax.swing.JButton jButtonGenerar;
    private javax.swing.JComboBox jComboBoxModo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaConsola;
    private javax.swing.JTextField jTextFieldEscalaDelPlano;
    private javax.swing.JTextField jTextFieldVectorAzul;
    private javax.swing.JTextField jTextFieldVectorRojo;
    private javax.swing.JTextField jTextFieldVectorVerde;
    private ElCanvas miCanvas;
    // End of variables declaration//GEN-END:variables
}