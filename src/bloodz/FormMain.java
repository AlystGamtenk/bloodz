/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloodz;

import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


/**
 *
 * @author Diva Calista
 */
public class FormMain extends javax.swing.JFrame {
    //default table model
    DefaultTableModel modelDarah;
    DefaultTableModel modelPendonoran;
    
    //database
    Connection koneksi;
    Statement perintah;
    ResultSet rs;
    
    
    //table cell renderer
    TableColumn tcrDarah, tcrPendonoranDetail,tcrPendonoranEdit,tcrPendonoranHapus;
   
    //id create
    String idCreatePendonoran;
    String idCreateDarah;
    String idCreatePendonor;
    
    public FormMain() {
        initComponents();
        //make window maximize
        this.setExtendedState(this.MAXIMIZED_BOTH);
        
        //model
        modelDarah = (DefaultTableModel)tblDarah.getModel();
        modelPendonoran = (DefaultTableModel)tblPendonoran.getModel();
        
        //make cell having foreground color
        tcrDarah=tblDarah.getColumnModel().getColumn(5);
        tcrDarah.setCellRenderer(new ColumnColorRenderer(Color.BLUE));
        
        tcrPendonoranDetail=tblPendonoran.getColumnModel().getColumn(4);
        tcrPendonoranDetail.setCellRenderer(new ColumnColorRenderer(Color.BLUE));
        tcrPendonoranEdit=tblPendonoran.getColumnModel().getColumn(5);
        tcrPendonoranEdit.setCellRenderer(new ColumnColorRenderer(Color.ORANGE));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        navBrand = new javax.swing.JLabel();
        navItem1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        navItem2 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDarah = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPendonoran = new javax.swing.JTable();
        btnTambahPendonoran = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 50));

        navBrand.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        navBrand.setForeground(new java.awt.Color(255, 255, 255));
        navBrand.setText("Logo");
        navBrand.setPreferredSize(new java.awt.Dimension(43, 30));

        navItem1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        navItem1.setForeground(java.awt.Color.lightGray);
        navItem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        navItem1.setText("Home");
        navItem1.setPreferredSize(new java.awt.Dimension(43, 30));
        navItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navItem1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navItem1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navItem1MouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Logout");
        jLabel8.setPreferredSize(new java.awt.Dimension(43, 30));

        navItem2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        navItem2.setForeground(java.awt.Color.lightGray);
        navItem2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        navItem2.setText("Pendonoran");
        navItem2.setPreferredSize(new java.awt.Dimension(43, 30));
        navItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navItem2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                navItem2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                navItem2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(navBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navItem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(navItem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(navBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(navItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jScrollPane1.setOpaque(false);

        tblDarah.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tblDarah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Kantong", "Gol Darah", "Pendonor", "Tgl Donor", "Status", "Detil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDarah.setColumnSelectionAllowed(true);
        tblDarah.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblDarah.setName(""); // NOI18N
        tblDarah.setRowHeight(30);
        tblDarah.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblDarah.getTableHeader().setReorderingAllowed(false);
        tblDarah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDarahMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDarah);
        tblDarah.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblDarah.getColumnModel().getColumnCount() > 0) {
            tblDarah.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("Tabel Darah");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jTabbedPane2.addTab("", jPanel2);

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setText("Tabel Pendonoran");

        jScrollPane2.setOpaque(false);

        tblPendonoran.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        tblPendonoran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pendonoran", "Gol Darah", "Nama Pendonor", "Tgl Donor", "Detil", "Ubah", "Hapus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPendonoran.setColumnSelectionAllowed(true);
        tblPendonoran.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblPendonoran.setName(""); // NOI18N
        tblPendonoran.setRowHeight(30);
        tblPendonoran.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblPendonoran.getTableHeader().setReorderingAllowed(false);
        tblPendonoran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPendonoranMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPendonoran);
        tblPendonoran.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblPendonoran.getColumnModel().getColumnCount() > 0) {
            tblPendonoran.getColumnModel().getColumn(4).setResizable(false);
            tblPendonoran.getColumnModel().getColumn(5).setResizable(false);
            tblPendonoran.getColumnModel().getColumn(6).setResizable(false);
        }

        btnTambahPendonoran.setBackground(new java.awt.Color(153, 0, 0));
        btnTambahPendonoran.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnTambahPendonoran.setForeground(new java.awt.Color(255, 255, 255));
        btnTambahPendonoran.setText("Tambah Data");
        btnTambahPendonoran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahPendonoranActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTambahPendonoran))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(btnTambahPendonoran))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jTabbedPane2.addTab("", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jTabbedPane2)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jTabbedPane2)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setSelectedMenu(navItem1, 0);
        refreshTable();
    }//GEN-LAST:event_formWindowOpened

    private void navItem1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navItem1MouseEntered
        navItem1.setForeground(java.awt.Color.WHITE);
    }//GEN-LAST:event_navItem1MouseEntered

    private void navItem1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navItem1MouseExited
        setDeselectedNav(navItem1, 0);
    }//GEN-LAST:event_navItem1MouseExited

    private void navItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navItem1MouseClicked
        setSelectedMenu(navItem1, 0);
    }//GEN-LAST:event_navItem1MouseClicked

    private void navItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navItem2MouseClicked
        setSelectedMenu(navItem2, 1);

    }//GEN-LAST:event_navItem2MouseClicked

    private void navItem2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navItem2MouseEntered
        navItem2.setForeground(java.awt.Color.WHITE);
    }//GEN-LAST:event_navItem2MouseEntered

    private void navItem2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navItem2MouseExited
        setDeselectedNav(navItem2, 1);
    }//GEN-LAST:event_navItem2MouseExited

    private void btnTambahPendonoranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahPendonoranActionPerformed
        String[] pendonoran = {idCreatePendonoran,idCreateDarah};
        new DialogFormPendonoran(this, true, pendonoran,"post").show();
    }//GEN-LAST:event_btnTambahPendonoranActionPerformed

    private void tblDarahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDarahMouseClicked
        if(tblDarah.getSelectedColumn()==5){
            String[] darah = {
                (String) tblDarah.getValueAt(tblDarah.getSelectedRow(),0),
                (String) tblDarah.getValueAt(tblDarah.getSelectedRow(),1),
                (String) tblDarah.getValueAt(tblDarah.getSelectedRow(),2),
                (String) tblDarah.getValueAt(tblDarah.getSelectedRow(),3),
                (String) tblDarah.getValueAt(tblDarah.getSelectedRow(),4),
            };
            new DialogDetilDarah(this, true, darah).show();
        }
    }//GEN-LAST:event_tblDarahMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        refreshTable();
    }//GEN-LAST:event_formWindowActivated

    private void tblPendonoranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPendonoranMouseClicked
        if(tblPendonoran.getSelectedColumn()==4){
            new DialogDetilPendonoran(this, true, (String) tblPendonoran.getValueAt(tblPendonoran.getSelectedRow(), 0)).show();
        }
        if(tblPendonoran.getSelectedColumn()==5){
            String[] pendonoran = {(String)tblPendonoran.getValueAt(tblPendonoran.getSelectedRow(), 0)};
            new DialogFormPendonoran(this, true,pendonoran ,"put").show();
        }
        if(tblPendonoran.getSelectedColumn()==6){
            int respon = JOptionPane.showConfirmDialog(this, "Ingin menghapus data pendonoran " + tblPendonoran.getValueAt(tblPendonoran.getSelectedRow(), 0) + 
                        "?", "Konfirmasi",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE); 
            if (respon == JOptionPane.YES_OPTION) {
                Model.delete("darah","id_pendonoran",(String)tblPendonoran.getValueAt(tblPendonoran.getSelectedRow(), 0));
                Model.delete("pendonoran","id_pendonoran",(String)tblPendonoran.getValueAt(tblPendonoran.getSelectedRow(), 0));
            }
        }
    }//GEN-LAST:event_tblPendonoranMouseClicked

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
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTambahPendonoran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel navBrand;
    private javax.swing.JLabel navItem1;
    private javax.swing.JLabel navItem2;
    private javax.swing.JTable tblDarah;
    private javax.swing.JTable tblPendonoran;
    // End of variables declaration//GEN-END:variables
    void setSelectedMenu(JLabel navItem, int i){
        navItem1.setForeground(Color.lightGray);
        navItem2.setForeground(Color.lightGray);
        navItem.setForeground(Color.white);
        jTabbedPane2.setSelectedIndex(i);    
    }
    void setDeselectedNav(JLabel navItem, int i){
        if (jTabbedPane2.getSelectedIndex()!=i) {
            navItem.setForeground(java.awt.Color.LIGHT_GRAY);
        }else{
            navItem.setForeground(java.awt.Color.WHITE);
        }
    }
    void refreshTable(){
        modelDarah.setRowCount(0);
        modelDarah.fireTableDataChanged();
        
        modelPendonoran.setRowCount(0);
        modelPendonoran.fireTableDataChanged(); 
        
        String[][] dataDarah = Model.arr2Result("Select id_kantong,gol_darah,nama_pendonor,tgl_donor,status from darah join pendonoran using(id_pendonoran) join pendonor using(id_pendonor)");
        for(String[] darah:dataDarah){
            modelDarah.addRow(new Object []{
                darah[0],
                darah[1],
                darah[2],
                darah[3],
                darah[4],
                "Detil"
            });
        }
        
        String[][] dataPendonoran = Model.arr2Result("Select id_pendonoran,gol_darah,nama_pendonor,tgl_donor from pendonoran join pendonor using(id_pendonor)");
        for(String[] pendonoran:dataPendonoran){
            modelPendonoran.addRow(new Object []{
                pendonoran[0],
                pendonoran[1],
                pendonoran[2],
                pendonoran[3],
                "Detil",
                "Ubah",
                "Hapus",
            });
            idCreatePendonoran = pendonoran[0];
        }
        
        generateCreateId();
    }
    void generateCreateId(){
        
        String sIdCreatePendonoran = "";
        for (int i = 2; i < 7; i++) {
            sIdCreatePendonoran += idCreatePendonoran.charAt(i);
        }
        int iIdCreatePendonoran = Integer.parseInt(sIdCreatePendonoran)+1;

        if(iIdCreatePendonoran<10){
            idCreatePendonoran= "DO0000"+iIdCreatePendonoran;
        }else if(iIdCreatePendonoran<100){
            idCreatePendonoran= "DO000"+iIdCreatePendonoran;
        }else if(iIdCreatePendonoran<1000){
            idCreatePendonoran= "DO00"+iIdCreatePendonoran;
        }else if(iIdCreatePendonoran<10000){
            idCreatePendonoran= "DO0"+iIdCreatePendonoran;
        }else{
            idCreatePendonoran= "DO"+iIdCreatePendonoran;
        }
        idCreateDarah = idCreatePendonoran.replace('D', 'K').replace('O', 'A');
    }

}

class ColumnColorRenderer extends DefaultTableCellRenderer {
   Color foregroundColor;
   public ColumnColorRenderer(Color foregroundColor) {
      super();
      this.foregroundColor = foregroundColor;
   }
   
   public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,   boolean hasFocus, int row, int column) {
      Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
      cell.setForeground(foregroundColor);
      return cell;
   }
}
