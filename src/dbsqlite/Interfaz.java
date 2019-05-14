package dbsqlite;

import javax.swing.JOptionPane;
import java.sql.SQLException;

public class Interfaz extends javax.swing.JFrame{

    public Interfaz(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SQLite");

        jButton1.setText("Insertar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Consultar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String nombre = JOptionPane.showInputDialog(null, "Introduzca el nombre:", "SQLite", 3);
            String apellidos = JOptionPane.showInputDialog(null, "Introduzca los apellidos:", "SQLite", 3);
            if(!nombre.isBlank() && !apellidos.isBlank()){
                Metodos metodos = new Metodos();
                metodos.insertar(nombre, apellidos);
                JOptionPane.showMessageDialog(null, "Inserción exitosa :)", "SQLite", 1);
            }else{
                JOptionPane.showMessageDialog(null, "El campo no puede estar vacío.", "SQLite", 2);
            }
        }catch(SQLException e1){
            JOptionPane.showMessageDialog(null, "¡Ups! Ha ocurrido un error.", "SQLite", 0);
            System.out.println(e1.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            Metodos metodos = new Metodos();
            String id = JOptionPane.showInputDialog(null, "Introduzca el ID:", "SQLite", 3);
            if(!id.isBlank()){
                String query = metodos.consultar(id);
                if(!query.isBlank()){
                    JOptionPane.showMessageDialog(null, query, "SQLite", 1);
                }else{
                    JOptionPane.showMessageDialog(null, "No existen coincidencias.", "SQLite", 1);
                }
            }else{
                JOptionPane.showMessageDialog(null, "El campo no puede estar vacío.", "SQLite", 2);
            }
        }catch(SQLException e1){
            JOptionPane.showMessageDialog(null, "¡Ups! Ha ocurrido un error.", "SQLite", 0);
            System.out.println(e1.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            Metodos metodos = new Metodos();
            String id = JOptionPane.showInputDialog(null, "Introduzca el ID:", "SQLite", 3);
            if(!id.isBlank()){
                metodos.eliminar(id);
            }else{
                JOptionPane.showMessageDialog(null, "El campo no puede estar vacío.", "SQLite", 2);
            }
        }catch(SQLException e1){
            JOptionPane.showMessageDialog(null, "¡Ups! Ha ocurrido un error.", "SQLite", 0);
            System.out.println(e1.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            Metodos metodos = new Metodos();
            String id = JOptionPane.showInputDialog(null, "Introduzca el ID:", "SQLite", 3);
            if(!id.isBlank()){
                String query = metodos.consultar(id);
                if(!query.isBlank()){
                    String nombre = JOptionPane.showInputDialog(null, "Introduzca el nuevo nombre para:\n" + query, "SQLite", 3);
                    String apellidos = JOptionPane.showInputDialog(null, "Introduzca los nuevos apellidos para:\n" + query, "SQLite", 3);
                    metodos.modificar(id, nombre, apellidos);
                }else{
                    JOptionPane.showMessageDialog(null, "No existen coincidencias.", "SQLite", 1);
                }
            }else{
                JOptionPane.showMessageDialog(null, "El campo no puede estar vacío.", "SQLite", 2);
            }
        }catch(SQLException e1){
            JOptionPane.showMessageDialog(null, "¡Ups! Ha ocurrido un error.", "SQLite", 0);
            System.out.println(e1.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
