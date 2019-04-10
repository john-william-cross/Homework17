package edu.dmacc.codedsm.Homework16;

import java.util.List;

public class Runner {

    public static void main(String[] args)  {

        System.out.println("Starting runner...");

        /*PersonTaskAssigner personTaskAssigner = new PersonTaskAssigner();
        EmailTaskAssigner emailTaskAssigner = new EmailTaskAssigner();
        PhoneTaskAssigner phoneTaskAssigner = new PhoneTaskAssigner();

        System.out.println(personTaskAssigner.userAndPriority("John", 1));
        System.out.println(emailTaskAssigner.userAndPriority("Katelin", 3));
        System.out.println(personTaskAssigner.userAndPriority("Frankie", 2));*/


        PersonTaskPerformer personTaskPerformer = new PersonTaskPerformer();
        OfficeTaskPerformer officeTaskPerformer = new OfficeTaskPerformer();
        TraineeTaskPerformer traineeTaskPerformer = new TraineeTaskPerformer();

    }
}
