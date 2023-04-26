package ma.filali.jpaspringdatatp2;

import ma.filali.jpaspringdatatp2.entities.Patient;
import ma.filali.jpaspringdatatp2.repositorise.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class JpaSpringDataTp2Application implements CommandLineRunner {
    @Autowired
//    6. Tester quelques opérations de gestion de patients :
//            - Ajouter des patients
//    - Consulter tous les patients
//    - Consulter un patient
//    - Chercher des patients
//    - Mettre à jour un patient
//    - supprimer un patient
private PatientRepository patientRepository;
    public static void main(String[] args) {


        SpringApplication.run(JpaSpringDataTp2Application.class, args);




        }

    @Override
    public void run(String... args) throws Exception{
            for(int i=0;i<100;i++)
    {
        patientRepository.save(new Patient((Long) null,"adam",new Date(),false,(int)(Math.random()*100)));
    }


 List <Patient> resultCherche=patientRepository.chercherPatients(null,null,"adam");
        resultCherche.forEach(p -> {

            System.out.println(p.getNom());
            System.out.println(p.isChoix());
            System.out.println(p.getScore());
            System.out.println(p.getDateNaissace());
            System.out.println(p.getId());
            System.out.println("--------------------------------------------------------");});
            System.out.println("-----**--ok-------**-----------ok-------------ok-------------ok-----");

//        Page<Patient> patientList=patientRepository.findAll(PageRequest.of(1,5));;

//        System.out.println("total"+patientList.getTotalPages()+" p");
//        System.out.println("total"+patientList.getTotalElements()+" elements");
//        System.out.println("page num"+patientList.getNumber()+" ");
//        List<Patient>byChoix=patientRepository.findByChoix(false);
//           byChoix.forEach(p -> {
//
//            System.out.println(p.getNom());
//            System.out.println(p.isChoix());
//            System.out.println(p.getScore());
//            System.out.println(p.getDateNaissace());
//            System.out.println(p.getId());
//            System.out.println("--------------------------------------------------------");});
     //System.out.println("-----**--ok-------**-----------ok-------------ok-------------ok-----")

//
//        patientList.forEach(p -> {
////
////            System.out.println(p.getNom());
////            System.out.println(p.isChoix());
////            System.out.println(p.getScore());
////            System.out.println(p.getDateNaissace());
////            System.out.println(p.getId());
////            System.out.println("--------------------------------------------------------");
////
//
//        });
//        Patient patient=patientRepository.findById(1L).orElse(null);
//        if(patient!=null){
//            System.out.println(patient.getNom());
//            System.out.println(patient.isChoix());
//
//        }
//
//        patient.setScore(Integer.parseInt("2001"));
//        patientRepository.save(patient);
//        patientRepository.deleteById(1L);


    }

}
