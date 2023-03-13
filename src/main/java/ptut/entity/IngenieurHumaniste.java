package ptut.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.NonNull;

public class IngenieurHumaniste {

    @Id
    @Basic(optional = false)
    @NonNull
    @Size(min = 8, max = 8)
    @Column(nullable = false, length = 8)
    private Integer NumINU;

    @Id
    @Basic(optional = false)
    @NonNull
    @Size(min = 5)
    @Column(nullable = false)
    private int IdAction;

    @Column(nullable = false)
    private String Intitule;

    @Column(nullable = false)
    private String Description;
}
