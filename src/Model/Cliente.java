package Model;

public class Cliente {
    private String nomeDoCliente ;
    private String senhaDoCliente;

    public Cliente(String nomeDoCliente, String senhaDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
        this.senhaDoCliente = senhaDoCliente;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }



}
