public class Voter {
    private int voterID;
    private String name;
    private Election election;

    public Voter(int voterID, String name) {
        this.voterID = voterID;
        this.name = name;
    }

    public void registerToElection(Election election) {
        this.election = election;
    }

    public void vote(Candidate candidate) {
        if (election != null) {
            election.recordVote(candidate);
        } else {
            System.out.println("Не может проголосовать. Избиратель не зарегистрирован для участия в каких либо выборах.");
        }
    }
}
