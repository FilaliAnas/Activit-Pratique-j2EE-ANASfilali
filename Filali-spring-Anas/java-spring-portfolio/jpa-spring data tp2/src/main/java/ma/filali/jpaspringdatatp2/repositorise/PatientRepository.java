package ma.filali.jpaspringdatatp2.repositorise;

import ma.filali.jpaspringdatatp2.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
// Créer l'interface JPA Repository basée sur Spring data
public interface PatientRepository extends JpaRepository<Patient,Long> {
    public List<Patient> findByChoix(boolean m) ;

   Page <Patient> findByChoix(boolean m,Pageable pageable);
    List <Patient> findPatientByChoixAndScoreLessThan(boolean m, int score);
    List <Patient>   findPatientByChoixIsTrueAndScoreLessThan(int score);
    List <Patient>   findPatientByDateNaissaceIsBetween(Date a , Date b);

    @Query("select p from Patient p where p.dateNaissace between :x and :y or p.nom like :z ")
    List <Patient> chercherPatients(@Param("x") Date a,
                                    @Param("y") Date b,
                                    @Param("z") String nom);


}
