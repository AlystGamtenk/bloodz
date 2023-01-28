/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package bloodz;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Ardalepa Muhamad
 */
public class DialogFormPendonoran extends javax.swing.JDialog {

    /**
     * Creates new form a
     */
    private static String[] pendonoran;
    private static String method;
    private static String[] dataPendonoran;
    
    public DialogFormPendonoran(java.awt.Frame parent, boolean modal,String[] pendonoran,String method) {
        super(parent, modal);
        this.pendonoran = pendonoran;
        this.method = method;
        initComponents();
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        //check create or edit
        if(pendonoran.length<2){ 
            this.dataPendonoran = Model.arrResult("SELECT "
                    + "id_pendonoran, "
                    + "gol_darah, "
                    + "nama_pendonor,"
                    + "tgl_lahir,"
                    + "no_tlp, "
                    + "alamat, "
                    + "id_pendonor "
                    + "FROM pendonoran JOIN pendonor USING(id_pendonor) WHERE id_pendonoran = '"+pendonoran[0]+"'");
            lblIdPendonoran.setText(dataPendonoran[0]);
            cbGolDarah.setSelectedItem(dataPendonoran[1]);
            tfNama.setText(dataPendonoran[2]);
            tfTglLahir.setText(dataPendonoran[3]);
            tfNoTlp.setText(dataPendonoran[4]);
            tfAlamat.setText(dataPendonoran[5]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblIdPendonoran = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbGolDarah = new javax.swing.JComboBox<>();
        tfTglLahir = new javax.swing.JTextField();
        tfNama = new javax.swing.JTextField();
        tfNoTlp = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        tfAlamat = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        btnSimpanPendonoran = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblIdPendonoran.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblIdPendonoran.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tambah Pendonoran");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Golongan Darah");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Nama Pendonor");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Tanggal Lahir(YYYY-MM-DD)");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("no Telp");

        cbGolDarah.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        cbGolDarah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "AB", "O" }));

        tfTglLahir.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        tfNama.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        tfNoTlp.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Alamat");

        tfAlamat.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        btnSimpanPendonoran.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnSimpanPendonoran.setText("Simpan");
        btnSimpanPendonoran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanPendonoranActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSimpanPendonoran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfTglLahir)
                    .addComponent(cbGolDarah, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(lblIdPendonoran, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfNama, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNoTlp)
                    .addComponent(jSeparator5)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfAlamat)
                    .addComponent(jSeparator6))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIdPendonoran, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbGolDarah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNoTlp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSimpanPendonoran, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanPendonoranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanPendonoranActionPerformed
        String idEditPendonor = Model.stringResult("select id_pendonor from pendonor where nama_pendonor = '"+tfNama.getText()
                +"' and gol_darah = '"+cbGolDarah.getSelectedItem()
                +"' and tgl_lahir = '"+tfTglLahir.getText()+"'");
        
        if(this.method=="post"){
            JOptionPane.showMessageDialog(this, "ini post");
            String idPendonorPendonoran;
            if (idEditPendonor.isEmpty()) {
                
                JOptionPane.showMessageDialog(this, "ini post - user lama");
                String idCreatePendonor = Model.stringResult("SELECT id_pendonor FROM pendonor ORDER BY id_pendonor DESC LIMIT 1");
                String sIdCreatePendonor = "";
                for (int i = 2; i < 7; i++) {
                    sIdCreatePendonor += idCreatePendonor.charAt(i);
                }
                int iIdCreatePendonor = Integer.parseInt(sIdCreatePendonor)+1;

                if(iIdCreatePendonor<10){
                    idCreatePendonor= "PE0000"+iIdCreatePendonor;
                }else if(iIdCreatePendonor<100){
                    idCreatePendonor= "PE000"+iIdCreatePendonor;
                }else if(iIdCreatePendonor<1000){
                    idCreatePendonor= "PE00"+iIdCreatePendonor;
                }else if(iIdCreatePendonor<10000){
                    idCreatePendonor= "PE0"+iIdCreatePendonor;
                }else{
                    idCreatePendonor= "PE"+iIdCreatePendonor;
                }
                try{
                    Model.updOrIns("INSERT INTO PENDONOR VALUES ('"
                        + idCreatePendonor+"','"
                        + tfNama.getText()+"','"
                        + cbGolDarah.getSelectedItem()+"','"
                        + tfTglLahir.getText()+"','"
                        + tfAlamat.getText()+"','"
                        + tfNoTlp.getText()+"')"
                        );
                }catch(Exception e){
                    JOptionPane.showMessageDialog(this, "ini post - user baru");

                }
                
                idPendonorPendonoran = idCreatePendonor;
            }else{

                if(!Model.updOrIns("UPDATE pendonor SET "
                        +"alamat = '"+ tfAlamat.getText()+"',"
                        +"no_tlp = '"+ tfNoTlp.getText()
                        +"' WHERE id_pendonor = '"+idEditPendonor+"'"
                        )){
                    
                }
                idPendonorPendonoran = idEditPendonor;
            }
            Model.updOrIns("INSERT INTO pendonoran VALUES ('"
                    + pendonoran[0]+"','"
                    + idPendonorPendonoran+"','"
                    + LocalDate.now()+"')"
                    );
            Model.updOrIns("INSERT INTO darah VALUES ('"
                    + pendonoran[1]+"','"
                    + pendonoran[0]+"','"
                    + "Tersedia')"
                    );
            dispose();
            JOptionPane.showMessageDialog(this, "Berhasil Menambahkan Data", "Informasi",1);
        }else{
            if (!idEditPendonor.isEmpty()) {
                JOptionPane.showMessageDialog(this, "ini put - user lama");
                Model.updOrIns("UPDATE pendonor SET "
                        +"alamat = '"+ tfAlamat.getText()+"',"
                        +"no_tlp = '"+ tfNoTlp.getText()
                        +"' WHERE id_pendonor = '"+idEditPendonor+"'"
                        );
                Model.updOrIns("UPDATE pendonoran SET "
                        + "id_pendonor = '"+idEditPendonor+"' "
                        + "WHERE id_pendonoran = '"+dataPendonoran[0]+"'");
            }else{
                JOptionPane.showMessageDialog(this, "ini put - user baru");
                Model.updOrIns("UPDATE pendonor SET "
                        +"nama_pendonor = '"+ tfNama.getText()+"',"
                        +"gol_darah = '"+ cbGolDarah.getSelectedItem()+"',"
                        +"tgl_lahir = '"+ tfTglLahir.getText()+"',"
                        +"alamat = '"+ tfAlamat.getText()+"',"
                        +"no_tlp = '"+ tfNoTlp.getText()
                        +"' WHERE id_pendonor = '"+dataPendonoran[6]+"'");
              
            }
            dispose();
            JOptionPane.showMessageDialog(this, "Berhasil Mengubah Data", "Informasi",1);
        }
    }//GEN-LAST:event_btnSimpanPendonoranActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DialogFormPendonoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogFormPendonoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogFormPendonoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogFormPendonoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogFormPendonoran dialog = new DialogFormPendonoran(new javax.swing.JFrame(), true,pendonoran,method);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpanPendonoran;
    private javax.swing.JComboBox<String> cbGolDarah;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblIdPendonoran;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNoTlp;
    private javax.swing.JTextField tfTglLahir;
    // End of variables declaration//GEN-END:variables
}
