import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Teste2 {
    static Connection conexao = null;
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        int idPessoa;
        String nome, email;
        float peso;
        System.out.println("Digite os dados da Pessoa");
        System.out.println("Digite o ID");
        idPessoa = ler.nextInt();
        System.out.println("Digite o Nome");
        nome = ler.next();
        System.out.println("Digite o Email");
        email = ler.next();
        System.out.println("Digite o Peso");
        peso = ler.nextFloat();

        Pessoa p = new Pessoa(idPessoa,nome,email,peso);

        inserirPessoa(p);

    }

    private static void inserirPessoa(Pessoa plida) throws SQLException, ClassNotFoundException {
        conexao = ConexaoBD.getInstance();
        String sql = "insert into pessoa (idPessoa, nome, email, peso) values (?,?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, plida.getId());
        stmt.setString(2, plida.getNome());
        stmt.setString(3, plida.getEmail());
        stmt.setFloat(4, plida.getPeso());
        stmt.execute();
        stmt.close();
    }
}