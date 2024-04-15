public class Candidate {
    private int candidateID;
    String name;
    private Election election;

    public Candidate(int candidateID, String name) {
        this.candidateID = candidateID;
        this.name = name;
    }

    public void registerForElection(Election election) {
        this.election = election;
        election.addCandidate(this);
    }
}
