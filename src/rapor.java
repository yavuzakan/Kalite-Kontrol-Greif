import java.awt.event.KeyEvent;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yca
 */
public class rapor extends javax.swing.JFrame {
    public  Connection c;
 public Statement st;
 public Statement st2;
public  ResultSet rs;
public  ResultSet rs2;
 public static String id;
 public static String lotno;
    /**
     * Creates new form rapor
     */
    public rapor() {
        initComponents();
        jTextField5.setVisible(false);
          setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
           jTable1.setShowGrid(true);
           
           this.liste1();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ÜRÜN BUL");

        jLabel1.setText("Sap No");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel2.setText("Lot No");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "S.K.FORM NO", "ÜRÜN ADI", "LOT NO", "TARİH", "SİPARİŞ NO", "GELEN MİKTAR", "MİN", "MAX", "GERÇEKLEŞEN", "TEST KOŞULLARI", "SAP NO", "FİRMA", "ÜRÜN TÜRÜ", "BÖLÜMLER", "KARAR", "SERTİFİKA", "NOTLAR", "İRSALİYE NO", "Ek"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(1).setMinWidth(40);
            jTable1.getColumnModel().getColumn(2).setMinWidth(150);
            jTable1.getColumnModel().getColumn(3).setMinWidth(100);
            jTable1.getColumnModel().getColumn(4).setMinWidth(105);
            jTable1.getColumnModel().getColumn(5).setMinWidth(100);
            jTable1.getColumnModel().getColumn(19).setMinWidth(40);
        }

