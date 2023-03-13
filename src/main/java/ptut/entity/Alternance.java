package ptut.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.NonNull;

public class Alternance {

    @Id
    @Basic(optional = false)
    @NonNull
    @Size(min = 8, max = 8)
    @Column(nullable = false, length = 8)
    private Integer NumINU;

    @Id
    @Basic(optional = false)
    @NonNull
    @Size(min = 4, max = 4)
    @Column(nullable = false, length = 4)
    private String IdPromo;

    @Column(nullable = false)
    private String Entreprise;

    @Column(nullable = false)
    private int DureeContrat;

    @Column(nullable = false)
    private String Ville;

    @Column(nullable = false)
    private String Pays;

    @Column(nullable = false)
    private String Langue;

    @Column(nullable = false)
    private Boolean Toeic;
}
