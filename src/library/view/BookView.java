/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.view;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import library.dao.BookDao;
import library.dao.CategoryDao;
import library.model.Book;
import library.model.BookCategory;

/**
 *
 * @author User
 */
public class BookView extends javax.swing.JInternalFrame {

    /**
     * Creates new form BookView
     */
    public BookView() {
        initComponents();
        populateBook();
        populateCategory();
        populateCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        savebook = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        booktable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        categorycombo = new javax.swing.JComboBox<String>();
        jLabel9 = new javax.swing.JLabel();
        upload = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pages = new javax.swing.JTextField();
        author = new javax.swing.JTextField();
        pub = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        copies = new javax.swing.JTextField();
        deletebook = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        searchb = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cattable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        catid = new javax.swing.JTextField();
        catname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        addbookcat = new javax.swing.JButton();
        updatecat = new javax.swing.JButton();
        deletecat = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        searchc = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
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

        bookPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bookPaneStateChanged(evt);
            }
        });

        savebook.setText("Save");
        savebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebookActionPerformed(evt);
            }
        });

        booktable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Id", "Title", "Publishing house", "Date of publication", "Author", "Pages", "Book category"
            }
        ));
        jScrollPane1.setViewportView(booktable);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Book Category"));

        jLabel9.setText("Book Id and Name:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(categorycombo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categorycombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        upload.setText("Update");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Book Details"));

        jLabel1.setText("Book Id:");

        jLabel2.setText("Title:");

        jLabel3.setText("Publishing house:");

        jLabel4.setText("Date of publication:");

        jLabel5.setText("Author:");

        jLabel6.setText("Pages:");

        jLabel10.setText("No. of copies:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addGap(88, 88, 88)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(id, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(title, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pub, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(author)
                    .addComponent(pages)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(copies))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(17, 17, 17)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(copies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)))
        );

        deletebook.setText("Delete");
        deletebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebookActionPerformed(evt);
            }
        });

        jLabel11.setText("Search by book Id");

        searchb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbActionPerformed(evt);
            }
        });
        searchb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchbKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(savebook, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(upload)
                                .addGap(61, 61, 61)
                                .addComponent(deletebook)
                                .addGap(102, 102, 102))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(searchb, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(upload)
                            .addComponent(savebook)
                            .addComponent(deletebook))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(searchb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        bookPane.addTab("Book", jPanel1);

        cattable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category Id", "Category Name"
            }
        ));
        jScrollPane2.setViewportView(cattable);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Category Details"));

        jLabel7.setText("Category Id");

        jLabel8.setText("Category Name");

        addbookcat.setText("Save");
        addbookcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbookcatActionPerformed(evt);
            }
        });

        updatecat.setText("Update");
        updatecat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatecatActionPerformed(evt);
            }
        });

        deletecat.setText("Delete");
        deletecat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletecatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addbookcat)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(catid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(catname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(updatecat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deletecat)
                        .addGap(23, 23, 23)))
                .addGap(34, 34, 34))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbookcat)
                    .addComponent(updatecat)
                    .addComponent(deletecat))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel12.setText("Search by category Id");

        searchc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchcActionPerformed(evt);
            }
        });
        searchc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchcKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(searchc, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(searchc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(280, Short.MAX_VALUE))
        );

        bookPane.addTab("Book Category", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookPane, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebookActionPerformed
        // TODO add your handling code here:
        Book b = new Book();
        CategoryDao bcdao = new CategoryDao();
       b.setBookid(id.getText());
       b.setTitle(title.getText());
       b.setPublishingHouse(pub.getText());
       b.setDateOfPublication(new Date(date.getDate().getTime()));
       b.setAuthor(author.getText());
       b.setPages(Integer.valueOf(pages.getText()));
       b.setCopies(Integer.valueOf(copies.getText()));
       b.setBookCategory(new BookCategory(bcdao.getCategoryId(categorycombo.getSelectedItem().toString())));
        BookDao bdao = new BookDao();
        bdao.saveBook(b);
        JOptionPane.showMessageDialog(this, "Book saved.");
        populateBook();
    }//GEN-LAST:event_savebookActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        // TODO add your handling code here:
        Book b = new Book();
        CategoryDao bcdao = new CategoryDao();
       b.setBookid(id.getText());
       b.setTitle(title.getText());
       b.setPublishingHouse(pub.getText());
       b.setDateOfPublication(new Date(date.getDate().getTime()));
       b.setAuthor(author.getText());
       b.setPages(Integer.valueOf(pages.getText()));
       b.setCopies(Integer.valueOf(copies.getText()));
       b.setBookCategory(new BookCategory(bcdao.getCategoryId(categorycombo.getSelectedItem().toString())));
        BookDao bdao = new BookDao();
        bdao.updateBook(b);
        JOptionPane.showMessageDialog(this, "Book updated.");
        populateBook();
       
    }//GEN-LAST:event_uploadActionPerformed

    private void addbookcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbookcatActionPerformed
        // TODO add your handling code here:
       BookCategory bc = new BookCategory();
       bc.setCategoryId(catid.getText());
       bc.setCategoryName(catname.getText());
        CategoryDao cdao = new CategoryDao();
        cdao.saveBookCategory(bc);
        JOptionPane.showMessageDialog(this, "Category saved.");
        populateCategory();
    }//GEN-LAST:event_addbookcatActionPerformed

    private void deletebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebookActionPerformed
        // TODO add your handling code here:
        Book b = new Book(id.getText());
        BookDao bdao = new BookDao();
        bdao.deleteBook(b);
        JOptionPane.showMessageDialog(this, "Book deleted.");
        populateBook();
    }//GEN-LAST:event_deletebookActionPerformed

    private void updatecatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatecatActionPerformed
        // TODO add your handling code here:
        BookCategory bc = new BookCategory();
       bc.setCategoryId(catid.getText());
       bc.setCategoryName(catname.getText());
        CategoryDao cdao = new CategoryDao();
        cdao.updateBookCategory(bc);
        JOptionPane.showMessageDialog(this, "Category updated.");
        populateCategory();
    }//GEN-LAST:event_updatecatActionPerformed

    private void deletecatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletecatActionPerformed
        // TODO add your handling code here:
        BookCategory bc = new BookCategory(catid.getText());
        CategoryDao cdao = new CategoryDao();
        cdao.deleteBookCategory(bc);
        JOptionPane.showMessageDialog(this, "Category deleted.");
        populateCategory();
    }//GEN-LAST:event_deletecatActionPerformed

    private void searchbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbActionPerformed

    private void searchcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchcActionPerformed

    private void searchcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchcKeyReleased
        // TODO add your handling code here:
        CategoryDao bdao = new CategoryDao();
        List<BookCategory> cats = bdao.findByCategoryId(searchc.getText());
        for(BookCategory c: cats){
            catid.setText(c.getCategoryId());
            catname.setText(c.getCategoryName());
        }
    }//GEN-LAST:event_searchcKeyReleased

    private void searchbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbKeyReleased
        // TODO add your handling code here:
        BookDao bdao = new BookDao();
        List<Book> books = bdao.findByBookId(searchb.getText());
        for(Book b: books){
            id.setText(b.getBookid());
            title.setText(b.getTitle());
            pub.setText(b.getPublishingHouse());
            date.setDate(b.getDateOfPublication());
            author.setText(b.getAuthor());
            pages.setText(b.getPages().toString());
            copies.setText(b.getCopies().toString());
            categorycombo.setSelectedItem(b.getBookCategory());
        }
    }//GEN-LAST:event_searchbKeyReleased

    private void bookPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bookPaneStateChanged
        // TODO add your handling code here:
        populateCombo();
    }//GEN-LAST:event_bookPaneStateChanged

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        populateCombo();
    }//GEN-LAST:event_formInternalFrameOpened

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbookcat;
    private javax.swing.JTextField author;
    private javax.swing.JTabbedPane bookPane;
    private javax.swing.JTable booktable;
    private javax.swing.JComboBox<String> categorycombo;
    private javax.swing.JTextField catid;
    private javax.swing.JTextField catname;
    private javax.swing.JTable cattable;
    private javax.swing.JTextField copies;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton deletebook;
    private javax.swing.JButton deletecat;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField pages;
    private javax.swing.JTextField pub;
    private javax.swing.JButton savebook;
    private javax.swing.JTextField searchb;
    private javax.swing.JTextField searchc;
    private javax.swing.JTextField title;
    private javax.swing.JButton updatecat;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
    private void populateBook(){
        String[] colnames = {"Book Id","Title","Pub. House","Pub. Date","Author","Pages","Copies","Book Category"};
        DefaultTableModel model = (DefaultTableModel) booktable.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(colnames);
        BookDao bdao = new BookDao();
        List<Book> books = bdao.displayBook();
        for(Book b:books){
            Object[] obj = {b.getBookid(),b.getTitle(),b.getPublishingHouse(),b.getDateOfPublication(),b.getAuthor(),b.getPages(),b.getCopies(),b.getBookCategory()};
            model.addRow(obj);
        }
        booktable.setModel(model);
    }
    
    private void populateCategory(){
        String[] colnames = {"Category Id","Category Name"};
        DefaultTableModel model = (DefaultTableModel) cattable.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(colnames);
        CategoryDao cdao = new CategoryDao();
        List<BookCategory> cats = cdao.displayBookCategory();
        for(BookCategory bc:cats){
            Object[] obj = {bc.getCategoryId(),bc.getCategoryName()};
            model.addRow(obj);
        }
        cattable.setModel(model);
    }
    
    private void populateCombo(){
        CategoryDao bdao = new CategoryDao();
        List<String> names = bdao.CategoryNames();
        categorycombo.removeAllItems();
        for(String b: names){
            categorycombo.addItem(b);
        }
    }
}