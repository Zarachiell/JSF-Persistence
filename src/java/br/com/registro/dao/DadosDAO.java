package br.com.registro.dao;

import br.com.registro.entidade.Registros;
import br.com.registro.entidade.Registros;
import br.com.registro.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

public class DadosDAO {

    public void salvar(Registros registros) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        sessao.persist(registros);
        sessao.getTransaction().commit();

        sessao.close();
    }
    
    public void deletar(int id){
        
        int dadoId = id;
        
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        Registros aux = (Registros) sessao.get(Registros.class, id);
        sessao.delete(aux);
        sessao.getTransaction().commit();

        sessao.close();
    }

    public List<Registros> listar() {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        List<Registros> lista = sessao.getNamedQuery("Registros.findAll").list();
        sessao.close();
        
        return lista;
    }
}
