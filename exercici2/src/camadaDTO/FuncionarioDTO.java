
package camadaDTO;


public class FuncionarioDTO {
      private String nome;
    private String cargo;
    private double salario;

    // Construtor
    public FuncionarioDTO() {   
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Cargo: " + cargo + ", Salário: " + salario;
    }
}

