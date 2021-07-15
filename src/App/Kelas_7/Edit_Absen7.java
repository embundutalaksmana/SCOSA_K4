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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Kembali = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Tahun1 = new javax.swing.JLabel();
        Presen = new javax.swing.JComboBox<>();
        Tahun2 = new javax.swing.JLabel();
        tnggl = new com.toedter.calendar.JDateChooser();
        Tahun4 = new javax.swing.JLabel();
        NIS_f = new javax.swing.JTextField();
        Nama_f = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_siswa = new javax.swing.JTable();
        Tahun5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("EDIT PRESENSI");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(140, 10, 230, 29);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 500, 50);

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setLayout(null);

        Kembali.setText("Kembali");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });
        jPanel3.add(Kembali);
        Kembali.setBounds(20, 20, 77, 25);

        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel3.add(Refresh);
        Refresh.setBounds(400, 20, 77, 25);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 490, 500, 60);

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        jPanel1.add(Edit);
        Edit.setBounds(300, 100, 67, 25);

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        jPanel1.add(Hapus);
        Hapus.setBounds(300, 140, 67, 25);

        Tahun1.setText("NAMA: ");
        jPanel1.add(Tahun1);
        Tahun1.setBounds(60, 140, 43, 16);

        Presen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hadir", "Sakit", "Izin", "Alpha" }));
        jPanel1.add(Presen);
        Presen.setBounds(110, 170, 80, 22);

        Tahun2.setText("NIS: ");
        jPanel1.add(Tahun2);
        Tahun2.setBounds(70, 100, 29, 16);

        tnggl.setDateFormatString("yyyy-MM-dd");
        tnggl.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tngglPropertyChange(evt);
            }
        });
        jPanel1.add(tnggl);
        tnggl.setBounds(110, 70, 130, 22);

        Tahun4.setText("Keterangan:");
        jPanel1.add(Tahun4);
        Tahun4.setBounds(40, 170, 70, 16);

        NIS_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NIS_fActionPerformed(evt);
            }
        });
        jPanel1.add(NIS_f);
        NIS_f.setBounds(110, 100, 79, 22);

        Nama_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nama_fActionPerformed(evt);
            }
        });
        jPanel1.add(Nama_f);
        Nama_f.setBounds(110, 140, 79, 22);

        jLabel2.setText("Tanggal: ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 70, 55, 16);

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

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 350, 452, 123);

        Tahun5.setText("DATA PRESENSI SISWA KELAS 7");
        jPanel1.add(Tahun5);
        Tahun5.setBounds(140, 300, 188, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        try{
            String sql = "update presensi7 set Tanggal='"+tgl+"',NIS='"+NIS_f.getText()+"',NAMA='"+Nama_f.getText()+"',"
                    + " Keterangan='"+Presen.getSelectedItem()+"' where NIS='"+NIS_f.getText()+"' and Tanggal='"+tgl+"'and Tanggal='"+tgl+"'";
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser tnggl;
    // End of variables declaration//GEN-END:variables
}
