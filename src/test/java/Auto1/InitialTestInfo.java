package Auto1;

import Auto.Homepage;
import Auto.LoginPage;
import Auto.ParticipantDetailsPage;
import Auto.Participants;

public class InitialTestInfo {
    public static void main(String[] args) {
        LoginPage loginpage=new  LoginPage();
       Homepage homepage=new Homepage();

        Participants participants =new   Participants();

        ParticipantDetailsPage participantDetailsPage=new  ParticipantDetailsPage();

        loginpage.openUrl("").enterUser("").enterPassword("").clickLoginBtn().clickOnCourse("SDET").clickOnParticipants();

    }
}
