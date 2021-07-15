package App.Kelas_7;

import konfigurasi.CONFIG;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Edit_Absen7 extends javax.swing.JFrame {

    private String tgl;
 public void bersih(){
        NIS_f.setEditable(true);
        NIS_f.setText(null);
        Nama_f.setText(null);
        tnggl.setDate(null);
    }
     private void print_data(){
         int row=Table_siswa.getRowCount();
         for (int i = 0; i < row; i++) {
             model.removeRow(i);
         }
        
         try{
            int no = 1;
            String sql = "SELECT TANGGAL,NIS,NAMA,KETERANGAN FROM presensi7 order by NAMA ASC";
            java.sql.Connection conn = (Connection)CONFIG.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()) {
               model.addRow(new Object[] {no++ , res.getString(1) , res.getString(2),
               res.getString(3), res.getString(4)});
            } 
             
            Table_siswa.setModel(model);
            
        } catch(SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
     DefaultTableModel model;
    public Edit_Absen7() {
        initComponents();
        String[] judul={"No","Tanggal","NIS","Nama","Keterangan"};
        model=new DefaultTableModel(judul,0);
        Table_siswa.setModel(model);
        print_data();
        
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Edit = new javax.swing.JButton();
        Tahun1 = new javax.swing.JLabel();
        Tahun2 = new javax.swing.JLabel();
        Tahun4 = new javax.swing.JLabel();
        NIS_f = new javax.swing.JTextField();
        Nama_f = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_siswa = new javax.swing.JTable();
        Tahun5 = new javax.swing.JLabel();
        Kembali = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Presen = new javax.swing.JComboBox<>();
        tnggl = new com.toedter.calendar.JDateChooser();
        Refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Tahun1.setText("NAMA: ");

        Tahun2.setText("NIS: ");

        Tahun4.setText("Keterangan:");

        NIS_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NIS_fActionPerformed(evt);
            }
        });

        Nama_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nama_fActionPerformed(evt);
            }
        });

        jLabel2.setText("Tanggal: ");

        Table_siswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table_siswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_siswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_siswa);

        Tahun5.setText("DATA PRESENSI SISWA KELAS 7");

        Kembali.setText("Kembali");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        Presen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hadir", "Sakit", "Izin", "Alpha" }));

        tnggl.setDateFormatString("yyyy-MM-dd");
        tnggl.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tngglPropertyChange(evt);
            }
        });

        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(Tahun5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Tahun4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Tahun1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Tahun2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(Nama_f, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(NIS_f, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Presen, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(tnggl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Kembali)
                                        .addGap(18, 18, 18)
                                        .addComponent(Refresh)))
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tnggl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tahun2)
                            .addComponent(NIS_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tahun1)
                            .addComponent(Nama_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Hapus)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tahun4)
                    .addComponent(Presen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kembali)
                    .addComponent(Refresh))
                .addGap(14, 14, 14)
                .addComponent(Tahun5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        try{
            String sql = "update presensi7 set Tanggal='"+tgl+"',NIS='"+NIS_f.getText()+"',NAMA='"+Nama_f.getText()+"',"
                    + " Keterangan='"+Presen.getSelectedItem()+"' where NIS='"+NIS_f.getText()+"'";
            java.sql.Connection conn = (Connection)CONFIG.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DI UPDATE");
            print_data();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_EditActionPerformed

    private void NIS_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIS_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NIS_fActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
       Dashboard7 D=new Dashboard7();
       D.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_KembaliActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
      try{
            String sql = "DELETE FROM presensi7 where NIS='"+NIS_f.getText()+"' and Tanggal='"+tgl+"'";
            java.sql.Connection conn = (Connection)CONFIG.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DI HAPUS");
            print_data();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_HapusActionPerformed

    private void Nama_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nama_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nama_fActionPerformed

    private void Table_siswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_siswaMouseClicked
        try{
            DefaultTableModel m=(DefaultTableModel)Table_siswa.getModel();
            int a=Table_siswa.getSelectedRow();
            java.util.Date dat= new SimpleDateFormat("yyyy-MM-dd").parse((String)m.getValueAt(a, 1));
            if(a>-1){
            tnggl.setDate(dat);
            NIS_f.setText(m.getValueAt(a, 2).toString());
            Nama_f.setText(m.getValueAt(a, 3).toString());  
        }
        }catch(ParseException ex){
            Logger.getLogger(Edit_Absen7.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_Table_siswaMouseClicked

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
       print_data();
       bersih();
    }//GEN-LAST:event_RefreshActionPerformed

    private void tngglPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tngglPropertyChange
        if(tnggl.getDate()!=null){
           SimpleDateFormat ft=new SimpleDateFormat("yyyy-MM-dd");
           tgl=ft.format(tnggl.getDate());
       }
    }//GEN-LAST:event_tngglPropertyChange
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
            java.util.logging.Logger.getLogger(Edit_Absen7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Absen7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Absen7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Absen7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Absen7().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edit;
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Kembali;
    private javax.swing.JTextField NIS_f;
    private javax.swing.JTextField Nama_f;
    private javax.swing.JComboBox<String> Presen;
    private javax.swing.JButton Refresh;
    private javax.swing.JTable Table_siswa;
    private javax.swing.JLabel Tahun1;
    private javax.swing.JLabel Tahun2;
    private javax.swing.JLabel Tahun4;
    private javax.swing.JLabel Tahun5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser tnggl;
    // End of variables declaration//GEN-END:variables
}
