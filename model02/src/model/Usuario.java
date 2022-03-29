package model;

import java.sql.Date;
import java.util.ArrayList;

public class Usuario {

	private int id;

	private ArrayList<Usuario> seguidores;

	private ArrayList<Usuario> seguindo;

	private String nome;

	private String email;

	private Date dataNascimento;

	private String website;

	private String genero;

	private String telefone;

	private Foto uriFotoPerfil;

}
