package testapessoa;

public class Endereco {
    private String rua;
    private String setor;
    private int numero;
    private int CEP;
    private String complemento;

    public Endereco(String rua, String setor, int numero, int CEP, String complemento) {
        super();
        setRua(rua);
        setSetor(setor);
        setNumero(numero);
        setCEP(CEP);
        setComplemento(complemento);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

public String toString() {
        return "Rua: " +getRua() + "\n" + "Bairro: " + getSetor().toString() + "\n"
               + "Numero: " + getNumero() + "\nCEP: " + getCEP() + "\n"
               + getComplemento();
    }
}
