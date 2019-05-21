package dbsqlite;

import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame{
    
    SQLite bd;
    
    public Interfaz(){
        bd = new SQLite("sqlite", "alumnos");
        if(bd.conectar()){
            System.out.println("[ info ] Conexión satisfactoria.");
            initComponents();
        }else{
            JOptionPane.showMessageDialog(null, "Error de conexión.", "SQLite", 0);
            System.out.println("[ error ] No se ha podido establecer una conexión con la base de datos.");
            System.exit(0);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SQLite");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jButton1.setBackground(new java.awt.Color(229, 229, 229));
        jButton1.setText("Insertar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(229, 229, 229));
        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(229, 229, 229));
        jButton3.setText("Consultar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(229, 229, 229));
        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(229, 229, 229));
        jButton5.setText("Crear tabla");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(229, 229, 229));
        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 90, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(bd.crear(JOptionPane.showInputDialog(null, "Introduzca el nombre de la tabla:\n", "SQLite", 3))){
            JOptionPane.showMessageDialog(null, "Tabla creada satisfactoriamente.", "SQLite", 1);
        }else{
            JOptionPane.showMessageDialog(null, "¡Ups! ha ocurrido un error.", "SQLite", 0);
        }
    }//GEN-LAST:event_jButton5ActionPerformed
//GEN-FIRST:event_jButton4ActionPerformed
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            int f = bd.eliminar(Integer.parseInt(JOptionPane.showInputDialog(null, "Búsqueda por ID:", "SQLite", 3)));
            if(f > 0){
                JOptionPane.showMessageDialog(null, "Entrada eliminada satisfactoriamente.", "SQLite", 1);
                System.out.println("[ info ] " + f + " fila(s) afectada(s).");
            }else{
                JOptionPane.showMessageDialog(null, "No existen coincidencias.", "SQLite", 2);
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El formato introducido no es válido.", "SQLite", 0);
            System.out.println("[ error ] " + e.getMessage());
        }
    }
//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            String query = bd.consultar(Integer.parseInt(JOptionPane.showInputDialog(null, "Búsqueda por ID:", "SQLite", 3)));
            if(query != null){
                JOptionPane.showMessageDialog(null, query, "SQLite", 1);
            }else{
                JOptionPane.showMessageDialog(null, "No existen coincidencias.", "SQLite", 2);
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El formato introducido no es válido.", "SQLite", 0);
            System.out.println("[ error ] " + e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Búsqueda por ID:", "SQLite", 3));
            String query = bd.consultar(id);
            if(query != null){
                String nombre = JOptionPane.showInputDialog(null, "Introduzca nuevo nombre para:\n" + query, "SQLite", 3);
                String apellidos = JOptionPane.showInputDialog(null, "Introduzca nuevo(s) apellido(s) para:\n" + query, "SQLite", 3);
                if(!nombre.isEmpty() && !apellidos.isEmpty()){
                    if(bd.modificar(id, nombre, apellidos) > 0){
                        JOptionPane.showMessageDialog(null, "Entrada actualizada satisfactoriamente.", "SQLite", 1);
                    }else{
                        JOptionPane.showMessageDialog(null, "¡Ups! ha ocurrido un error.", "SQLite", 0);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "El campo no puede estar vacío.", "SQLite", 2);
                }
            }else{
                JOptionPane.showMessageDialog(null, "No existen coincidencias.", "SQLite", 2);
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El formato introducido no es válido.", "SQLite", 0);
            System.out.println("[ error ] " + e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre = JOptionPane.showInputDialog(null, "Introduzca el nombre:", "SQLite", 3);
        String apellidos = JOptionPane.showInputDialog(null, "Introduzca los apellidos:", "SQLite", 3);
        if(!nombre.isEmpty() && !apellidos.isEmpty()){
            int f = bd.insertar(nombre, apellidos);
            if(f > 0){
                JOptionPane.showMessageDialog(null, "Entrada insertada satisfactoriamente.", "SQLite", 1);
                System.out.println("[ info ] " + f + " fila(s) afectada(s).");
            }else{
                JOptionPane.showMessageDialog(null, "¡Ups! ha ocurrido un error.", "SQLite", 0);
            }
        }else{
            JOptionPane.showMessageDialog(null, "El campo no puede estar vacío.", "SQLite", 2);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(bd.desconectar()){
            System.out.println("[ info ] Desconexión satisfactoria.");
        }else{
            System.out.println("[ error ] Ha habido problemas en la desconexión.");
        }
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

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
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}