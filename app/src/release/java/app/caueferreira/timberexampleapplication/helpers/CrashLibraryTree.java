package app.caueferreira.timberexampleapplication.helpers;

import android.util.Log;

import java.util.Map;

import timber.log.Timber;

/**
 * Created by caueferreira on 23/04/17.
 */

public class CrashLibraryTree extends Timber.Tree {

    public CrashLibraryTree(final Map<String, String> userInformation) {
        YourCrashLibrary.setUser(userInformation);
    }

    @Override
    protected void log(final int priority, final String tag, final String message, final Throwable throwable) {
        if (priority == Log.VERBOSE || priority == Log.DEBUG) {
            return;
        }

        YourCrashLibrary.log(priority, tag, message);

        if (priority == Log.WARN) {
            YourCrashLibrary.logWarning(throwable);
        } else {
            YourCrashLibrary.logException(throwable);
        }
    }
}
