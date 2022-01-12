package academy.devdojo.maratonajava.javacore.Xserializacao.dominio;

import java.io.Serial;
import java.io.Serializable;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = 6153167097855106255L;
    private long id;
    private String nome;
    private transient String password;
    private static final String NOME_ESCOLA = "DevDojo Virado no Jiraya";
    private transient Turma turma;
    private Turma Turma;

    public Aluno(long id, String nome, String password){
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", NOME_ESCOLA'" + NOME_ESCOLA + '\'' +
                ", Turma'" + Turma + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
