
public class PlagiarismChecker implements PlagiarismCheckService {

    @Override
    public int check(Submission s) {
        return (s.code.contains("class") ? 12 : 40);
    }
}
