import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Aplicativo{
    public static void main(String[] args) {
        ArrayList<Restaurante>restaurantes = new ArrayList<>();
        int opcaoUser = Integer.parseInt(JOptionPane.showInputDialog(null, "[1] - Cadastrar Restaurante\n[2] - Cadastrar Lanche\n[3] - Cadastrar Usuário\n[4] - Fazer Pedido\n[5] - Sair\n Escolha uma opção: "));


        switch (opcaoUser){
            case 1:
                Restaurante res = new Restaurante();
                String nomeRestaurante = JOptionPane.showInputDialog(null,"Insira o nome do restaurante");
                String CNPJ = JOptionPane.showInputDialog(null, "Insira o CNPJ");
                String x = JOptionPane.showInputDialog(null, "Insira a rua e o número");
                String y = JOptionPane.showInputDialog(null, "Insira o bairro");
                restaurantes.add(new Restaurante(nomeRestaurante, CNPJ, x, y));

            case 2:
        }
    }
}
