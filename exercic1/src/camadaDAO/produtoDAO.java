
package camadaDAO;

import camadaDTO.produtoDTO;
import javax.swing.JOptionPane;


public class produtoDAO {
public void mostrarProduto(produtoDTO pd){
    JOptionPane.showMessageDialog(null, pd.toString());
}
}
