/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actionlistener;

// Mengimpor kelas-kelas yang diperlukan dari paket java.awt.event.*
import java.awt.event.*;
// Mengimpor kelas JFrame dari paket javax.swing
import javax.swing.JFrame;
// Mengimpor kelas JOptionPane dari paket javax.swing
import javax.swing.JOptionPane;
// Mengimpor kelas BiodataFrame dari paket biodata
import biodata.BiodataFrame;

/**
 *
 * @author lenovo
 */
// Implementasi dari WindowAdapter untuk button Close
public class CloseWindowActionListener implements WindowListener {
	// Variable biodataFrame untuk menyimpan nilai dari objek biodataFrame
	private final BiodataFrame biodataFrame;

	// Constructor
	public CloseWindowActionListener(BiodataFrame biodataFrame) {
		this.biodataFrame = biodataFrame;
	}

	// Override method windowClosing dari WindowAdapter
	public void windowClosing(WindowEvent e) {
		// Variable confirmation untuk menyimpan nilai dari message dialog konfirmasi
		int confirmation = JOptionPane.showConfirmDialog(this.biodataFrame,
				"Apakah anda yakin ingin keluar aplikasi?\nSemua data yang belum disimpan, tidak akan tersimpan.",
				"Form Biodata",
				JOptionPane.YES_NO_OPTION);

		// Jika confirmation bernilai opsi yes
		if (confirmation == JOptionPane.YES_OPTION) {
			// Keluar dari aplikasi
			System.exit(0);
		} else {
			// Jika batal keluar, kembalikan frame ke kondisi semula
			this.biodataFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
	}

	/* NOTE: PROSEDUR DI BAWAH INI HARUS DITULIS KARENA MERUPAKAN IMPLEMENTASI DARI ABSTRACT CLASS */
	// Override method windowOpened dari WindowAdapter
	public void windowOpened(WindowEvent e) {
		// Tidak melakukan apa-apa
	}

	// Override method windowClosed dari WindowAdapter
	public void windowClosed(WindowEvent e) {
		// Tidak melakukan apa-apa
	}

	// Override method windowIconified dari WindowAdapter
	public void windowIconified(WindowEvent e) {
		// Tidak melakukan apa-apa
	}

	// Override method windowDeiconified dari WindowAdapter
	public void windowDeiconified(WindowEvent e) {
		// Tidak melakukan apa-apa
	}

	// Override method windowActivated dari WindowAdapter
	public void windowActivated(WindowEvent e) {
		// Tidak melakukan apa-apa
	}

	// Override method windowDeactivated dari WindowAdapter
	public void windowDeactivated(WindowEvent e) {
		// Tidak melakukan apa-apa
	}
}
