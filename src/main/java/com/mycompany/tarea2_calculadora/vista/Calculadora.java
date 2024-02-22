package com.mycompany.tarea2_calculadora.vista;

import com.mycompany.tarea2_calculadora.controller.AbstractFactoryOperaciones;
import com.mycompany.tarea2_calculadora.controller.FactoryOperaciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author 1214k
 */
public class Calculadora extends javax.swing.JFrame implements ActionListener{

    public AbstractFactoryOperaciones factory;
    private double a, b;
    private String operacionSeleccionada;
    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        factory = new FactoryOperaciones();
        btnDivision.addActionListener(this);
        btnMultiplicacion.addActionListener(this);
        btnResta.addActionListener(this);
        btnSuma.addActionListener(this);
        btnResultado.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        btnMultiplicacion = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cascadia Mono", 1, 18)); // NOI18N
        jLabel1.setText("CALCULADORA DE OPERACIONES BASICAS");

        txtNum.setFont(new java.awt.Font("ROG Fonts", 0, 48)); // NOI18N
        txtNum.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnMultiplicacion.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        btnMultiplicacion.setText("X");

        btnSuma.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        btnSuma.setText("+");

        btnResta.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        btnResta.setText("-");

        btnDivision.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        btnDivision.setText("/");

        btnResultado.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        btnResultado.setText("=");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnSuma || e.getSource() == btnResta
                || e.getSource() == btnMultiplicacion || e.getSource() == btnDivision) {//CAPTURAR VALOR PARA LA OPERACION
            a = Double.parseDouble(txtNum.getText());
            txtNum.setText(""); //LIMPIANDO PARA EL SIGUIENTE VALOR
            operacionSeleccionada = e.getActionCommand(); // GUARDANDO LA OPERACION SELECCIONADA
        } else if (e.getSource() == btnResultado) { //CAPTURANDO EL SIGUIENTE VALOR PARA CALCULAR
            b = Double.parseDouble(txtNum.getText());
            txtNum.setText("");
            if (operacionSeleccionada.equals("+")) { // EFECTUANDO LA OPERACION SELECCIONADA
                double resultado = factory.efectuarSuma().calcular(a, b);
                txtNum.setText(String.valueOf(resultado));
            } else if (operacionSeleccionada.equals("-")) {
                double resultado = factory.efectuarResta().calcular(a, b);
                txtNum.setText(String.valueOf(resultado));
            } else if (operacionSeleccionada.equals("X")) {
                double resultado = factory.efectuarMultiplicacion().calcular(a, b);
                txtNum.setText(String.valueOf(resultado));
            } else if (operacionSeleccionada.equals("/")) {
                double resultado = factory.efectuarDivision().calcular(a, b);
                txtNum.setText(String.valueOf(resultado));
            }
        }

    }

}
