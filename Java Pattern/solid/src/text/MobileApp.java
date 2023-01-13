package text;

public class MobileApp implements TextAppMsg, TextSms {
    @Override
    public void sendAppMsg(String appId, String text) {
        System.out.println("[App]: #" + appId + " - " + text);
    }

    @Override
    public void sendSms(String number, String text) {
        System.out.println("[SMS]: #" + number + " - " + text);
    }
}
