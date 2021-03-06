/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.view;

import library.dao.OperationsDao;
import library.model.Operations;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import library.dao.BookDao;
import library.dao.ClientDao;

/**
 *
 * @author User
 */
public class AllOperations extends javax.swing.JInternalFrame {

    /**
     * Creates new form AllOperation
     */
    public AllOperations() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        in = new javax.swing.JRadioButton();
        out = new javax.swing.JRadioButton();
        all = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Report of all operations");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        buttonGroup1.add(in);
        in.setText("Check in");
        in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inActionPerformed(evt);
            }
        });

        buttonGroup1.add(out);
        out.setText("Check out");
        out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outActionPerformed(evt);
            }
        });

        buttonGroup1.add(all);
        all.setText("All");
        all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(in)
                        .addGap(18, 18, 18)
                        .addComponent(out)
                        .addGap(18, 18, 18)
                        .addComponent(all))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(in)
                    .addComponent(out)
                    .addComponent(all))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Object[] colnames = {"Operation No","Client Name","Book Name","Borrowed/Return date","Operation category","Status"};
        DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
        tm.setRowCount(0);
        tm.setColumnIdentifiers(colnames);
        OperationsDao ckdao =  new OperationsDao();
        ClientDao cdao = new ClientDao();
        BookDao bdao = new BookDao();
        List<Operations> operations = ckdao.getCheckInOut();
        for(Operations c:operations){
            Object obj[] ={c.getOpId(),cdao.getClientName(c.getClient().getRegid()),bdao.getBookName(c.getBook().getBookid()),c.getDatetime(),c.getOperationCategory(),c.getStatus()};
            tm.addRow(obj);
        }
        jTable1.setModel(tm);
    }//GEN-LAST:event_formInternalFrameOpened

    private void inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inActionPerformed
        Object[] colnames = {"Operation No","Client Name","Book Name","Borrowed/Return date","Operation category","Status"};
        DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
        tm.setRowCount(0);
        tm.setColumnIdentifiers(colnames);
        OperationsDao ckdao =  new OperationsDao();
        ClientDao cdao = new ClientDao();
        BookDao bdao = new BookDao();
        List<Operations> operations = ckdao.getCheckInOut();
        for(Operations c:operations){
            Object obj[] ={c.getOpId(),cdao.getClientName(c.getClient().getRegid()),bdao.getBookName(c.getBook().getBookid()),c.getDatetime(),c.getOperationCategory(),c.getStatus()};
            if(c.getOperationCategory().equals("CHECK IN"))
                tm.addRow(obj);
        }
        jTable1.setModel(tm);
    }//GEN-LAST:event_inActionPerformed

    private void outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outActionPerformed
        // TODO add your handling code here:
        Object[] colnames = {"Operation No","Client Name","Book Name","Borrowed/Return date","Operation category","Status"};
        DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
        tm.setRowCount(0);
        tm.setColumnIdentifiers(colnames);
        OperationsDao ckdao =  new OperationsDao();
        ClientDao cdao = new ClientDao();
        BookDao bdao = new BookDao();
        List<Operations> operations = ckdao.getCheckInOut();
        for(Operations c:operations){
            Object obj[] ={c.getOpId(),cdao.getClientName(c.getClient().getRegid()),bdao.getBookName(c.getBook().getBookid()),c.getDatetime(),c.getOperationCategory(),c.getStatus()};
            if(c.getOperationCategory().equals("CHECK OUT"))
                 tm.addRow(obj);
        }
        jTable1.setModel(tm);
    }//GEN-LAST:event_outActionPerformed

    private void allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allActionPerformed
        // TODO add your handling code here:
        Object[] colnames = {"Operation No","Client Name","Book Name","Borrowed/Return date","Operation category","Status"};
        DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
        tm.setRowCount(0);
        tm.setColumnIdentifiers(colnames);
        OperationsDao ckdao =  new OperationsDao();
        ClientDao cdao = new ClientDao();
        BookDao bdao = new BookDao();
        List<Operations> operations = ckdao.getCheckInOut();
        for(Operations c:operations){
            Object obj[] ={c.getOpId(),cdao.getClientName(c.getClient().getRegid()),bdao.getBookName(c.getBook().getBookid()),c.getDatetime(),c.getOperationCategory(),c.getStatus()};
            tm.addRow(obj);
        }
        jTable1.setModel(tm);
    }//GEN-LAST:event_allActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton all;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton in;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton out;
    // End of variables declaration//GEN-END:variables
}
