package edu.dmacc.codedsm.Homework16;

public class PersonTaskAssigner implements TaskAssigner {

    public PersonTaskAssigner() {
        System.out.println("This is from PersonTaskAssigner.");
    }

    @Override
    public String userAndPriority(String user, int priority) {
        return "Task user is: " + user + ". Task priority is: " + priority + ".";
    }

}


