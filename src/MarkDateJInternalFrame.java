/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancems_with_prepared22;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rahul mishra code
 */
public class MarkDateJInternalFrame extends javax.swing.JInternalFrame {
ConnectClass c;
    /**
     * Creates new form MarkDateJInternalFrame
     */
    public MarkDateJInternalFrame() {
        initComponents();
        c = new ConnectClass();
        
        setTitle ("Date Entry");
        //Calling batch method
        batch();
    }
    
    /**
     * Filling batch code combo box
     */
    public void batch(){
        try{
            ResultSet rs = c.st.executeQuery("select batch_code from tbl_batch");
            while(rs.next()){
                jComboBox1.addItem(rs.getString(1));
            }
        }
        catch(Exception ex){
            System.out.println(ex.toString());
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

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        DatesDataTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        BatchStdData = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        MarkdateBG = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(990, 550));
        setMinimumSize(new java.awt.Dimension(990, 550));
        setPreferredSize(new java.awt.Dimension(990, 550));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Batch Code");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 20, 130, 40);
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(160, 30, 270, 30);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(600, 30, 230, 30);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(540, 30, 120, 30);

        jButton1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/getdata.png"))); // NOI18N
        jButton1.setText("GetData");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(120, 100, 130, 40);

        jButton2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/details.png"))); // NOI18N
        jButton2.setText("Details");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(480, 100, 120, 40);

        jLayeredPane1.setBackground(new java.awt.Color(255, 51, 0));

        DatesDataTable.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        DatesDataTable.setForeground(new java.awt.Color(255, 255, 255));
        DatesDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Book", "Book Session"
            }
        ));
        DatesDataTable.setOpaque(false);
        ((DefaultTableCellRenderer)DatesDataTable.getDefaultRenderer(Object.class)).setOpaque(false);

        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        DatesDataTable.setShowGrid(false);
        jScrollPane1.setViewportView(DatesDataTable);

        jLayeredPane1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 300, 350);

        BatchStdData.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        BatchStdData.setForeground(new java.awt.Color(255, 255, 255));
        BatchStdData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student Name", "Batch Code"
            }
        ));
        BatchStdData.setOpaque(false);
        ((DefaultTableCellRenderer)BatchStdData.getDefaultRenderer(Object.class)).setOpaque(false);

        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);

        BatchStdData.setShowGrid(false);
        jScrollPane2.setViewportView(BatchStdData);

        jLayeredPane1.add(jScrollPane2);
        jScrollPane2.setBounds(360, 0, 310, 350);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(100, 150, 670, 350);

        jButton3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/adddate.png"))); // NOI18N
        jButton3.setText("Add Date");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(620, 100, 130, 40);

        MarkdateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/FrameBG.png"))); // NOI18N
        getContentPane().add(MarkdateBG);
        MarkdateBG.setBounds(0, 0, 980, 520);

        setBounds(0, 0, 990, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dt = (DefaultTableModel)DatesDataTable.getModel();
        while(dt.getRowCount() >0) {
            for(int i=0 ; i<dt.getRowCount();i++) {
                dt.removeRow(i);
            }
        }
        
        try {
            
            String batch_code = (String) jComboBox1.getSelectedItem();
            
            PreparedStatement pst = c.xc.prepareStatement("select attend_date, std_book ,std_book_session from std_attend where std_batch_code = ? group by attend_date,std_book_session,std_book");
            pst.setString(1, batch_code);
            
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()){
                dt.addRow(new Object []{rs.getString(1),rs.getString(2),rs.getString(3)});
            }
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            
            DefaultTableModel dt = (DefaultTableModel) BatchStdData.getModel();
            
            dt.setRowCount(0);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            String d = sdf.format(jDateChooser1.getDate());
            
            String batch_code = (String) jComboBox1.getSelectedItem();
            PreparedStatement pst = c.xc.prepareStatement("select *  from tbl_std where tbl_std.std_batch_code = ?");
            pst.setString(1, batch_code);
            
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getString("std_id"), rs.getString("std_name"), rs.getString("std_batch_code")});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dt = (DefaultTableModel)DatesDataTable.getModel();
        while(dt.getRowCount() >0) {
            for(int i=0 ; i<dt.getRowCount();i++) {
                dt.removeRow(i);
            }
        }
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String d = sdf.format(jDateChooser1.getDate());
        
        try {
            for (int i = 0; i < BatchStdData.getRowCount(); i++) {
                String stdID = BatchStdData.getModel().getValueAt(i, 0).toString();
                String stdName = BatchStdData.getModel().getValueAt(i, 1).toString();
                String stdBatch = BatchStdData.getModel().getValueAt(i, 2).toString();
                
                c.st.executeUpdate("insert into std_attend values ('" + d + "'," + stdID + ",'" + stdName + "','" + stdBatch + "',NULL,NULL,NULL)");
            }
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        JOptionPane.showMessageDialog(this, d+"Date had been Added");
        
        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BatchStdData;
    private javax.swing.JTable DatesDataTable;
    private javax.swing.JLabel MarkdateBG;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
