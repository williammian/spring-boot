package br.com.wm.contatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wm.contatos.model.Contato;

public interface Contatos extends JpaRepository<Contato, Long>{

}
