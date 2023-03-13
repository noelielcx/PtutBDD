package ptut.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.NonNull;

public class Promotion {

    @Id
    @Basic(optional = false)
    @NonNull
    @Size(min = 4, max = 4)
    @Column(nullable = false, length = 4)
    private String IdPromo;

    @Column(nullable = false)
    private String AnneeUniv;

}
