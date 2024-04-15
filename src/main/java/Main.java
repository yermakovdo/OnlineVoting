public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        Election election = new Election();

        Voter voter1 = new Voter(1, "Вова");
        Voter voter2 = new Voter(2, "Петя");
        votingSystem.registerVoter(voter1);
        votingSystem.registerVoter(voter2);

        Candidate candidate1 = new Candidate(101, "Кандидат А");
        Candidate candidate2 = new Candidate(102, "Кандидат Б");
        votingSystem.registerCandidate(candidate1);
        votingSystem.registerCandidate(candidate2);

        votingSystem.conductElection(election);

        voter1.registerToElection(election);
        voter2.registerToElection(election);

        voter1.vote(candidate1);
        voter2.vote(candidate2);

        election.displayResults();
    }
}
