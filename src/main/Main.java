/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

// Mengimpor semua kelas dari paket javax.swing
import javax.swing.*;
// Mengimpor kelas BiodataDao dari paket dao
import dao.BiodataDao;
// Mengimpor kelas BiodataFrame dari paket biodata
import biodata.BiodataFrame;

/**
 *
 * @author lenovo
 */

// Class Main untuk menjalankan program
public class Main extends JFrame {
    private final BiodataDao biodataDao; // Variable biodataDao untuk menyimpan nilai biodataDao
    private final BiodataFrame biodataFrame; // Variable biodataFrame untuk menyimpan nilai biodataFrame

    // Constructor Main
    public Main() {
        // Set judul dari frame
        this.setTitle("Biodata");

        // Set ukuran dari frame
        this.setSize(400, 500);
        
        // Inisialisasi nilai dari biodataDao dan biodataFrame
        this.biodataDao = new BiodataDao();
        this.biodataFrame = new BiodataFrame(biodataDao);

        // Set frame agar tidak dapat di resize
        this.biodataFrame.setVisible(true);
    }

    public static void main(String[] args) {
        // Method invokeLater dari SwingUtilities untuk menjalankan objek Runnable yang
        // berguna menangani event dan update UI
        SwingUtilities.invokeLater(new Runnable() {
            // Override method run dari Runnable
            public void run() {
                // Instansiasi StudiKasus dengan nama h
                new Main();
            }
        });
    }
}
