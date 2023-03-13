package ptut.dao;

import ptut.entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import ptut.entity.Etudiant;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, String> {

    Etudiant findByNom(String Nom);

    List<Etudiant> findByNomContaining(String substring);
}
