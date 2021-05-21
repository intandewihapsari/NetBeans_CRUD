/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import static Koneksi.Koneksi.con;
import static Koneksi.Koneksi.stm;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HP
 */
public class Koneksi_Absen {
    public static Connection getConnection() {
        Connection conn = null;
        String url ="jdbc:mysql://localhost/absen_01_19";
        String user="root";
        String pass="";
            
        try {
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi berhasil");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

    public static void main(String[] args) {
        try {
            Connection c = Koneksi_Absen.getConnection();
            System.out.println(String.format("Connected to database %s " + "successfully.", c.getCatalog()));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

