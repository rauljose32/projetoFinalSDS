package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author raul
 */
@Entity
public class Aviao implements Cadastro, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aviao_gen")
    @SequenceGenerator(name = "aviao_gen", sequenceName = "aviao_seq", initialValue = 1)
    private long id;
    
    private int qtdPassageiros;
    
    @OneToMany(mappedBy = "aviao", fetch = FetchType.EAGER)
    private List<Voo> voos;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public void setVoos(List<Voo> voos) {
        this.voos = voos;
    }
    
}
