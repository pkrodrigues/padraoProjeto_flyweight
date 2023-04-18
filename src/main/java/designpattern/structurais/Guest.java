package designpattern.structurais;

public class Guest {
    private String name;
    private String cpf;

    public Guest(String name, String cpf){
        this.name= name;
        this.cpf =cpf;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }
}
