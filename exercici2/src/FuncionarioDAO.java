import camadaDTO.FuncionarioDTO;
 import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {
    private List<FuncionarioDTO> funcionarios;

    // Construtor
    public FuncionarioDAO() {
        this.funcionarios = new ArrayList<>();
    }

    // Método para adicionar um funcionário
    public void adicionarFuncionario(FuncionarioDTO funcionario) {
        funcionarios.add(funcionario);
    }

    // Método para listar todos os funcionários
    public List<FuncionarioDTO> listarFuncionarios() {
        return funcionarios;
    }
}

