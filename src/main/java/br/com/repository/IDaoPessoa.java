package br.com.repository;

import br.com.entidades.Pessoa;
import java.util.List;

import javax.faces.model.SelectItem;

public interface IDaoPessoa {
	Pessoa consultarUsuario(String login, String senha);
	
	List<SelectItem> listaEstados();
}
