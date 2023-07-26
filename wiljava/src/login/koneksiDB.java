/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author RPL-9
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksiDB {

    Connection koneksi = null;

    public static Connection koneksiDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi
                    = DriverManager.getConnection("jdbc:mysql://localhost/wiljava", "root", "");
            return koneksi;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
