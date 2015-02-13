package ims.shotgun;

import com.parse.Parse;

public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "xQhVSj9XZmTMvmsIQrfWavtgZVUhEbdm77i9nhFh", "6yaXHcUQrHpUMMAbGDGzm1z3wie5J6KyGlYgZay9");
    }
}
