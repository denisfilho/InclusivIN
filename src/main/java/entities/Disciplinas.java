package entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "Disciplinas")

public class Disciplinas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="ID da disciplina", nullable = false)
    private Long idDisciplina;

    @Column(name="Nome da disciplina", nullable = false)
    private String nomeDisciplina;

    @Column(name="Carga horária", nullable = false)
    private int cargaHoraria;

    @ManyToMany
    @JoinTable(name = "Disciplinas_Cursos", joinColumns = @JoinColumn(name = "ID_da_disciplina"), inverseJoinColumns = @JoinColumn(name = "ID_do_curso"))
    private List<Cursos> cursos;
}
