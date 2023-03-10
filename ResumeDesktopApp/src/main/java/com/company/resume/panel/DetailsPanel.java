package com.company.resume.panel;

import com.company.dao.inter.CountryDaoInter;
import com.company.entity.Country;
import com.company.entity.User;
import com.company.main.Context;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import com.company.resume.config.Config;

/**
 *
 * @author Xədicə Abbasova
 */
public class DetailsPanel extends javax.swing.JPanel {

    private CountryDaoInter countryDao = Context.instanceCountryDao();

    /**
     * Creates new form DetailsPanel
     */
    public DetailsPanel() {
        initComponents();

    }
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public void fillUserComponents() {
        fillWindow();
        User loggedInUser = Config.loggedInUser;

        txtPhone.setText(loggedInUser.getPhone());

        Date dt = loggedInUser.getBirthDate();
        String dtStr = sdf.format(dt);
        txtBirthdate.setText(dtStr);

        txtEmail.setText(loggedInUser.getEmail());
        txtAdress.setText(loggedInUser.getAddress());

        cbCountry.setSelectedItem(loggedInUser.getBirthPlace());
        cbNationality.setSelectedItem(loggedInUser.getNationality());

    }

    public void fillUser(User user) {

        try {
            String birthDate = txtBirthdate.getText();
            String email = txtEmail.getText();
            String phone = txtPhone.getText();
            String address = txtAdress.getText();

            java.util.Date dtUtil = sdf.parse(birthDate);
            long l = dtUtil.getTime();

            java.sql.Date bd = new java.sql.Date(l);
            user.setBirthDate(bd);
            user.setEmail(email);
            user.setPhone(phone);
            user.setBirthPlace((Country) cbCountry.getSelectedItem());
            user.setNationality((Country) cbNationality.getSelectedItem());
            user.setAddress(address);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    private void fillWindow() {
        List<Country> countries = countryDao.getAll();
        for (Country c : countries) {
            cbCountry.addItem(c);
            cbNationality.addItem(c);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDetails = new javax.swing.JPanel();
        lblAdress = new javax.swing.JLabel();
        txtAdress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblNationality = new javax.swing.JLabel();
        txtBirthdate = new javax.swing.JTextField();
        lblBirthdate = new javax.swing.JLabel();
        lblBirthplace = new javax.swing.JLabel();
        cbCountry = new javax.swing.JComboBox<>();
        cbNationality = new javax.swing.JComboBox<>();

        lblAdress.setText("Address");

        txtAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdressActionPerformed(evt);
            }
        });

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        lblPhone.setText("Phone");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblEmail.setText("Email");

        lblNationality.setText("Nationality");

        txtBirthdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirthdateActionPerformed(evt);
            }
        });

        lblBirthdate.setText("Birthdate");

        lblBirthplace.setText("Birthplace");

        javax.swing.GroupLayout pnlDetailsLayout = new javax.swing.GroupLayout(pnlDetails);
        pnlDetails.setLayout(pnlDetailsLayout);
        pnlDetailsLayout.setHorizontalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNationality, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(lblBirthplace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAdress, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txtPhone)
                    .addComponent(txtEmail)
                    .addComponent(txtBirthdate)
                    .addComponent(cbCountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbNationality, 0, 100, Short.MAX_VALUE))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        pnlDetailsLayout.setVerticalGroup(
            pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetailsLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdress)
                    .addGroup(pnlDetailsLayout.createSequentialGroup()
                        .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail))
                        .addGap(17, 17, 17)
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBirthdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBirthplace)
                            .addComponent(cbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(pnlDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNationality)
                    .addComponent(cbNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdressActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtBirthdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBirthdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBirthdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Country> cbCountry;
    private javax.swing.JComboBox<Country> cbNationality;
    private javax.swing.JLabel lblAdress;
    private javax.swing.JLabel lblBirthdate;
    private javax.swing.JLabel lblBirthplace;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNationality;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JPanel pnlDetails;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtBirthdate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
