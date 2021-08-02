/*
 * Created by JFormDesigner on Wed Jul 28 09:10:49 BRT 2021
 */

package com.cursoemvideo;

import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author lucas
 */
public class CalculoIdade extends JFrame {
	public CalculoIdade() {
		initComponents();
	}

	private void btnCalcularActionPerformed(ActionEvent e) {
		// TODO add your code here
		int ano=Integer.parseInt(spAno.getValue().toString());
		int idade=2021-ano;
		lblIdade.setText(Integer.toString(idade));
	}

	private void btnSistemaActionPerformed(ActionEvent e) {
		// TODO add your code here
		int anoSistema=Integer.parseInt(lblSistema.getText());
		int ano=Integer.parseInt(spAno.getValue().toString());
		int idade=anoSistema-ano;
		lblIdade.setText(Integer.toString(idade));
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - lucas
		label1 = new JLabel();
		spAno = new JSpinner();
		btnCalcular = new JButton();
		label3 = new JLabel();
		lblSistema = new JLabel();
		btnSistema = new JButton();
		label2 = new JLabel();
		lblIdade = new JLabel();

		//======== this ========
		Container contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[fill]" +
			"[fill]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//---- label1 ----
		label1.setText("Ano de nascimento");
		contentPane.add(label1, "cell 1 1");

		//---- spAno ----
		spAno.setModel(new SpinnerNumberModel(1500, 1500, 2021, 1));
		contentPane.add(spAno, "cell 2 1,width 100::1000");

		//---- btnCalcular ----
		btnCalcular.setText("Calcular");
		btnCalcular.addActionListener(e -> {
			btnCalcularActionPerformed(e);
			btnCalcularActionPerformed(e);
		});
		contentPane.add(btnCalcular, "cell 2 2");

		//---- label3 ----
		label3.setText("Ano do sistema");
		contentPane.add(label3, "cell 1 3");

		//---- lblSistema ----
		int ano = Calendar.getInstance().get(Calendar.YEAR);
		lblSistema.setText(Integer.toString(ano));
		contentPane.add(lblSistema, "cell 2 3");

		//---- btnSistema ----
		btnSistema.setText("Calcular o sistema");
		btnSistema.addActionListener(e -> btnSistemaActionPerformed(e));
		contentPane.add(btnSistema, "cell 2 4");

		//---- label2 ----
		label2.setText("Idade");
		contentPane.add(label2, "cell 1 5");

		//---- lblIdade ----
		lblIdade.setText("0");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdade.setForeground(Color.red);
		contentPane.add(lblIdade, "cell 2 5");
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - lucas
	private JLabel label1;
	private JSpinner spAno;
	private JButton btnCalcular;
	private JLabel label3;
	private JLabel lblSistema;
	private JButton btnSistema;
	private JLabel label2;
	private JLabel lblIdade;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
	public static void main(String[] args ) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                 CalculoIdade GUI = new CalculoIdade();
                 GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 GUI.setVisible(true);
            }
        });
	}
}
