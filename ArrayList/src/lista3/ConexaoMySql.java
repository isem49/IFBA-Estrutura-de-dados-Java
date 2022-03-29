/*
*   Para mais informações sobre JDBC (Java Data Base Connectivity): 
*   Fonte: http://www.devmedia.com.br/aprendendo-java-com-jdbc/29116
 */
package controller;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexaoMySql {

    //Preparando as variáveis de conexão
    private final static String DRIVER = "org.gjt.mm.mysql.Driver"; //classe que possui todos os métodos de acesso e manipulação com o SGBD 
    private final static String URL = "jdbc:mysql://127.0.0.1/locadora_eliomar_db"; //endereço da base de dados do seu projeto, deve ser a mesma configurada lá no SGBD
    private final static String USUARIO = "root"; //usuário de acesso ao SGBD
    private final static String SENHA = "123"; //senha do usuário acima
    /**
     * Classe-variável que receberá o objeto da conexão com o banco (possui o
     * método de conexão)
     */
    private static Connection conexao;
    /**
     * Classe-variável que fará a consulta ao banco, preenchendo a
     * classe-variável ResultSet, ou seja, possui os métodos de consulta e
     * também de alteração dos dados
     */
    public static Statement statement;
    /**
     * Classe-variável que armazenará todos os dados da consulta (possui os
     * métodos de exibir os dados de cada coluna de cada tabela, e métodos de
     * navegar entre todos os registros de uma tabela). Em outras palavras, a
     * variável Resulset representa o conjunto de resultados do select.
     */
    public static ResultSet resultset;

    /**
     * Utilize este método para abrir uma conexão com o SGBD
     *
     * @param sql
     */
    public static boolean createConnection() {

        boolean result = true; //se acontecer algum erro retorna false

        if (conexao == null) { //somente cria uma nova conexão, se não tiver conexão já criada
            try {
                //Procura a classe org.gjt.mm.mysql.Driver, para que, se por acaso ele não estiver, é lançado o erro ou exceção ClassNotFoundException, antes de criar uma conexão.
                Class.forName(DRIVER);
                //Após ter certeza que existe a classe Driver (não ter acontecido uma exceção), pode-se abrir uma conexão através do método getConection da classe DriverManager
                conexao = DriverManager.getConnection(URL, USUARIO, SENHA); //Cria um objeto que possui o acesso/conexao ao SGBD
                statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY); //O método createStatement() - É usado para criar um objeto Statement, com este objeto, é possível executar instruções SQL ao SGBD.
                System.out.println("Conexão com o SGBD criada com sucesso!");
            } catch (ClassNotFoundException classNotFoundException) {
                JOptionPane.showMessageDialog(null, "Classe Driver não localizada! "
                        + " Talvez a biblioteca JDBC para MySQL não esteja adicionada ao projeto.");
                result = false;
            } catch (SQLException sqlException) {
                JOptionPane.showMessageDialog(null, "Não foi possível conectar-se ao SGBD! "
                        + " Verifique se o SGBD está parado. Se estiver, dê start no serviço."
                        + " Talvez o usuário, senha ou nome da base de dados, não estão corretos.");
                result = false;
            }
        }

        return result;
    }

    /**
     * Retorna a conexão
     *
     * @return
     */
    public static Connection getConnection() {
        return conexao;
    }

    /**
     * Utilize este método para fechar/encerrar a conexão com o SGBD
     *
     * @param sql
     */
    public static boolean closeConnection() {
        boolean result = true; //se acontecer algum erro retorna false
        try {
            conexao.close();
            System.out.println("SUCCESS! Conexão SGBD encerrada!");
        } catch (SQLException f) {
            System.out.println("ERROR! Não foi possivel " + "Encerrar a conexão com o SGBD: " + f);
            result = false;
        }
        return result;
    }

    /**
     * Utilize este método para executar os comandos de consultas (SELECT).
     * <p>
     * O método executeQuery(sql) - Executa uma instrução SQL que retorna um
     * único objeto ResultSet.
     * <p>
     * A variável Resulset Representa o conjunto de resultados do
     * select/executeQuery de uma tabela no banco de dados.
     * <p>
     * Além disso, esse objeto fornece métodos getters referentes aos tipos de
     * dados como: getInt, getString, getDouble, getFloat, getLong entre outros.
     * Com esses métodos são possíveis recuperar valores usando, por exemplo, o
     * nome da coluna ou número do índice.
     * <p>
     * Pelo fato do resultSet conter uma lista de valores, é necessário
     * percorrer os dados através do laço while, Fonte:
     * http://www.devmedia.com.br/aprendendo-java-com-jdbc/29116
     *
     * @param sql
     */
    public static boolean selecionar(String sql) {
        boolean result = true; //se acontecer algum erro retorna false
        try {
            resultset = statement.executeQuery(sql);
        } catch (SQLException sqlException) {
            JOptionPane.showMessageDialog(null, "Não foi possível listar os registros!"
                    + " Talvez esteja ocorrendo erro de sintaxe script SQL, ou no nome da tabela.");
            result = false;
        }
        return result;
    }

    /**
     * Use este método para inserir, excluir e atualizar (insert, delete,
     * update)
     *
     * @param sql
     */
    public static boolean atualizar(String sql) {
        boolean result = true; //se acontecer algum erro retorna false
        try {
            //executeUpdate - Executa uma instrução SQL referente a um INSERT, UPDATE e DELETE. Esse método retorna a quantidade de registros que são afetados pela execução do comando SQL.
            statement.executeUpdate(sql);
        } catch (SQLException sqlException) {

            if (sqlException.getErrorCode() == 1451) { //se for erro/bloqueio de chave estrangeira
                JOptionPane.showMessageDialog(null, "Não é possível executar esta ação! "
                        + " Esse registro faz parte de outro registro em outra tabela."
                        + " Para tentar resolver exclua todos os outros registros associados com este.");
            } else {
                JOptionPane.showMessageDialog(null, "Não é possível executar esta ação! "
                        + " Talvez exista algum problema no script SQL. Revise-o!");
            }
            result = false;
        }
        return result;
    }

}
