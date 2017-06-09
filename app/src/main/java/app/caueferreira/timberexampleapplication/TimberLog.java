package app.caueferreira.timberexampleapplication;

import java.util.Map;

/**
 * Created by caueferreira on 23/04/17.
 */

public interface TimberLog {
     static void init(){};
     static void init(final Map<String, String> userInformation){};
}
