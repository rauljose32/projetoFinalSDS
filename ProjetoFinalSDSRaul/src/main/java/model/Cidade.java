package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author raul
 */
@Entity
public class Cidade implements Cadastro, Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    @OneToMany(mappedBy = "cidadeOrigem")
    private List<Voo> voosPartindo;
    
    @OneToMany(mappedBy = "cidadeDestino")
    private List<Voo> voosChegando;
    
    @ManyToOne
    private Estado estado;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setVoosPartindo(List<Voo> voosPartindo) {
        this.voosPartindo = voosPartindo;
    }

    public void setVoosChegando(List<Voo> voosChegando) {
        this.voosChegando = voosChegando;
    }

}
