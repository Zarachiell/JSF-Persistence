/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.registro.bean;

import br.com.registro.dao.DadosDAO;
import br.com.registro.entidade.Registros;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author joaov
 */
@ManagedBean
@RequestScoped
public class RegistroMB {
    
    
    
    private Registros registro;
    private List<Registros> lista;

    public Registros getRegistro() {
        return registro;
    }

    public void setRegistro(Registros registro) {
        this.registro = registro;
    }

    public List<Registros> getLista() {
        return lista;
    }

    public void setLista(List<Registros> lista) {
        this.lista = lista;
    }

    public RegistroMB() {
    }
    
    
    public void salvar(){
        DadosDAO dao = new DadosDAO();
        dao.salvar(registro);
        
        lista = dao.listar();
        
    }
    
    public void deletar(int id){
        DadosDAO dao = new DadosDAO();
        dao.deletar(id);
        
        lista = dao.listar();
    }
    
    @PostConstruct
    public void inicializar(){
        DadosDAO dao = new DadosDAO();
        lista = dao.listar();
        
        registro = new Registros();
    }
    
}
