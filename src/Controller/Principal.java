package Controller;

import Model.Cliente;
import com.sun.security.ntlm.Client;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Principal {
    public static void main(String[] args){
      try {
          Cliente cliente = new Cliente();
          cliente.setCod_cliente(JOptionPane.showInputDialog(null, "Entre com o codigo"));
          cliente.setNome(JOptionPane.showInputDialog(null, "Entre com o nome"));
          cliente.setEnd_rua(JOptionPane.showInputDialog(null, "Entre com o nome da rua"));
          cliente.setEnd_bairro(JOptionPane.showInputDialog(null, "Entre com o nome do bairro"));
          cliente.setEnd_cidade(JOptionPane.showInputDialog(null, "Entre com o nome da cidade"));
          cliente.setEnd_complemento(JOptionPane.showInputDialog(null, "Entre com o complemento"));
          cliente.setEnd_numero(Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o numero")));
      }catch (NumberFormatException e){
          JOptionPane.showInputDialog(null, "Ocorreu um erro","Erro",0);
          e.printStackTrace();
      }finally {
          JOptionPane.showInputDialog(null, "Fim do programa","Erro",0);
      }
    }
}
