package AppServicePhoneRepair;

import javax.swing.JOptionPane;
import java.sql.*;

public class formServis extends javax.swing.JFrame {
    
    String judulKolom[]={"ID Servis","Nama","Telepon","Merk","Model","Imei","Keluhan","Kerusakan","Biaya"};
    String sqlServis="SELECT*FROM tServis";
    int lebar[]={70,100,100,80,140,120,180,180,100};
    
    /**
     * Creates new form formServis
     */
    public formServis() {
        initComponents();
        this.setLocationRelativeTo(null);
        new ConfigDB().tampilTabel(judulKolom, sqlServis, jTableServisMasuk1);
        new ConfigDB().aturLebarKolom(jTableServisMasuk, lebar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTableServisMasuk = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t_idServis = new javax.swing.JTextField();
        t_nama = new javax.swing.JTextField();
        t_telp = new javax.swing.JTextField();
        t_model = new javax.swing.JTextField();
        t_imei = new javax.swing.JTextField();
        cb_merk = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tp_keluhan = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tp_kerusakan = new javax.swing.JTextPane();
        t_biaya = new javax.swing.JTextField();
        bt_simpan = new javax.swing.JButton();
        bt_clear = new javax.swing.JButton();
        bt_keluar = new javax.swing.JButton();
        bt_ubah = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableServisMasuk1 = new javax.swing.JTable();
        bt_hapus = new javax.swing.JButton();
        t_cari = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bt_refresh = new javax.swing.JButton();

        jTableServisMasuk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Servis", "Nama", "Telp", "Merk", "Model", "IMEI", "Keluhan", "Kerusakan", "Biaya"
            }
        ));
        jTableServisMasuk.setShowVerticalLines(true);
        jScrollPane3.setViewportView(jTableServisMasuk);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tambah Data Servisan");
        setAutoRequestFocus(false);

        jPanel1.setBackground(java.awt.Color.lightGray);
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("ID Servis");

        jLabel2.setText("Nama");

        jLabel3.setText("Telp.");

        jLabel4.setText("Merk");

        jLabel5.setText("Model");

        jLabel6.setText("IMEI");

        jLabel7.setText("Keluhan");

        t_idServis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_idServisActionPerformed(evt);
            }
        });

        cb_merk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Merk", "Advan", "Blackberry", "Coolpad", "Evercoss", "Huawei", "iPhone", "Lenovo", "Meizu", "Nokia", "Oppo", "Samsung", "Sony", "Vivo", "Xiaomi", "Hp Cina Lainnya" }));

        jScrollPane1.setViewportView(tp_keluhan);

        jLabel8.setText("Kerusakan");

        jLabel9.setText("Biaya");

        jScrollPane2.setViewportView(tp_kerusakan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(111, 111, 111)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(t_idServis, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t_nama)
                        .addComponent(t_telp)
                        .addComponent(cb_merk, 0, 231, Short.MAX_VALUE)
                        .addComponent(t_model)
                        .addComponent(t_imei))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_biaya, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(t_idServis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t_telp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_merk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(t_model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_imei, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel8)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_biaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );

        bt_simpan.setText("SIMPAN");
        bt_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_simpanActionPerformed(evt);
            }
        });

        bt_clear.setText("CLEAR");
        bt_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_clearActionPerformed(evt);
            }
        });

        bt_keluar.setText("KEMBALI");
        bt_keluar.setToolTipText("");
        bt_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_keluarActionPerformed(evt);
            }
        });

        bt_ubah.setText("UBAH");
        bt_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ubahActionPerformed(evt);
            }
        });

        jTableServisMasuk1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Servis", "Nama", "Telp", "Merk", "Model", "IMEI", "Keluhan", "Kerusakan", "Biaya"
            }
        ));
        jTableServisMasuk1.setShowVerticalLines(true);
        jTableServisMasuk1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableServisMasuk1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableServisMasuk1);

        bt_hapus.setText("HAPUS");
        bt_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hapusActionPerformed(evt);
            }
        });

        t_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_cariKeyPressed(evt);
            }
        });

        jLabel10.setText("CARI ID");

        bt_refresh.setText("Refresh");
        bt_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                        .addComponent(bt_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_simpan)
                    .addComponent(bt_ubah)
                    .addComponent(bt_clear)
                    .addComponent(bt_keluar)
                    .addComponent(bt_hapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(bt_refresh))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_simpanActionPerformed
        // TODO add your handling code here:
        try {
            if (t_idServis.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Kode film belum diisi");
                t_idServis.requestFocus();
            } else
            if (t_nama.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Nama belum diisi");
                t_nama.requestFocus();
            } else
            if (String.valueOf(cb_merk.getSelectedItem())=="Pilih Merk"){
                JOptionPane.showMessageDialog(null,"Merk Hp belum diisi");
                cb_merk.requestFocus();
            } else
            if (t_model.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Model Hp belum diisi");
                t_model.requestFocus();
            } else
            if (tp_kerusakan.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Kerusakan Hp belum diisi");
                tp_kerusakan.requestFocus();
            }else
            if (t_biaya.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Perkiraan Biaya belum diisi");
                t_biaya.requestFocus();
            }else
            if (new ConfigDB().duplikasiData("tservis","id_servis",t_idServis.getText())==true){
                JOptionPane.showMessageDialog(null,"Kode Servis sudah terdaftar");
                Statement st = new ConfigDB().koneksi.createStatement();
                ResultSet rs = st.executeQuery("SELECT*FROM tservis WHERE id_servis='"+t_idServis.getText()+"'");
                if (rs.next()){
                    t_nama.setText(rs.getString("nama"));
                    t_telp.setText(rs.getString("telp"));
                    cb_merk.setSelectedItem(rs.getString("merk"));
                    t_model.setText(rs.getString("model"));
                    t_imei.setText(rs.getString("imei"));
                    tp_keluhan.setText(rs.getString("keluhan"));
                    tp_kerusakan.setText(rs.getString("kerusakan"));
                    t_biaya.setText(rs.getString("biaya"));
                }
            }else{
                String SQL="INSERT INTO tservis VALUES ('"+t_idServis.getText()+"','"+t_nama.getText()+"','"+
                t_telp.getText()+"','"+String.valueOf(cb_merk.getSelectedItem())+"','"+t_model.getText()+"','"+
                t_imei.getText()+"','"+tp_keluhan.getText()+"','"+tp_kerusakan.getText()+"','"+t_biaya.getText()+"')";
                new ConfigDB().simpanData(SQL);
            }
            } catch (Exception e) {
                }
        new ConfigDB().tampilTabel(judulKolom, sqlServis, jTableServisMasuk1);
        new ConfigDB().aturLebarKolom(jTableServisMasuk1, lebar);
    }//GEN-LAST:event_bt_simpanActionPerformed

    private void bt_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_keluarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose(); 
    }//GEN-LAST:event_bt_keluarActionPerformed

    private void t_idServisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_idServisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_idServisActionPerformed

    private void bt_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_clearActionPerformed
        // TODO add your handling code here:
        t_idServis.setText(null);
        t_nama.setText(null);
        t_telp.setText(null);
        cb_merk.setSelectedItem(String.valueOf("Pilih Merk"));
        t_model.setText(null);
        t_imei.setText(null);
        tp_keluhan.setText(null);
        tp_kerusakan.setText(null);
        t_biaya.setText(null);
    }//GEN-LAST:event_bt_clearActionPerformed

    private void bt_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ubahActionPerformed
        // TODO add your handling code here:
        try {
            if (
                (t_idServis.getText().isEmpty()) && (t_nama.getText().isEmpty()) &&
                (t_telp.getText().isEmpty()) && (t_model.getText().isEmpty()) &&
                (t_imei.getText().isEmpty()) && (tp_keluhan.getText().isEmpty()) &&
                (tp_kerusakan.getText().isEmpty()) && (t_biaya.getText().isEmpty()) &&
                (String.valueOf(cb_merk.getSelectedItem())=="Pilih Merk")
            ){
                JOptionPane.showMessageDialog(null,"Silahkan Pilih Data dulu untuk proses Ubah");
                jTableServisMasuk1.requestFocus();
            } else {
                String SQL="UPDATE film SET nama='"+t_nama.getText()+"',telp='"+t_telp.getText()+"', merk='"+String.valueOf(cb_merk.getSelectedItem())
                +"', model='"+t_model.getText()+"', imei='"+t_imei.getText()+"', keluhan='"+tp_keluhan.getText()
                +"', kerusakan='"+tp_kerusakan.getText()+"', biaya='"+t_biaya.getText()+"', WHERE id_servis='"+t_idServis.getText()+"'";
                new ConfigDB().ubahData(SQL);
                new ConfigDB().tampilTabel(judulKolom, sqlServis, jTableServisMasuk1);
                new ConfigDB().aturLebarKolom(jTableServisMasuk1, lebar);
            }
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }//GEN-LAST:event_bt_ubahActionPerformed

    private void bt_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hapusActionPerformed
        // TODO add your handling code here:
        try {
            if (
                (t_idServis.getText().isEmpty()) && (t_nama.getText().isEmpty()) &&
                (t_telp.getText().isEmpty()) && (t_model.getText().isEmpty()) &&
                (tp_keluhan.getText().isEmpty()) && (tp_kerusakan.getText().isEmpty()) &&
                (t_imei.getText().isEmpty()) && (t_biaya.getText().isEmpty()) &&
                (String.valueOf(cb_merk.getSelectedItem())=="Pilih Merk")
            ) {
                JOptionPane.showMessageDialog(null,"Silahkan Pilih Data dulu untuk proses Hapus");
                jTableServisMasuk1.requestFocus();
            } else {
                String SQL="DELETE FROM tservis WHERE id_servis='"+t_idServis.getText()+"'";
                new ConfigDB().hapusData(SQL);
                new ConfigDB().tampilTabel(judulKolom, sqlServis, jTableServisMasuk1);
                new ConfigDB().aturLebarKolom(jTableServisMasuk1, lebar);
            }
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }//GEN-LAST:event_bt_hapusActionPerformed

    private void t_cariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cariKeyPressed
        // TODO add your handling code here:
        try {
            String SQL="SELECT*FROM tservis WHERE id_servis like '%"+t_cari.getText()+"%'";
            new ConfigDB().cariData(judulKolom, SQL, jTableServisMasuk1);
            } catch (Exception e) {
            System.out.print(e.toString());
        }
    }//GEN-LAST:event_t_cariKeyPressed

    private void bt_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_refreshActionPerformed
        // TODO add your handling code here:
        new ConfigDB().tampilTabel(judulKolom, sqlServis, jTableServisMasuk1);
        new ConfigDB().aturLebarKolom(jTableServisMasuk1, lebar);
    }//GEN-LAST:event_bt_refreshActionPerformed

    private void jTableServisMasuk1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableServisMasuk1MouseClicked
        // TODO add your handling code here:
        try {
            int baris = jTableServisMasuk1.getSelectedRow();
            t_idServis.setText(String.valueOf(jTableServisMasuk1.getValueAt(baris,0)));
            t_nama.setText(String.valueOf(jTableServisMasuk1.getValueAt(baris,1)));
            t_telp.setText(String.valueOf(jTableServisMasuk1.getValueAt(baris,2)));
            cb_merk.setSelectedItem(String.valueOf(jTableServisMasuk1.getValueAt(baris,3)));
            t_model.setText(String.valueOf(jTableServisMasuk1.getValueAt(baris,4)));
            t_imei.setText(String.valueOf(jTableServisMasuk1.getValueAt(baris,5)));
            tp_keluhan.setText(String.valueOf(jTableServisMasuk1.getValueAt(baris,6)));
            tp_kerusakan.setText(String.valueOf(jTableServisMasuk1.getValueAt(baris,7)));
            t_biaya.setText(String.valueOf(jTableServisMasuk1.getValueAt(baris,8)));
            } catch (Exception e) {
            System.out.print(e.toString());
        }
    }//GEN-LAST:event_jTableServisMasuk1MouseClicked

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
            java.util.logging.Logger.getLogger(formServis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formServis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formServis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formServis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formServis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_clear;
    private javax.swing.JButton bt_hapus;
    private javax.swing.JButton bt_keluar;
    private javax.swing.JButton bt_refresh;
    private javax.swing.JButton bt_simpan;
    private javax.swing.JButton bt_ubah;
    private javax.swing.JComboBox<String> cb_merk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableServisMasuk;
    private javax.swing.JTable jTableServisMasuk1;
    private javax.swing.JTextField t_biaya;
    private javax.swing.JTextField t_cari;
    private javax.swing.JTextField t_idServis;
    private javax.swing.JTextField t_imei;
    private javax.swing.JTextField t_model;
    private javax.swing.JTextField t_nama;
    private javax.swing.JTextField t_telp;
    private javax.swing.JTextPane tp_keluhan;
    private javax.swing.JTextPane tp_kerusakan;
    // End of variables declaration//GEN-END:variables
}
