/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.company.resume.panel;

import com.company.dao.inter.EmploymentHistoryDaoInter;
import com.company.entity.EmploymentHistory;
import com.company.main.Context;
import com.company.resume.config.Config;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Xədicə Abbasova
 */
public class EmploymentHistoryPanel extends javax.swing.JPanel {
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    EmploymentHistoryDaoInter employmentHistoryDao = Context.instanceEmploymentHistoryDao();
    
    public EmploymentHistoryPanel() {
        initComponents();
        
    }
    List<EmploymentHistory> list;
    
    private void fillTable() {
        
        list = employmentHistoryDao.getAllEmploymentHistoryByUserId(Config.loggedInUser.getId());
        
        Vector<Vector> rows = new Vector<>();
        for (EmploymentHistory emp : list) {
            Vector row = new Vector();
            row.add(emp.getHeader());
            row.add(emp.getBeginDate());
            row.add(emp.getEndDate());
            row.add(emp.getJobDescription());
            rows.add(row);
        }
        Vector<String> columns = new Vector<>();
        columns.add("Header");
        columns.add("Begin Date");
        columns.add("End Date");
        columns.add("Job Description");
        
        DefaultTableModel model = new DefaultTableModel(rows, columns);
        tblEmploymentHistory.setModel(model);
        
    }
    
    public void fillUserComponents() {
        fillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmploymentHistory = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        lblJobDesc = new javax.swing.JLabel();
        txtHeader = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtJobDescription = new javax.swing.JTextArea();
        lblBeginDate = new javax.swing.JLabel();
        lblEndDate = new javax.swing.JLabel();
        BeginDateChooser = new com.toedter.calendar.JDateChooser();
        EndDateChooser = new com.toedter.calendar.JDateChooser();
        btnAddEmploymentHistory = new javax.swing.JButton();
        btnDeleteEmploymentHistory = new javax.swing.JButton();
        btnSaveEmploymentHistory = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        tblEmploymentHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblEmploymentHistory);

        lblHeader.setText("Header:");

        lblJobDesc.setText("Job Description:");

        txtJobDescription.setColumns(20);
        txtJobDescription.setRows(5);
        jScrollPane2.setViewportView(txtJobDescription);

        lblBeginDate.setText("Begin Date");

        lblEndDate.setText("End Date");

        BeginDateChooser.setDateFormatString("yyyy-MM-dd");

        EndDateChooser.setDateFormatString("yyyy-MM-dd");

        btnAddEmploymentHistory.setText("Add");
        btnAddEmploymentHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmploymentHistoryActionPerformed(evt);
            }
        });

        btnDeleteEmploymentHistory.setText("Delete");
        btnDeleteEmploymentHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEmploymentHistoryActionPerformed(evt);
            }
        });

        btnSaveEmploymentHistory.setText("Save");
        btnSaveEmploymentHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveEmploymentHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblJobDesc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblHeader)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addComponent(txtHeader))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBeginDate)
                            .addComponent(lblEndDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BeginDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(EndDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddEmploymentHistory)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteEmploymentHistory)
                        .addGap(18, 18, 18)
                        .addComponent(btnSaveEmploymentHistory)
                        .addGap(0, 35, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeader)
                        .addComponent(txtHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblBeginDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BeginDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblJobDesc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEndDate)
                                    .addComponent(EndDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAddEmploymentHistory)
                                    .addComponent(btnDeleteEmploymentHistory)
                                    .addComponent(btnSaveEmploymentHistory))
                                .addGap(26, 26, 26))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteEmploymentHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEmploymentHistoryActionPerformed
        int index = tblEmploymentHistory.getSelectedRow();
        EmploymentHistory emp = list.get(index);
        employmentHistoryDao.removeEmploymentHistory(emp.getId());
        fillTable();
    }//GEN-LAST:event_btnDeleteEmploymentHistoryActionPerformed

    private void btnAddEmploymentHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmploymentHistoryActionPerformed
        // TODO add your handling code here
        EmploymentHistory emp = new EmploymentHistory(null, txtHeader.getText(), null, null, txtJobDescription.getText(), Config.loggedInUser);
        
        try { 
            java.util.Date dt = BeginDateChooser.getDate();
            if (dt != null) {
                long l = dt.getTime();
                java.sql.Date begin_date = new java.sql.Date(l);
                emp.setBeginDate(begin_date);
            }
            
            java.util.Date dt2 = EndDateChooser.getDate();
            if (dt2 != null) {
                long l2 = dt2.getTime();
                java.sql.Date end_date = new java.sql.Date(l2);
                emp.setEndDate(end_date);
            }
            employmentHistoryDao.addEmploymentHistory(emp);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        fillTable();
    }//GEN-LAST:event_btnAddEmploymentHistoryActionPerformed

    private void btnSaveEmploymentHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveEmploymentHistoryActionPerformed
        // TODO add your handling code here:
        int index = tblEmploymentHistory.getSelectedRow();
        EmploymentHistory selectedEmploymentHistory = list.get(index);
        
        String header = txtHeader.getText();
        String job_description = txtJobDescription.getText();
        if (header != null && !header.trim().isEmpty()) {
            selectedEmploymentHistory.setHeader(header);
        }
        if (job_description != null && !job_description.trim().isEmpty()) {
            selectedEmploymentHistory.setJobDescription(job_description);
        }
        
        java.util.Date dt = BeginDateChooser.getDate();
        if (dt != null) {
            long l = dt.getTime();
            java.sql.Date begin_date = new java.sql.Date(l);
            selectedEmploymentHistory.setBeginDate(begin_date);
            
        }
        
        java.util.Date dt2 = EndDateChooser.getDate();
        if (dt2 != null) {
            long l2 = dt2.getTime();
            java.sql.Date end_date = new java.sql.Date(l2);
            selectedEmploymentHistory.setEndDate(end_date);
        }
        
        employmentHistoryDao.updateEmploymentHistory(selectedEmploymentHistory);
        fillTable();
    }//GEN-LAST:event_btnSaveEmploymentHistoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser BeginDateChooser;
    private com.toedter.calendar.JDateChooser EndDateChooser;
    private javax.swing.JButton btnAddEmploymentHistory;
    private javax.swing.JButton btnDeleteEmploymentHistory;
    private javax.swing.JButton btnSaveEmploymentHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBeginDate;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblJobDesc;
    private javax.swing.JTable tblEmploymentHistory;
    private javax.swing.JTextField txtHeader;
    private javax.swing.JTextArea txtJobDescription;
    // End of variables declaration//GEN-END:variables
}