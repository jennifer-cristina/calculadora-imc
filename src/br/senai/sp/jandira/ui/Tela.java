package br.senai.sp.jandira.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class Tela {

	public void criarTela() {
		
		JFrame minhaTela = new JFrame();
		minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhaTela.setSize(300, 400);
		minhaTela.setTitle("Calculadora do Imc");
		minhaTela.setLayout(null);
		
		JLabel lblDigitarPeso = new JLabel();
		lblDigitarPeso.setText("Insira o seu peso:");
		lblDigitarPeso.setBounds(85,20,150,30);
		
		JTextField txtInserirPeso = new JTextField();
		txtInserirPeso.setText("00");
		txtInserirPeso.setBounds(60,50,150,30);
		
		JLabel lblDigitarAltura = new JLabel();
		lblDigitarAltura.setText("Insira a sua altura:");
		lblDigitarAltura.setBounds(85,90,150,30);
		
		JTextField txtInserirAltura = new JTextField();
		txtInserirAltura.setText("1.70");
		txtInserirAltura.setBounds(60,120,150,30);
		
		JButton btnCalcular = new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setBounds(60,180,150,30);
		
		JLabel lblExibirResultado = new JLabel();
		lblExibirResultado.setText("Resultado");
		lblExibirResultado.setBounds(110,250,150,30);
		
		JLabel lblImc= new JLabel();
		lblImc.setText("");
		lblImc.setBounds(60,280,150,30);
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String strPeso = txtInserirPeso.getText();
				String strAltura = txtInserirAltura.getText();
				
				int peso = Integer.parseInt(strPeso);
				double altura = Double.parseDouble(strAltura);
				
				double imc = peso / (altura * altura);
				
				if (imc < 18.5) {
					lblImc.setText("Abaixo do Peso");
				} else if (imc >= 18.5 && imc <= 24.9) {
					lblImc.setText("Peso normal");
				} else if (imc >= 18.5 && imc <= 30) {
					lblImc.setText("Acima do Peso");
				} else {
					lblImc.setText("Está Obeso");
				}
			}
		});
		
		
		minhaTela.getContentPane().add(lblImc);
		minhaTela.getContentPane().add(lblExibirResultado);
		minhaTela.getContentPane().add(btnCalcular);
		minhaTela.getContentPane().add(txtInserirAltura);
		minhaTela.getContentPane().add(lblDigitarAltura);
		minhaTela.getContentPane().add(txtInserirPeso);
		minhaTela.getContentPane().add(lblDigitarPeso);
		
		
		
		minhaTela.setVisible(true);
	}
}
