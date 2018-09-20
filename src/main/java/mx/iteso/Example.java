package mx.iteso;

public class Example {

    static WhatsAppGroup team1, team2;
    static Member alejandro, andrea, palafox, jlabad, josue, rene,
            alan, hiram, gabriel, juan, manuel, pedro, rafa, rodrigo;

    public static void main(String[] args) {

        setUpTeams();

        team1.updateMessage("Welcome to the Team1!");
        team2.updateMessage("Welcome to the Team2!");

        Member impostor = new Member();

        team1.registerObserver(impostor);
        team1.updateMessage("Impostor has been registered to Team1");
        team1.removeObserver(impostor);
        team1.updateMessage("Impostor has been kicked out from Team1");
        team2.registerObserver(impostor);
        team2.updateMessage("Impostor has been register to Team2");
        team2.removeObserver(impostor);
        team2.updateMessage("Impostor has been kicked out from Team2");

        System.out.println("Impostor's messages");
        impostor.readMessagesAndClear();

        System.out.println("\nAlejandro's messages");
        alejandro.readMessagesAndKeep();

        System.out.println("\nRodrigo's messages");
        rodrigo.readMessagesAndKeep();

    }

    public static void setUpTeams(){
        team1 = new WhatsAppGroup();
        team2 = new WhatsAppGroup();

        team1.registerObserver(alejandro = new Member());
        team1.registerObserver(andrea = new Member());
        team1.registerObserver(palafox = new Member());
        team1.registerObserver(jlabad = new Member());
        team1.registerObserver(josue = new Member());
        team1.registerObserver(rene = new Member());
        team1.registerObserver(rodrigo = new Member());

        team2.registerObserver(alan = new Member());
        team2.registerObserver(hiram = new Member());
        team2.registerObserver(gabriel = new Member());
        team2.registerObserver(juan = new Member());
        team2.registerObserver(manuel = new Member());
        team2.registerObserver(pedro = new Member());
        team2.registerObserver(rafa = new Member());
        team2.registerObserver(rodrigo);
    }

}
