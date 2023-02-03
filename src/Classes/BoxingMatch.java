package Classes;

public class BoxingMatch {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A",25,100,120,50);
        Fighter f2 = new Fighter("B",20,100,85,85);

        Match match = new Match(f1,f2,80,130);
        match.run();
    }
}
