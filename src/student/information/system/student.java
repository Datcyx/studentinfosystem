/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.information.system;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author home
 */
public class student extends javax.swing.JFrame {

    /**
     * Creates new form student
     */
    public student() {
        initComponents();
         
                try {
            conn db = new conn();
            Statement stmt = db.getconnect();
          
           String c = login.hfn.getText();

       
          String querys = "SELECT * FROM `grades1` WHERE  fullname = '"+c+"';";
            ResultSet rs = stmt.executeQuery(querys);
         
 
            while (rs.next()) {
               // System.out.println("first name: " + rs.getString("email"));
               String mf  = rs.getString("math");
                 String sf  = rs.getString("science");
                   String ef  = rs.getString("english");
                     String tf  = rs.getString("tle");
                       String filf  = rs.getString("filifino");
                       m1.setText(mf);
                       s1.setText(sf);
                       e1.setText(ef);
                       t1.setText(tf);
                       f1.setText(filf);
                       int m1int = Integer.parseInt(mf);
                       int s1int = Integer.parseInt(sf);
                       int e1int = Integer.parseInt(ef);
                       int t1int = Integer.parseInt(tf);
                       int f1int = Integer.parseInt(filf);
                       
                       int sototal = m1int+s1int+e1int+t1int+f1int;
                       int total = sototal/5;
                       String totos = String.valueOf(total);
                       ttt.setText(totos);
                       
                          String querys1 = "SELECT * FROM `grades2` WHERE fullname = '"+c+"';";
            ResultSet rs1 = stmt.executeQuery(querys1);
                       while(rs1.next()){
                           
                                   String ms  = rs1.getString("math");
                 String ss  = rs1.getString("science");
                   String es  = rs1.getString("english");
                     String ts  = rs1.getString("tle");
                       String fils  = rs1.getString("filifino");
                       m2.setText(ms);
                       s2.setText(ss);
                       e2.setText(es);
                       t2.setText(ts);
                       f2.setText(fils);
                        int m2int = Integer.parseInt(ms);
                       int s2int = Integer.parseInt(ss);
                       int e2int = Integer.parseInt(es);
                       int t2int = Integer.parseInt(ts);
                       int f2int = Integer.parseInt(fils);
                       
                       int sototal2 = m2int+s2int+e2int+t2int+f2int;
                       int total2 = sototal2 /5;
                       String totos2 = String.valueOf(total2);
                       ttt2.setText(totos2);
                       String querys2 = "SELECT * FROM `grades3` WHERE fullname = '"+c+"';";
            ResultSet rs2 = stmt.executeQuery(querys2);
            
            while(rs2.next()){
                             String mt  = rs2.getString("math");
                 String st  = rs2.getString("science");
                   String et  = rs2.getString("english");
                     String tt  = rs2.getString("tle");
                       String filt  = rs2.getString("filifino");
                       m3.setText(mt);
                       s3.setText(st);
                       e3.setText(et);
                       t3.setText(tt);
                       f3.setText(filt);
                           int m3int = Integer.parseInt(mt);
                       int s3int = Integer.parseInt(st);
                       int e3int = Integer.parseInt(et);
                       int t3int = Integer.parseInt(tt);
                       int f3int = Integer.parseInt(filt);
                       
                       int sototal3 = m3int+s3int+e3int+t3int+f3int;
                       int total3 = sototal3 /5;
                       String totos3 = String.valueOf(total3);
                       ttt3.setText(totos3);
                       String querys3 = "SELECT * FROM `grades4` WHERE fullname = '"+c+"';";
            ResultSet rs3 = stmt.executeQuery(querys3);
             while(rs3.next()){
                   String md  = rs3.getString("math");
                 String sd  = rs3.getString("science");
                   String ed  = rs3.getString("english");
                     String td  = rs3.getString("tle");
                       String fild  = rs3.getString("filifino");
                       m4.setText(md);
                       s4.setText(sd);
                       e4.setText(ed);
                       t4.setText(td);
                       f4.setText(fild);
                           int m4int = Integer.parseInt(md);
                       int s4int = Integer.parseInt(sd);
                       int e4int = Integer.parseInt(ed);
                       int t4int = Integer.parseInt(td);
                       int f4int = Integer.parseInt(fild);
                       
                       int sototal4 = m4int+s4int+e4int+t4int+f4int;
                       int total4 = sototal4 /5;
                       String totos4 = String.valueOf(total4);
                       ttt4.setText(totos4);
                       int full = total+total2+total3+total4;
                       int fulld = full / 4;
                        String finalx = String.valueOf(fulld);
                        welco.setText("Welcome "+c);
                       tttt.setText(finalx);
                       if(fulld<75){
                           ttttt.setText("Fail");
                       }else if(fulld > 75){
                           ttttt.setText("Passed");
                       }
                        String querys4 = "SELECT * FROM `notes` WHERE fullname = '"+c+"';";
            ResultSet rs4 = stmt.executeQuery(querys4);
             while(rs4.next()){
                  String txt  = rs4.getString("note");
                  String teacher  = rs4.getString("teacher");
                  textArea1.setText("\n"+txt+"\n by "+teacher);
             
             }
                      
             }
            
                       
            }
            
            }
                       
               
                       
                     
                             



             
            }
            
            
            
           
           
            
            
            
        } catch (SQLException ex) {
            System.out.println("");
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

        jPanel1 = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tttt = new javax.swing.JLabel();
        m1 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        e1 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        f1 = new javax.swing.JLabel();
        m2 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        f2 = new javax.swing.JLabel();
        m3 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        f3 = new javax.swing.JLabel();
        m4 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        e4 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        f4 = new javax.swing.JLabel();
        ttt = new javax.swing.JLabel();
        ttt2 = new javax.swing.JLabel();
        ttt3 = new javax.swing.JLabel();
        ttt4 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ttttt = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        textArea1 = new java.awt.TextArea();
        jLabel6 = new javax.swing.JLabel();
        welco = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jSeparator8.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jSeparator8);
        jSeparator8.setBounds(0, 220, 410, 70);

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator10);
        jSeparator10.setBounds(-21, 0, 420, 10);

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator9);
        jSeparator9.setBounds(0, 0, 20, 220);

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator11);
        jSeparator11.setBounds(100, 0, 2, 220);

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator12);
        jSeparator12.setBounds(130, 0, 10, 220);

        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator13);
        jSeparator13.setBounds(170, 0, 10, 220);

        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator14.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator14);
        jSeparator14.setBounds(210, 0, 10, 220);

        jLabel1.setText("1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 10, 34, 14);

        jLabel2.setText("2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 10, 20, 14);

        jLabel3.setText("3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(180, 10, 34, 14);

        jLabel4.setText("4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(230, 10, 30, 14);

        jLabel5.setText("Subjects");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 10, 50, 14);

        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator16);
        jSeparator16.setBounds(0, 32, 260, 0);

        jLabel8.setText("Math");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 40, 40, 14);

        jLabel9.setText("Science");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 60, 60, 14);

        jLabel10.setText("English");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 80, 60, 14);

        jLabel11.setText("TLE");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 100, 40, 14);

        jLabel12.setText("Filifino");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 120, 60, 14);

        tttt.setText("0");
        jPanel1.add(tttt);
        tttt.setBounds(230, 180, 40, 14);

        m1.setText("0");
        jPanel1.add(m1);
        m1.setBounds(110, 40, 40, 14);

        s1.setText("0");
        jPanel1.add(s1);
        s1.setBounds(110, 60, 40, 14);

        e1.setText("0");
        jPanel1.add(e1);
        e1.setBounds(110, 80, 40, 14);

        t1.setText("0");
        jPanel1.add(t1);
        t1.setBounds(110, 100, 40, 14);

        f1.setText("0");
        jPanel1.add(f1);
        f1.setBounds(110, 120, 40, 14);

        m2.setText("0");
        jPanel1.add(m2);
        m2.setBounds(150, 40, 40, 14);

        s2.setText("0");
        jPanel1.add(s2);
        s2.setBounds(150, 60, 40, 10);

        e2.setText("0");
        jPanel1.add(e2);
        e2.setBounds(150, 80, 40, 14);

        t2.setText("0");
        jPanel1.add(t2);
        t2.setBounds(150, 100, 40, 14);

        f2.setText("0");
        jPanel1.add(f2);
        f2.setBounds(150, 120, 40, 14);

        m3.setText("0");
        jPanel1.add(m3);
        m3.setBounds(180, 40, 40, 14);

        s3.setText("0");
        jPanel1.add(s3);
        s3.setBounds(180, 60, 40, 14);

        e3.setText("0");
        jPanel1.add(e3);
        e3.setBounds(180, 80, 40, 14);

        t3.setText("0");
        jPanel1.add(t3);
        t3.setBounds(180, 100, 40, 14);

        f3.setText("0");
        jPanel1.add(f3);
        f3.setBounds(180, 120, 40, 14);

        m4.setText("0");
        jPanel1.add(m4);
        m4.setBounds(230, 40, 40, 14);

        s4.setText("0");
        jPanel1.add(s4);
        s4.setBounds(230, 60, 40, 14);

        e4.setText("0");
        jPanel1.add(e4);
        e4.setBounds(230, 80, 40, 14);

        t4.setText("0");
        jPanel1.add(t4);
        t4.setBounds(230, 100, 40, 14);

        f4.setText("0");
        jPanel1.add(f4);
        f4.setBounds(230, 120, 40, 14);

        ttt.setText("0");
        jPanel1.add(ttt);
        ttt.setBounds(110, 150, 40, 14);

        ttt2.setText("0");
        jPanel1.add(ttt2);
        ttt2.setBounds(150, 150, 40, 14);

        ttt3.setText("0");
        jPanel1.add(ttt3);
        ttt3.setBounds(180, 150, 40, 14);

        ttt4.setText("0");
        jPanel1.add(ttt4);
        ttt4.setBounds(230, 150, 40, 14);

        jLabel39.setText("Total");
        jPanel1.add(jLabel39);
        jLabel39.setBounds(30, 150, 70, 14);

        jLabel13.setText("Remarks");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 200, 60, 14);

        ttttt.setText("Passed");
        jPanel1.add(ttttt);
        ttttt.setBounds(220, 200, 50, 14);

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("MEMOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textArea1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(280, 0, 120, 220);

        welco.setText("Welcome User");

        jLabel7.setText("Report Card");

        jButton2.setText("Refresh ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Log out");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welco, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(29, 29, 29)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(welco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
                try {
            conn db = new conn();
            Statement stmt = db.getconnect();
          
           String c = login.hfn.getText();

       
          String querys = "SELECT * FROM `grades1` WHERE  fullname = '"+c+"';";
            ResultSet rs = stmt.executeQuery(querys);
         
 
            while (rs.next()) {
               // System.out.println("first name: " + rs.getString("email"));
               String mf  = rs.getString("math");
                 String sf  = rs.getString("science");
                   String ef  = rs.getString("english");
                     String tf  = rs.getString("tle");
                       String filf  = rs.getString("filifino");
                       m1.setText(mf);
                       s1.setText(sf);
                       e1.setText(ef);
                       t1.setText(tf);
                       f1.setText(filf);
                       int m1int = Integer.parseInt(mf);
                       int s1int = Integer.parseInt(sf);
                       int e1int = Integer.parseInt(ef);
                       int t1int = Integer.parseInt(tf);
                       int f1int = Integer.parseInt(filf);
                       
                       int sototal = m1int+s1int+e1int+t1int+f1int;
                       int total = sototal/5;
                       String totos = String.valueOf(total);
                       ttt.setText(totos);
                       
                          String querys1 = "SELECT * FROM `grades2` WHERE fullname = '"+c+"';";
            ResultSet rs1 = stmt.executeQuery(querys1);
                       while(rs1.next()){
                           
                                   String ms  = rs1.getString("math");
                 String ss  = rs1.getString("science");
                   String es  = rs1.getString("english");
                     String ts  = rs1.getString("tle");
                       String fils  = rs1.getString("filifino");
                       m2.setText(ms);
                       s2.setText(ss);
                       e2.setText(es);
                       t2.setText(ts);
                       f2.setText(fils);
                        int m2int = Integer.parseInt(ms);
                       int s2int = Integer.parseInt(ss);
                       int e2int = Integer.parseInt(es);
                       int t2int = Integer.parseInt(ts);
                       int f2int = Integer.parseInt(fils);
                       
                       int sototal2 = m2int+s2int+e2int+t2int+f2int;
                       int total2 = sototal2 /5;
                       String totos2 = String.valueOf(total2);
                       ttt2.setText(totos2);
                       String querys2 = "SELECT * FROM `grades3` WHERE fullname = '"+c+"';";
            ResultSet rs2 = stmt.executeQuery(querys2);
            
            while(rs2.next()){
                             String mt  = rs2.getString("math");
                 String st  = rs2.getString("science");
                   String et  = rs2.getString("english");
                     String tt  = rs2.getString("tle");
                       String filt  = rs2.getString("filifino");
                       m3.setText(mt);
                       s3.setText(st);
                       e3.setText(et);
                       t3.setText(tt);
                       f3.setText(filt);
                           int m3int = Integer.parseInt(mt);
                       int s3int = Integer.parseInt(st);
                       int e3int = Integer.parseInt(et);
                       int t3int = Integer.parseInt(tt);
                       int f3int = Integer.parseInt(filt);
                       
                       int sototal3 = m3int+s3int+e3int+t3int+f3int;
                       int total3 = sototal3 /5;
                       String totos3 = String.valueOf(total3);
                       ttt3.setText(totos3);
                       String querys3 = "SELECT * FROM `grades4` WHERE fullname = '"+c+"';";
            ResultSet rs3 = stmt.executeQuery(querys3);
             while(rs3.next()){
                   String md  = rs3.getString("math");
                 String sd  = rs3.getString("science");
                   String ed  = rs3.getString("english");
                     String td  = rs3.getString("tle");
                       String fild  = rs3.getString("filifino");
                       m4.setText(md);
                       s4.setText(sd);
                       e4.setText(ed);
                       t4.setText(td);
                       f4.setText(fild);
                           int m4int = Integer.parseInt(md);
                       int s4int = Integer.parseInt(sd);
                       int e4int = Integer.parseInt(ed);
                       int t4int = Integer.parseInt(td);
                       int f4int = Integer.parseInt(fild);
                       
                       int sototal4 = m4int+s4int+e4int+t4int+f4int;
                       int total4 = sototal4 /5;
                       String totos4 = String.valueOf(total4);
                       ttt4.setText(totos4);
                       int full = total+total2+total3+total4;
                       int fulld = full / 4;
                        String finalx = String.valueOf(fulld);
                       tttt.setText(finalx);
                       if(fulld<75){
                           ttttt.setText("Fail");
                       }else if(fulld > 75){
                           ttttt.setText("Passed");
                       }
                          String querys4 = "SELECT * FROM `notes` WHERE fullname = '"+c+"';";
            ResultSet rs4 = stmt.executeQuery(querys4);
             while(rs4.next()){
                  String txt  = rs2.getString("note");
                  String teacher  = rs2.getString("teacher");
                  textArea1.setText("\n"+txt);
             
             }
                      
             }
            
                       
            }
            
            }
                       
               
                       
                     
                             



             
            }
            
            
            
           
           
            
            
            
        } catch (SQLException ex) {
            System.out.println("");
        }     
  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
         this.setVisible(false);
       login xx= new login();
         login.invokersession.setText("false");
         xx.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    
               new student().setVisible(true);
            
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel e1;
    public static javax.swing.JLabel e2;
    private static javax.swing.JLabel e3;
    public static javax.swing.JLabel e4;
    public static javax.swing.JLabel f1;
    public static javax.swing.JLabel f2;
    public static javax.swing.JLabel f3;
    public static javax.swing.JLabel f4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    public static javax.swing.JLabel m1;
    public static javax.swing.JLabel m2;
    public static javax.swing.JLabel m3;
    public static javax.swing.JLabel m4;
    public static javax.swing.JLabel s1;
    public static javax.swing.JLabel s2;
    public static javax.swing.JLabel s3;
    public static javax.swing.JLabel s4;
    public static javax.swing.JLabel t1;
    public static javax.swing.JLabel t2;
    public static javax.swing.JLabel t3;
    public static javax.swing.JLabel t4;
    private java.awt.TextArea textArea1;
    public static javax.swing.JLabel ttt;
    public static javax.swing.JLabel ttt2;
    public static javax.swing.JLabel ttt3;
    public static javax.swing.JLabel ttt4;
    public static javax.swing.JLabel tttt;
    private javax.swing.JLabel ttttt;
    public static javax.swing.JLabel welco;
    // End of variables declaration//GEN-END:variables
}
