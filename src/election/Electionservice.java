package election;

public class Electionservice {
    public State getstate() {

        State tg=new State();
        tg.name="AP";

        Constituency[] constituencies=new Constituency[2];

        Constituency c1 = new Constituency();
        tg.constituency= c1;
        c1.name="Rayalseema";
        c1.type="MP";
        c1.no_of_voters=1000;
        c1.state=tg;

        tg.constituency= c1;

        constituencies[0]=c1;


        return tg;









    }



}
