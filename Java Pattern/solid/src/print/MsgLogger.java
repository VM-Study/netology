package print;

public class MsgLogger implements PrintMsg {
    void printMsgToConsole(String text) {
        System.out.println(text);
    }

    @Override
    public void print(String text) {
        printMsgToConsole(text);
    }
}
