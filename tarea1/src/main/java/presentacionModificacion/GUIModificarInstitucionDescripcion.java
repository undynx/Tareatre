package presentacionModificacion;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class GUIModificarInstitucionDescripcion extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIModificarInstitucionDescripcion frame = new GUIModificarInstitucionDescripcion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIModificarInstitucionDescripcion() {
		setBounds(100, 100, 450, 300);

	}

}
