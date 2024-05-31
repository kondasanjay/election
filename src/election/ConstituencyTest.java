package election;

public class ConstituencyTest {

    public static void main(String[] args) {

        Electionservice es=new Electionservice();
        State test = es.getstate();

        System.out.println(test.constituency.name);
        System.out.println(test.constituency.type);
        System.out.println(test.constituency.no_of_voters);



    }
}
