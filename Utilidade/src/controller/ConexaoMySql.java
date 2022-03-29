/*
*   Para mais informa��es sobre JDBC (Java Data Base Connectivity): 
*   Fonte: http://www.devmedia.com.br/aprendendo-java-com-jdbc/29116
 */
package controller;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexaoMySql {

    //Preparando as vari�veis de conex�o
    private final static String DRIVER = "org.gjt.mm.mysql.Driver"; //classe que possui todos os m�todos de acesso e manipula��o com o SGBD 
    private final static String URL = "jdbc:mysql://localhost/locadora"; //endere�o da base de dados do seu projeto, deve ser a mesma configurada l� no SGBD
    private final static String USUARIO = "root"; //usu�rio de acesso ao SGBD
    private final static String SENHA = "1234"; //senha do usu�rio acima
    /**
     * Classe-vari�vel que receber� o objeto da conex�o com o banco (possui o
     * m�todo de conex�o)
     */
    private static Connection conexao;
    /**
     * Classe-vari�vel que far� a consulta ao banco, preenchendo a
     * classe-vari�vel ResultSet, ou seja, possui os m�todos de consulta e
     * tamb�m de altera��o dos dados
     */
    public static Statement statement;
    /**
     * Classe-vari�vel que armazenar� todos os dados da consulta (possui os
     * m�todos de exibir os dados de cada coluna de cada tabela, e m�todos de
     * navegar entre todos os registros de uma tabela). Em outras palavras, a
     * vari�vel Resulset representa o conjunto de resultados do select.
     */
    public static ResultSet resultset;

    /**
     * Utilize este m�todo para abrir uma conex�o com o SGBD
     *
     * @param sql
     */
    public static boolean createConnection() {

        boolean result = true; //se acontecer algum erro retorna false

        if (conexao == null) { //somente cria uma nova conex�o, se n�o tiver conex�o j� criada
            try {
                //Procura a classe org.gjt.mm.mysql.Driver, para que, se por acaso ele n�o estiver, � lan�ado o erro ou exce��o ClassNotFoundException, antes de criar uma conex�o.
                Class.forName(DRIVER);
                //Ap�s ter certeza que existe a classe Driver (n�o ter acontecido uma exce��o), pode-se abrir uma conex�o atrav�s do m�todo getConection da classe DriverManager
                conexao = DriverManager.getConnection(URL, USUARIO, SENHA); //Cria um objeto que possui o acesso/conexao ao SGBD
                statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY); //O m�todo createStatement() - � usado para criar um objeto Statement, com este objeto, � poss�vel executar instru��es SQL ao SGBD.
                System.out.println("Conex�o com o SGBD criada com sucesso!");
            } catch (ClassNotFoundException classNotFoundException) {
                JOptionPane.showMessageDialog(null, "Classe Driver n�o localizada! "
                        + " Talvez a biblioteca JDBC para MySQL n�o esteja adicionada ao projeto.");
                result = false;
            } catch (SQLException sqlException) {
                JOptionPane.showMessageDialog(null, "N�o foi poss�vel conectar-se ao SGBD! "
                        + " Verifique se o SGBD est� parado. Se estiver, d� start no servi�o."
                        + " Talvez o usu�rio, senha ou nome da base de dados, n�o est�o corretos.");
                result = false;
            }
        }

        return result;
    }

    /**
     * Retorna a conex�o
     *
     * @return
     */
    public static Connection getConnection() {
        return conexao;
    }

    /**
     * Utilize este m�todo para fechar/encerrar a conex�o com o SGBD
     *
     * @param sql
     */
    public static boolean closeConnection() {
        boolean result = true; //se acontecer algum erro retorna false
        try {
            conexao.close();
            System.out.println("SUCCESS! Conex�o SGBD encerrada!");
        } catch (SQLException f) {
            System.out.println("ERROR! N�o foi possivel " + "Encerrar a conex�o com o SGBD: " + f);
            result = false;
        }
        return result;
    }

    /**
     * Utilize este m�todo para executar os comandos de consultas (SELECT).
     * <p>
     * O m�todo executeQuery(sql) - Executa uma instru��o SQL que retorna um
     * �nico objeto ResultSet.
     * <p>
     * A vari�vel Resulset Representa o conjunto de resultados do
     * select/executeQuery de uma tabela no banco de dados.
     * <p>
     * Al�m disso, esse objeto fornece m�todos getters referentes aos tipos de
     * dados como: getInt, getString, getDouble, getFloat, getLong entre outros.
     * Com esses m�todos s�o poss�veis recuperar valores usando, por exemplo, o
     * nome da coluna ou n�mero do �ndice.
     * <p>
     * Pelo fato do resultSet conter uma lista de valores, � necess�rio
     * percorrer os dados atrav�s do la�o while, Fonte:
     * http://www.devmedia.com.br/aprendendo-java-com-jdbc/29116
     *
     * @param sql
     */
    public static boolean selecionar(String sql) {
        boolean result = true; //se acontecer algum erro retorna false
        try {
            resultset = statement.executeQuery(sql);
        } catch (SQLException sqlException) {
            JOptionPane.showMessageDialog(null, "N�o foi poss�vel listar os registros!"
                    + " Talvez esteja ocorrendo erro de sintaxe script SQL, ou no nome da tabela.");
            result = false;
        }
        return result;
    }

    /**
     * Use este m�todo para inserir, excluir e atualizar (insert, delete,
     * update)
     *
     * @param sql
     */
    public static boolean atualizar(String sql) {
        boolean result = true; //se acontecer algum erro retorna false
        try {
            //executeUpdate - Executa uma instru��o SQL referente a um INSERT, UPDATE e DELETE. Esse m�todo retorna a quantidade de registros que s�o afetados pela execu��o do comando SQL.
            statement.executeUpdate(sql);
        } catch (SQLException sqlException) {

            if (sqlException.getErrorCode() == 1451) { //se for erro/bloqueio de chave estrangeira
                JOptionPane.showMessageDialog(null, "N�o � poss�vel executar esta a��o! "
                        + " Esse registro faz parte de outro registro em outra tabela."
                        + " Para tentar resolver exclua todos os outros registros associados com este.");
            } else {
                JOptionPane.showMessageDialog(null, "N�o � poss�vel executar esta a��o! "
                        + " Talvez exista algum problema no script SQL. Revise-o!");
            }
            result = false;
        }
        return result;
    }

}

