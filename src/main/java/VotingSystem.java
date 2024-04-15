import java.util.ArrayList;
import java.util.List;

public class VotingSystem {
    private List<Voter> registeredVoters;
    private List<Candidate> registeredCandidates;
    private Election currentElection;

    public VotingSystem() {
        this.registeredVoters = new ArrayList<>();
        this.registeredCandidates = new ArrayList<>();
    }

    public void registerVoter(Voter voter) {
        registeredVoters.add(voter);
    }

    public void registerCandidate(Candidate candidate) {
        registeredCandidates.add(candidate);
    }

    public void conductElection(Election election) {
        this.currentElection = election;
    }
}
