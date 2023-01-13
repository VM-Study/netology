package text;

public class WebSite implements TextEmail, TextSms {

    @Override
    public void sendEmail(String email, String text) {
        System.out.println("[Email]: " + email + " - " + text);
    }

    @Override
    public void sendSms(String number, String text) {
        System.out.println("[SMS]: #" + number + " - " + text);
    }
}
