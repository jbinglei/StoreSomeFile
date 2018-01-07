/**
 * Created by Administrator on 18-1-7.
 */
public class Entry {
    public static void main(String[] args) {
        Transporter transporter = new Transporter();

        Police police = new Police();
        Security security = new Security();
        Thief thief = new Thief();

        transporter.addWatcher(police);
        transporter.addWatcher(security);
        transporter.addWatcher(thief);

        transporter.notifyWatchers();
    }
}
