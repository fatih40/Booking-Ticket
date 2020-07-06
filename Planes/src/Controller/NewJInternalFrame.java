/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.mysql.jdbc.PreparedStatement;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author baser
 */

        
public class NewJInternalFrame extends  javax.swing.JInternalFrame {
Connection con=null;
static String city;
static String arrivalCity;
static String airWays;
static String price;
static String departureTime;
static String depatureDate;
static String arr[] = new String[10];

/**
     * Creates new form NewJInternalFrame
     */
    public NewJInternalFrame() {
        initComponents();
        planeSourceCBFFillData();
        planedestianotionCBFFillData();
    }
    public void planeSourceCBFFillData(){
        try {
             Class.forName("com.mysql.jdbc.Driver");
            String databaseURL="jdbc:mysql://localhost:3306/ucak_bileti";
            con=(Connection) DriverManager.getConnection(databaseURL,"root","");
            
            Statement stat = con.createStatement();
            
            String selectQuery="select plane_source from plane_details";
            ResultSet rs=stat.executeQuery(selectQuery);
           while(rs.next()){
               ComboBoxSource.addItem(rs.getString("plane_source"));
           }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
         public void planedestianotionCBFFillData(){
        try {
             Class.forName("com.mysql.jdbc.Driver");
            String databaseURL="jdbc:mysql://localhost:3306/ucak_bileti";
            con=(Connection) DriverManager.getConnection(databaseURL,"root","");
            
            Statement stat = con.createStatement();
            
            String selectQuery="select plane_dest from plane_details";
            ResultSet rs=stat.executeQuery(selectQuery);
           while(rs.next()){
               ComboBoxDestianation.addItem(rs.getString("plane_dest"));
           }
        } catch (Exception e) {
            System.out.println(e);
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

        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComboBoxSource = new javax.swing.JComboBox<>();
        ComboBoxDestianation = new javax.swing.JComboBox<>();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(750, 550));

        jLabel1.setText("Source :");

        jLabel2.setText("Destianation:");

        jLabel3.setText("Data:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airways", "Departure", "Destination", "Date", "Time", "Price"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Search");
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
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboBoxSource, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel2))
                            .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxDestianation, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(ComboBoxSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxDestianation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       String source=(String)ComboBoxSource.getSelectedItem();
        String destination=(String)ComboBoxDestianation.getSelectedItem();
        java.util.Date fromDate=jXDatePicker2.getDate();
       
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String fromDateFormated=sdf.format(fromDate);
        
        
      
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String databaseURL = "jdbc:mysql://localhost:3306/ucak_bileti";
            Connection con = DriverManager.getConnection(databaseURL, "root", "");
            Statement stat = con.createStatement();    
            String selectQuery = "select *  from plane_details where plane_source='"+source+"' and plane_dest='"+destination+"' and depart_date ='"+fromDateFormated+"' ";
            ResultSet rs=stat.executeQuery(selectQuery);
         
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
           
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
     

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        for(int i=0;i<9;i++){
            arr[i]=jTable1.getModel().getValueAt(row,i).toString(); 
        }
       
        System.out.println(city);
        BiletDetayi a=new BiletDetayi();
        a.show();

        
    }//GEN-LAST:event_jTable1MousePressed

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        NewJInternalFrame.city = city;
    }

    public static String getArrivalCity() {
        return arrivalCity;
    }

    public static void setArrivalCity(String arrivalCity) {
        NewJInternalFrame.arrivalCity = arrivalCity;
    }

    public static String getAirWays() {
        return airWays;
    }

    public static void setAirWays(String airWays) {
        NewJInternalFrame.airWays = airWays;
    }

    public static String getPrice() {
        return price;
    }

    public static void setPrice(String price) {
        NewJInternalFrame.price = price;
    }

    public static String getDepartureTime() {
        return departureTime;
    }

    public static void setDepartureTime(String departureTime) {
        NewJInternalFrame.departureTime = departureTime;
    }

    public static String getDepatureDate() {
        return depatureDate;
    }

    public static void setDepatureDate(String depatureDate) {
        NewJInternalFrame.depatureDate = depatureDate;
    }

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxDestianation;
    private javax.swing.JComboBox<String> ComboBoxSource;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    // End of variables declaration//GEN-END:variables
}