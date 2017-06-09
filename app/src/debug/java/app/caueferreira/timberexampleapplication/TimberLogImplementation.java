package app.caueferreira.timberexampleapplication;

import java.util.Map;

import timber.log.Timber;

/**
 * Created by caueferreira on 23/04/17.
 */

public class TimberLogImplementation implements TimberLog {

    public static void init(final Map<String, String> userInformation) {
        init();
    }

    public static void init() {
        Timber.plant(new Timber.DebugTree() {
            @Override
            protected String createStackElementTag(StackTraceElement element) {
                return String.format("C:%s:%s",
                        super.createStackElementTag(element),
                        element.getLineNumber());
            }
        });
    }
}