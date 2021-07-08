package App.Kelas9;


import App.*;
import konfigurasi.CONFIG;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Embun Duta Laksmana
 */
public class Riwayat_Absen extends javax.swing.JFrame {

    private String tgl;

    public void bersih(){
        NIS_f.setEditable(true);
        NIS_f.setText(null);
        Nama_f.setText(null);
        Kelas_f.setText(null);
    }
    private void print_data(){
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("No.");
        model.addColumn("Tanggal");
        model.addColumn("NIS");
        model.addColumn("Nama");
        model.addColumn("Kelas");
        model.addColumn("Keterangan");
         try{
            int no = 1;
            String sql = "SELECT TANGGAL,NIS,NAMA,KELAS,KETERANGAN FROM presensi";
            java.sql.Connection conn = (Connection)CONFIG.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()) {
               model.addRow(new Object[] {no++ , res.getString(1) , res.getString(2),
               res.getString(3), res.getString(4), res.getString(5)});
            } 
              
            Table_siswa.setModel(model);
            
        } catch(SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
    public Riwayat_Absen() {
        initComponents();
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

        tnggl = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        NIS_f = new javax.swing.JTextField();
        Nama_f = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Tahun1 = new javax.swing.JLabel();
        Tahun2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_siswa = new javax.swing.JTable();
        Cari_tanggal = new javax.swing.JButton();
        Tahun3 = new javax.swing.JLabel();
        Kelas_f = new javax.swing.JTextField();
        Cari_NIS = new javax.swing.JButton();
        Cari_Nama = new javax.swing.JButton();
        Cari_Kelas = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        Kembali = new javax.swing.JButton();
        tnggl1 = new com.toedter.calendar.JDateChooser();

        tnggl.setDateFormatString("yyyy-MM-dd");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("RIWAYAT ABSENSI");

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

        Tahun1.setText("NAMA: ");

        Tahun2.setText("NIS: ");

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
        jScrollPane1.setViewportView(Table_siswa);

        Cari_tanggal.setText("Cari");
        Cari_tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cari_tanggalActionPerformed(evt);
            }
        });

        Tahun3.setText("Kelas: ");

        Kelas_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kelas_fActionPerformed(evt);
            }
        });

        Cari_NIS.setText("Cari");
        Cari_NIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cari_NISActionPerformed(evt);
            }
        });

        Cari_Nama.setText("Cari");
        Cari_Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cari_NamaActionPerformed(evt);
            }
        });

        Cari_Kelas.setText("Cari");
        Cari_Kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cari_KelasActionPerformed(evt);
            }
        });

        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        Kembali.setText("Kembali");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        tnggl1.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Tahun1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Nama_f, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Tahun2)
                                        .addGap(21, 21, 21)
                                        .addComponent(NIS_f, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Tahun3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Kelas_f, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(tnggl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cari_Nama)
                            .addComponent(Cari_Kelas)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cari_tanggal)
                                    .addComponent(Cari_NIS))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Kembali)
                                .addGap(15, 15, 15))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Refresh)
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(Cari_tanggal))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tnggl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Tahun2)
                                    .addComponent(NIS_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cari_NIS)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(Kembali)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tahun1)
                            .addComponent(Nama_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cari_Nama))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tahun3)
                    .addComponent(Kelas_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cari_Kelas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(Refresh)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Nama_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nama_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nama_fActionPerformed

    private void NIS_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIS_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NIS_fActionPerformed

    private void Cari_tanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cari_tanggalActionPerformed
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Tanggal");
        model.addColumn("NIS");
        model.addColumn("Nama");
        model.addColumn("Kelas");
        model.addColumn("Keterangan");
         try{
            int no = 1;
            String sql = "SELECT TANGGAL,NIS,NAMA,KELAS,KETERANGAN FROM presensi WHERE tanggal ='"+tgl+"'";
            java.sql.Connection conn = (Connection)CONFIG.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()) {
               model.addRow(new Object[] {no++ , res.getString(1) , res.getString(2),
               res.getString(3), res.getString(4), res.getString(5)});
            } 
              
            Table_siswa.setModel(model);
            
        } catch(SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_Cari_tanggalActionPerformed

    private void Kelas_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kelas_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Kelas_fActionPerformed

    private void Cari_NISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cari_NISActionPerformed
       DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Tanggal");
        model.addColumn("NIS");
        model.addColumn("Nama");
        model.addColumn("Kelas");
        model.addColumn("Keterangan");
         try{
            int no = 1;
            String sql = "SELECT TANGGAL,NIS,NAMA,KELAS,KETERANGAN FROM presensi WHERE NIS ='"+NIS_f.getText()+"'";
            java.sql.Connection conn = (Connection)CONFIG.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while(res.next()) {
               model.addRow(new Object[] {no++ , res.getString(1) , res.getString(2),
               res.getString(3), res.getString(4), res.getString(5)});
            } 
              
            Table_siswa.setModel(model);
            
        } catch(SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_Cari_NISActionPerformed

    private void Cari_NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cari_NamaActionPerformed
       DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Tanggal");
        model.addColumn("NIS");
        model.addColumn("Nama");
        model.addColumn("Kelas");
        model.addColumn("Keterangan");
         try{
            int no = 1;
            String sql = "SELECT TANGGAL,NIS,NAMA,KELAS,KETERANGAN FROM presensi WHERE Nama ='"+Nama_f.getText()+"'";
            java.sql.Connection conn = (Connection)CONFIG.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()) {
               model.addRow(new Object[] {no++ , res.getString(1) , res.getString(2),
               res.getString(3), res.getString(4), res.getString(5)});
            } 
              
            Table_siswa.setModel(model);
            
        } catch(SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_Cari_NamaActionPerformed

    private void Cari_KelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cari_KelasActionPerformed
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Tanggal");
        model.addColumn("NIS");
        model.addColumn("Nama");
        model.addColumn("Kelas");
        model.addColumn("Keterangan");
         try{
            int no = 1;
            String sql = "SELECT TANGGAL,NIS,NAMA,KELAS,KETERANGAN FROM presensi WHERE Kelas ='"+Kelas_f.getText()+"'";
            java.sql.Connection conn = (Connection)CONFIG.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()) {
               model.addRow(new Object[] {no++ , res.getString(1) , res.getString(2),
               res.getString(3), res.getString(4), res.getString(5)});
            } 
              
            Table_siswa.setModel(model);
            
        } catch(SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_Cari_KelasActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
      print_data();      
    }//GEN-LAST:event_RefreshActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
       Dashboard D=new Dashboard();
       D.setVisible(true);
       dispose();
    }//GEN-LAST:event_KembaliActionPerformed

    private void tngglPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tngglPropertyChange
         if(tnggl.getDate()!=null){
           SimpleDateFormat ft=new SimpleDateFormat("yyyy-MM-dd");
           tgl=ft.format(tnggl.getDate());
       }
    }//GEN-LAST:event_tngglPropertyChange

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cari_Kelas;
    private javax.swing.JButton Cari_NIS;
    private javax.swing.JButton Cari_Nama;
    private javax.swing.JButton Cari_tanggal;
    private javax.swing.JTextField Kelas_f;
    private javax.swing.JButton Kembali;
    private javax.swing.JTextField NIS_f;
    private javax.swing.JTextField Nama_f;
    private javax.swing.JButton Refresh;
    private javax.swing.JTable Table_siswa;
    private javax.swing.JLabel Tahun1;
    private javax.swing.JLabel Tahun2;
    private javax.swing.JLabel Tahun3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser tnggl;
    private com.toedter.calendar.JDateChooser tnggl1;
    // End of variables declaration//GEN-END:variables

}
