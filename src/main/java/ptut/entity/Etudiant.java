package ptut.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.NonNull;

import java.util.Date;

public class Etudiant {

    @Id
    @Basic(optional = false)
    @NonNull
    @Size(min = 8, max = 8)
    @Column(nullable = false, length = 8)
    private Integer NumINU;

    @Basic(optional = false)
    @NonNull
    @Size(max = 25)
    @Column(length = 25)
    private String Nom;

    @Basic(optional = false)
    @NonNull
    @Size(max = 25)
    @Column(length = 25)
    private String Prenom;

    @Column(nullable = false)
    private Date DateNaiss;

    @Column(nullable = false)
    private String Adresse;
}
