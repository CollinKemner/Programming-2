
package assgn_7_app;

import Total_Cost.Total_Cost;

/**
 *
 * @author Collin Kemner
 */
public class Assgn_7_ClassUI extends javax.swing.JFrame {

    /**
     * Creates new form Assgn_7_Class
     */
    
    Total_Cost total_cost = new Total_Cost();
    public Assgn_7_ClassUI() {
        initComponents();
        mealCostInput.setText(total_cost.getMealCost().toString());
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
        nameLabel = new javax.swing.JLabel();
        mealCostLabel = new javax.swing.JLabel();
        mealCostInput = new javax.swing.JTextField();
        tipLabel = new javax.swing.JLabel();
        tipCalculation = new javax.swing.JTextField();
        name_Label = new javax.swing.JLabel();
        meal1Label = new javax.swing.JLabel();
        meal1Cost = new javax.swing.JTextField();
        meal2Label = new javax.swing.JLabel();
        meal2Cost = new javax.swing.JTextField();
        calc_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        exit_btn = new javax.swing.JButton();
        btn_calctulateTip = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nameLabel.setText("Name:");

        mealCostLabel.setText("Total Cost of Meal ($):");

        mealCostInput.setText("0");

        tipLabel.setText("Tip Calculation ($):");

        tipCalculation.setText("0");

        name_Label.setText("Collin Kemner");

        meal1Label.setText("Meal 1:");

        meal2Label.setText("Meal 2:");

        meal2Cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meal2CostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(meal1Label)
                            .addComponent(nameLabel)
                            .addComponent(meal2Label))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(meal1Cost)
                            .addComponent(meal2Cost)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(tipLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tipCalculation))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(mealCostLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(mealCostInput, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(name_Label))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meal1Label)
                    .addComponent(meal1Cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meal2Label)
                    .addComponent(meal2Cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mealCostLabel)
                    .addComponent(mealCostInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipLabel)
                    .addComponent(tipCalculation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        calc_btn.setText("Calculate Cost");
        calc_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc_btnActionPerformed(evt);
            }
        });

        clear_btn.setText("Clear");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });

        exit_btn.setText("Exit");
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });

        btn_calctulateTip.setText("Calculate Tip");
        btn_calctulateTip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calctulateTipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calc_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_calctulateTip)
                        .addGap(24, 24, 24)
                        .addComponent(clear_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exit_btn))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calc_btn)
                    .addComponent(clear_btn)
                    .addComponent(exit_btn)
                    .addComponent(btn_calctulateTip))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setTip(Float value)
    {
        tipCalculation.setText(Float.toString(value));
        String PrintTip = Float.toString(value);
        
    }
    
    private Float getTip()
    {
        return Float.parseFloat(tipCalculation.getText());
    }
    
     private void UpdateCost()
    {
        mealCostInput.setText(total_cost.getMealCost().toString());
    }
    
    private void calc_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc_btnActionPerformed
        Float firstMealCost = Float.parseFloat(meal1Cost.getText());
        Float secondMealCost = Float.parseFloat(meal1Cost.getText());
        total_cost.Meal1Cost(firstMealCost);
        total_cost.Meal1Cost(secondMealCost);
        UpdateCost();
        
    }//GEN-LAST:event_calc_btnActionPerformed
            
    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        mealCostInput.setText("0");
        tipCalculation.setText("0");
        meal1Cost.setText("");
        meal2Cost.setText("");
    }//GEN-LAST:event_clear_btnActionPerformed

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exit_btnActionPerformed

    private void meal2CostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meal2CostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meal2CostActionPerformed

    private void btn_calctulateTipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calctulateTipActionPerformed
       Float meal1CostInput = Float.parseFloat(meal1Cost.getText());
       Float meal2CostInput = Float.parseFloat(meal2Cost.getText());
       
       Float mealCost = meal1CostInput + meal2CostInput;
       System.out.println(Double.toString(Double.parseDouble(Float.toString(mealCost))));
       double Tip = mealCost * (0.20);
       tipCalculation.setText(Double.toString(Tip));
    }//GEN-LAST:event_btn_calctulateTipActionPerformed
    
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
            java.util.logging.Logger.getLogger(Assgn_7_ClassUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assgn_7_ClassUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assgn_7_ClassUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assgn_7_ClassUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assgn_7_ClassUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calctulateTip;
    private javax.swing.JButton calc_btn;
    private javax.swing.JButton clear_btn;
    private javax.swing.JButton exit_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField meal1Cost;
    private javax.swing.JLabel meal1Label;
    private javax.swing.JTextField meal2Cost;
    private javax.swing.JLabel meal2Label;
    private javax.swing.JTextField mealCostInput;
    private javax.swing.JLabel mealCostLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel name_Label;
    private javax.swing.JTextField tipCalculation;
    private javax.swing.JLabel tipLabel;
    // End of variables declaration//GEN-END:variables
}