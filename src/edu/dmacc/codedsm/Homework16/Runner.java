package edu.dmacc.codedsm.Homework16;

public class Runner {

    public static void main(String[] args) {

        System.out.println("Starting runner...");
        EmailTaskAssigner emailTaskAssigner = new EmailTaskAssigner();
        PhoneTaskAssigner phoneTaskAssigner = new PhoneTaskAssigner();
        PersonTaskAssigner personTaskAssigner = new PersonTaskAssigner();

        TaskAssigner taskAssigner = new TaskAssigner();
        System.out.println(emailTaskAssigner.assignTask("John", 1));

    }
}
