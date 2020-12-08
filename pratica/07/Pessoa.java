package testapessoa;

import java.util.Date;

public class Pessoa {

    private String corOlhos;
    private String corPele;
    private String corCabelo;
    private float peso;
    private float altura;
    private Date dataNascimento;
    private String localNascimento;
    private String nome;
    private String cpf;
    private String idt;
    private String passaporte;
    private String nomeMae;
    private String nomePai;
    private Endereco endereco;
    
    public Pessoa(String nome, String nomePai, String nomeMae, String corOlhos, String corPele, String corCabelo,
    String localNascimento, String cpf, String idt, String passaporte, Endereco endereco, float peso, float altura) {
        setNome(nome);
        setNomePai(nomePai);
        setNomeMae(nomeMae);
        setCpf(cpf);
        setIdt(idt);
        setPassaporte(passaporte);
        setEndereco(endereco);
        setPeso(peso);
        setAltura(altura);
        setCorCabelo(corCabelo);
        setCorOlhos(corOlhos);
        setCorPele(corPele);
        setLocalNascimento(localNascimento);
        
        
    }
       
    public String toString() {
        return "Nome: " + ((getNome() == null) ? "NF" : getNome())
               + "\nPai: " + ((getNomePai() == null) ? "NF" : getNomePai())
               + "\nMae: " + ((getNomeMae() == null) ? "NF" : getNomeMae())
               + "\nAltura: " + getAltura() + "m"
               + "\nPeso: " +  getPeso() + "kg"
               + "\nLocal de nascimento: " + ((getLocalNascimento() == null) ? "NF" : getLocalNascimento())
               + "\nCPF: " + ((getCpf() == null) ? "NF" : getCpf())
               + "\n" + ((getEndereco() == null) ? "NF" : getEndereco())
               + "\nCor dos olhos: " + ((getCorOlhos() == null) ? "NF" : getCorOlhos())
               + "\nCor da pele: " + ((getCorPele() == null) ? "NF" : getCorPele())
               + "\nCor do cabelo: " + ((getCorCabelo() == null) ? "NF" : getCorCabelo())
               + "\nPassaporte: " + ((getPassaporte() == null) ? "NF" : getPassaporte())
               + "\nRG: " + ((getIdt() == null) ? "NF" : getIdt());
            
                
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getIdt() {
        return idt;
    }

    public void setIdt(String idt) {
        this.idt = idt;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }
 

}