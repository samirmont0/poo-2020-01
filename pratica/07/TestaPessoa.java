package testapessoa;

public class TestaPessoa {

    public static void main(String[] args) {
       
       Endereco enderecop1 = new Endereco("Aulete Ferreira", "Dermat", 199, 78600000, "Em frente ao mercado Santos");
       Pessoa p1 = new Pessoa("Samir", "Munir", "Clenia", "Castanhos", "Pardo", "Preto", "Barra do Garças", "11245213200", "98823001", "0000123425", enderecop1, 73f, 1.74f);
       
        
        System.out.println(p1);
        
    }   
}
