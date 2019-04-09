package edu.dmacc.codedsm.Homework16;

public class PhoneTaskAssigner implements TaskAssigner {

    public PhoneTaskAssigner() {
        System.out.println("This is from PhoneTaskAssigner.");
    }

    @Override
    public String userAndPriority(String user, int priority) {
        return "Task user is: " + user + ". Task priority is: " + priority + ".";
    }

}


