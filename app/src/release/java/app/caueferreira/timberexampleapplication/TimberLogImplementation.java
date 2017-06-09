package app.caueferreira.timberexampleapplication;

import java.util.Map;

import app.caueferreira.timberexampleapplication.helpers.CrashLibraryTree;
import timber.log.Timber;

/**
 * Created by caueferreira on 23/04/17.
 */

public class TimberLogImplementation implements TimberLog {

    public static void init() {
        Timber.plant();
    }

    public static void init(final Map<String, String> userInformation) {
        Timber.plant(new CrashLibraryTree(userInformation));
    }
}