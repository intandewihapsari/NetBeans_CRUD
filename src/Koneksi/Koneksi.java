
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import Koneksi.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Koneksi {
    public static Connection con;
    public static Statement stm;

    
    public void koneksi(){
        try {
            String url ="jdbc:mysql://localhost/absen_01_19";
            String user="root";
            String pass="";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("Koneksi berhasil");
        } catch (Exception e) {
            System.out.println("koneksi gagal " +e.getMessage());
        }
    }
}
   
