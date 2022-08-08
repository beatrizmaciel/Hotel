package br.dell.modelos;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Hospede hospede = new Hospede();

		String nomeDoHospede = JOptionPane.showInputDialog("Cadastre o nome de um novo hóspede");
		String cpfDoHospedeStr = JOptionPane.showInputDialog("Cadastre o CPF de " + nomeDoHospede);
		Long cpfDoHospede = Long.parseLong(cpfDoHospedeStr);
		String rgDoHospedeStr = JOptionPane.showInputDialog("Cadastre o RG de " + nomeDoHospede);
		Long rgDoHospede = Long.parseLong(rgDoHospedeStr);
		String idadeDoHospedeStr = JOptionPane.showInputDialog("Cadastre a idade de " + nomeDoHospede);
		int idadeDoHospede = Integer.parseInt(idadeDoHospedeStr);
		String endereçoDoHospede = JOptionPane.showInputDialog("Cadastre o endereço de " + nomeDoHospede);
		
		hospede.setNome(nomeDoHospede);
		hospede.setCPF(cpfDoHospede);
		hospede.setRG(rgDoHospede);
		hospede.setIdade(idadeDoHospede);
		hospede.setEndereço(endereçoDoHospede);
		
		JOptionPane.showMessageDialog(null, "Hóspede criado com sucesso! " +
				"Nome: " + nomeDoHospede 
				+ ". CPF: " + cpfDoHospede + 
				". RG: " + rgDoHospede + 
				". Idade: " + idadeDoHospede +
				". Endereço: " + endereçoDoHospede);
		
		int i = JOptionPane.showConfirmDialog(null, "Cadastrar quarto para hóspede?");
		if(i == JOptionPane.YES_OPTION) {
			String numeroDoQuartoStr = JOptionPane.showInputDialog("Cadastre o número do quarto: ");
			int numeroDoQuarto = Integer.parseInt(numeroDoQuartoStr);
			Quarto quarto = new Quarto(numeroDoQuarto, hospede);
		}
		else if(i == JOptionPane.NO_OPTION) {
		    System.out.println("Hóspede não tem um quarto");
		}

	}

}