        jLabel3.setText("Ürün Adı");

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jButton1.setText("Ara");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });

        jButton2.setText("Yükle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText(" ");

        jButton3.setText("İndir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("S.K. FORM NO");

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });

        jButton4.setText("<-");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("->");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SİPARİŞ NO", "GELEN MİKTAR", "MİN", "MAX", "GERÇEKLEŞEN", "TEST KOŞUL", "FİRMA", "ÜRÜN TÜRÜ", "BÖLÜMLER", "KARAR", "SERTİFİKA", "S.K.FORM NO", "İRSALİYE NO", "KAYIT TARİHİ" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox3, 0, 138, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.ara();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
                if(evt.getKeyCode() == KeyEvent.VK_ENTER) 
        {
          this.ara();
        }  
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
              if(evt.getKeyCode() == KeyEvent.VK_ENTER) 
        {
          this.ara();
        }  
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
               if(evt.getKeyCode() == KeyEvent.VK_ENTER) 
        {
          this.ara();
        }  
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        
        
        
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        this.id = jTextField5.getText();
        this.lotno = jTextField4.getText();
        
          if ( this.id.isEmpty())
          
                                {  
                               
                                    
                                } 
                   
                   else
                                {
                                   yukle yukle = new yukle();
                                   yukle.setVisible(true);
                                }
                                
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
  
     
       
        // jTextField5.setText(tablo.getValueAt(jTable1.getSelectedRow(), 0).toString());
         jTextField5.setText( jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        
        // jTextField4.setText(tablo.getValueAt(jTable1.getSelectedRow(), 1).toString());
         jTextField4.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
         this.dosya2();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        this.id = jTextField5.getText();
        this.lotno = jTextField4.getText();
        
          if ( this.id.isEmpty())
          
                                {  
                               
                                    
                                } 
                   
                   else
                                {
                                   indir indir = new indir();
                                   indir.setVisible(true);
                                }
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
  if(evt.getKeyCode() == KeyEvent.VK_ENTER) 
        {
          this.ara();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER) 
        {
          this.ara();
        }  
    }//GEN-LAST:event_jTextField7KeyPressed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
                  
         
            jComboBox2.removeAllItems();
             jTextField7.setText("");
            
        String combo2 =jComboBox1.getSelectedItem().toString();

                    
                    
         if (combo2.equals("FİRMA"))
            {
   try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:kalite.sqlite");
            st = c.createStatement();
            
               //String query = "SELECT * FROM urun where sap like '"+ arama +"' limit 1";
            
             String query = "SELECT DISTINCT firma FROM urun" ;
      
        rs = st.executeQuery(query);
       
               while(rs.next())
         {

            String firma  = rs.getString("firma"); 
            
            //String firmakod  = rs.getString("firmakod"); 
            jComboBox2.addItem(firma);
  
         }


       }
       catch ( Exception e ) {
     // System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    // JOptionPane.showMessageDialog(null , " Hatalı veya eksik giriş", "Hata", -1);
    }
  
            }
     
        
        //ÜRÜN TÜRÜ
         
         if (combo2.equals("ÜRÜN TÜRÜ"))
            {
            try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:kalite.sqlite");
            st = c.createStatement();
            
               //String query = "SELECT * FROM urun where sap like '"+ arama +"' limit 1";
            
             String query = "SELECT DISTINCT urunturu FROM urun" ;
      
        rs = st.executeQuery(query);
       
               while(rs.next())
         {

            String firma  = rs.getString("urunturu"); 
            
            //String firmakod  = rs.getString("firmakod"); 
            jComboBox2.addItem(firma);
  
         }


       }
       catch ( Exception e ) {
     // System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    // JOptionPane.showMessageDialog(null , " Hatalı veya eksik giriş", "Hata", -1);
    }
  
            }
        
         
         
         
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
        
                
        try{
               String combo2 =jComboBox2.getSelectedItem().toString();
        
        if (combo2.equals(null))
        {
            
        }
        else
        {
        jTextField7.setText(combo2);
        } 
          }   
          catch(Exception e)
                  {
                      
                  }
        
        
        
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        
                               try{
               String combo3 =jComboBox3.getSelectedItem().toString();
       
        if (combo3.equals(null))
        {
            
        }
        else
        {
        jTextField3.setText(combo3);
        } 
          }   
          catch(Exception e)
                  {
                      
                  }
        
        
    }//GEN-LAST:event_jComboBox3ItemStateChanged

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
            java.util.logging.Logger.getLogger(rapor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rapor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rapor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rapor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rapor().setVisible(true);
            }
        });
    }
    
     public void ara()
    {

        String ara1 = jComboBox1.getSelectedItem().toString(); 
        String ara2="";
        String ara3 = jTextField7.getText();
           if(ara1.equals("SİPARİŞ NO"))
           {
           ara2 ="sipno";
           }
          if(ara1.equals("GELEN MİKTAR"))
           {
           ara2 ="gelenmik";
           }
          if(ara1.equals("MİN"))
           {
           ara2 ="min";
           }
           if(ara1.equals("MAX"))
           {
           ara2 ="max";
           }      
           if(ara1.equals("GERÇEKLEŞEN"))
           {
           ara2 ="deger";
           }              
        if(ara1.equals("TEST KOŞUL"))
           {
           ara2 ="testkosul";
           }            
        if(ara1.equals("FİRMA"))
           {
           ara2 ="firma";
           }            
            if(ara1.equals("ÜRÜN TÜRÜ"))
           {
           ara2 ="urunturu";
           }                    
          if(ara1.equals("BÖLÜMLER"))
           {
           ara2 ="maltan";
           }                    
           if(ara1.equals("KARAR"))
           {
           ara2 ="karar";
           }
       if(ara1.equals("SERTİFİKA"))
           {
           ara2 ="sertifika";
           }
            if(ara1.equals("S.K.FORM NO"))
           {
           ara2 ="formno";
           }         
     //İRSALİYE NO
           if(ara1.equals("İRSALİYE NO"))
           {
           ara2 ="irsaliyeno";
           }    
          if(ara1.equals("KAYIT TARİHİ"))
           {
           ara2 ="fatno";
           }    
           
        DefaultTableModel tablo = (DefaultTableModel) jTable1.getModel();         
        int rows = tablo.getRowCount(); 
        for(int i = rows - 1; i >=0; i--)
        {
           tablo.removeRow(i); 
        }
       jTable1.setShowGrid(true);
   
        String sapara = jTextField1.getText();
        String lotara = jTextField2.getText();
        String urunara = jTextField3.getText();
        String formnoara = jTextField6.getText();
    
        

  
   try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:kalite.sqlite");
            st = c.createStatement();
            st2 = c.createStatement();
            
             String query = "SELECT * FROM urun2 where urunadi like '%"+ urunara +"%' and sap like '%"+ sapara +"%' and lotno like '%"+ lotara +"%' and formno like '%"+ formnoara +"%' and "+ ara2 +" like '%"+ ara3 +"%' ORDER BY id desc ";
      
        rs = st.executeQuery(query);
       
               while(rs.next())
         {
             
            String id  = rs.getString("id"); 
            String urunadi = rs.getString("urunadi"); 
            String lotno = rs.getString("lotno"); 
            String tarih  = rs.getString("tarih"); 
            String sipno  = rs.getString("sipno") ; 
            String ek4 = rs.getString("ek4"); 
            String gelenmik  = rs.getString("gelenmik"); 
            String min = rs.getString("min"); 
            String  max  = rs.getString("max"); 
            String deger  = rs.getString("deger"); 
            String testkosul  = rs.getString("testkosul"); 
            String sap  = rs.getString("sap"); 
            String firma  = rs.getString("firma"); 
            String urunturu  = rs.getString("urunturu"); 
            String maltan  = rs.getString("maltan"); 
            String karar  = rs.getString("karar"); 
            String sertifika  = rs.getString("sertifika"); 
            String formno  = rs.getString("formno"); 
            String notlar  = rs.getString("notlar"); 
            String irsaliyeno  = rs.getString("irsaliyeno"); 
                String ek ="YOK";  
           
                     String query2 = "SELECT * FROM dosya where id2 like '"+ id +"'";
      
             rs2 = st2.executeQuery(query2);
       
               while(rs2.next())
         {
         ek ="-";    
             
         }
            
            
            
          //yarım bıraktın devam et.
       tablo.addRow(new Object[] { id, formno , urunadi , lotno , tarih , sipno , gelenmik +" " + ek4 , min , max ,deger , testkosul , sap , firma ,urunturu ,maltan ,karar , sertifika ,  notlar , irsaliyeno , ek });
        // tablo.addRow(new Object[] { id, urunadi , lotno , tarih , sipno , gelenmik , min , max ,deger , testkosul , sap , firma ,urunturu ,maltan ,karar , sertifika , formno , notlar , irsaliyeno });

         
         }


       }
       catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
     JOptionPane.showMessageDialog(null , " Hatalı veya eksik giriş", "Hata", -1);
    }
        
        
        
    } 
    
    
      public void dosya2()
    {
      
        String id2 = jTextField5.getText();
     
        DefaultTableModel tablo = (DefaultTableModel) jTable2.getModel();         
        int rows = tablo.getRowCount(); 
        for(int i = rows - 1; i >=0; i--)
        {
           tablo.removeRow(i); 
        }
   
  
   try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:kalite.sqlite");
            st = c.createStatement();
            
             String query = "SELECT * FROM dosya where id2 like '"+ id2 +"' ORDER BY file asc";
      
        rs = st.executeQuery(query);
       
               while(rs.next())
         {
             
            String id  = rs.getString("id"); 
            String file12 = rs.getString("file"); 
     

        tablo.addRow(new Object[] { file12  });

         }


       }
       catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
        
        
        
    } 
      
      
      
      
      
         public void liste1()
         {
             jComboBox3.addItem("");
              try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:kalite.sqlite");
            st = c.createStatement();
            
               //String query = "SELECT * FROM urun where sap like '"+ arama +"' limit 1";
            
             String query = "SELECT DISTINCT urunadi FROM urun" ;
      
        rs = st.executeQuery(query);
       
               while(rs.next())
         {

            String firma  = rs.getString("urunadi"); 
            
            //String firmakod  = rs.getString("firmakod"); 
            jComboBox3.addItem(firma);
  
         }


       }
       catch ( Exception e ) {
     // System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    // JOptionPane.showMessageDialog(null , " Hatalı veya eksik giriş", "Hata", -1);
    }
         
         }
      
      
      
      
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
