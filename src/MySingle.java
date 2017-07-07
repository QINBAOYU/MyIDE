/**
 * Created by 秦 on 2017/7/5.
 */
public class MySingle {
    private static MySingle ourInstance = new MySingle();

    public static MySingle getInstance() {
        return ourInstance;
    }

    private MySingle() {
    }
}
