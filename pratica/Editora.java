/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaemprestimo;

/**
 *
 * @author samir
 */
public class Editora {
    private String nome;
    private String local;

    public Editora(String nome, String local) {
        setNome(nome);
        setLocal(local);
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return getNome() + "\n" + getLocal();
    }
}

