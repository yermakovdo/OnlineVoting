import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Election {
    private List<Candidate> candidates;
    private Map<Candidate, Integer> votes;

    public Election() {
        this.candidates = new ArrayList<>();
        this.votes = new HashMap<>();
    }

    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }

    public void recordVote(Candidate candidate) {
        if (candidates.contains(candidate)) {
            votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        } else {
            System.out.println("Недействительный кандидат. Голос не регистрируется.");
        }
    }

    public void displayCandidates() {
        System.out.println("Список кандидатов:");
        for (Candidate candidate : candidates) {
            System.out.println(candidate.name);
        }
    }

    public void displayResults() {
        System.out.println("Результаты выборов:");
        for (Map.Entry<Candidate, Integer> entry : votes.entrySet()) {
            System.out.println(entry.getKey().name + ": " + entry.getValue() + " голосует.");
        }
    }
}
