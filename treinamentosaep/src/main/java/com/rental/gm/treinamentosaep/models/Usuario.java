package com.rental.gm.treinamentosaep.models;

@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="usuario_id")
    private Integer usuarioId;

    @Column(name="nome_completo")
    private String nomeCompleto;

    @Column(name="cpf")
    private String cpf;

    @Column(name="email")
    private String email;

    @Column(name="senha")
    private String senha;

    @Column(name="tipo_usuario")
    private String tipoUsuario;

    @Column(name="codigo_verif_func")
    private Integer codigoVerifFunc;

    public Usuario () {}

    
    

}
