
import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Restaurante{
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public ArrayList<Lanche> getLanches() {
        return lanches;
    }

    public void setLanches(ArrayList<Lanche> lanches) {
        this.lanches = lanches;
    }

    private String nome;
    private String CNPJ;
    private String x;
    private String y;
    private ArrayList<Lanche>lanches = new ArrayList<>();

    public Restaurante(String nome, String CNPJ, String x, String y) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.x = x;
        this.y = y;
    }

    public Restaurante(){

    }

    public void addLanche(String nomeLanche, double precoLanche){

        lanches.add(new Lanche(nomeLanche, precoLanche));
    }

    public void imprimirCardapio(){

    }

    public void newUsuario(){

    }

}
