/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gr.aueb.dmst.mazegame;

import javax.swing.JTextField;

/**
 *
 * @author Stelios
 */
public class odhgies extends javax.swing.JFrame {

    /**
     * Creates new form odhgies
     */
    public odhgies() {
        this.setResizable(false);
        initComponents();
        jTextArea2.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        canvas1 = new java.awt.Canvas();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Καλώς ήρθες στο Maze. Έναν λαβύρινθο ιστορικού περιεχομένου.\nΓια να καταφέρεις να φτάσεις στην έξοδο του λαβυρίνθου θα πρέπει να «ξεκλειδώσεις»\nτις πόρτες που θα συναντήσεις στην πορεία σου, απαντώντας σωστά στις ερωτήσεις μυθολογίας που θα σου \nεμφανίζονται με τυχαία σειρά. \nΓια κάθε σωστή απάντηση, σου δίνεται η δυνατότητα να επιλέξεις το επόμενό σου βήμα.\nΓια κάθε λανθασμένη απάντηση, δεν θα σου δίνεται η δυνατότητα να προχωρήσεις \nΟ χρόνος που έχεις στην διάθεσή σου είναι 3’\n\nΓια να επιλέξεις την κατεύθυνση που επιθυμείς χρησιμοποίησε το (w,a,s,d)(πάνω,αριστερά, κάτω, δεξία)\nΓια να απαντήσεις οποιαδήποτε ερώτηση επίλεξε την καταλληλότερη απάντηση για εσένα.\n\nΕίσαι έτοιμος να ξεκινήσεις ;  \n\n\n");
        jScrollPane2.setViewportView(jTextArea2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ΠΕΡΙΓΡΑΦΗ – ΟΔΗΓΙΕΣ ΛΑΒΥΡΙΝΘΟΥ ");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1.setText("Πίσω");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 958,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(69, 69, 69)
                                                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(223, 223, 223)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 673,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(421, 421, 421)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 208,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)));

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        MainFrame mainf = new MainFrame();
        mainf.setVisible(true);
    }

    // Variables declaration - do not modify
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration
}
