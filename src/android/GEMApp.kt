/*
 * Copyright 2017 Substance Mobile
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package substance.music;

import android.app.Application;

//TODO: New theme lib
import com.afollestad.appthemeengine.ATE;
import com.afollestad.appthemeengine.Config;

// TODO: New playback lib
import com.animbus.music.media.Library;
import com.animbus.music.media.PlaybackRemote;
import static com.animbus.music.media.PlaybackRemote.LOCAL;

import substance.music.util.Options

class GemApp : Application() {

	// Keeps metadata with updates
	private const val THEME_REVISION_NUMBER = 0;

	override fun onCreate() {
		super.onCreate()
		configureThemes()
		Options.create(this) // Setup the settings storage
		configurePlaybackLib()
	}

	inline fun configureThemes() {
		//TODO: Impl
	}

	inline fun configurePlaybackLib() {
		//TODO: Impl
	}

	inline fun getATEKey(): String? = null // TODO: Adapt to new theme engine
}

/* OLD JAVA CODE. TODO: Remove
public class GEMApp extends Application {
    private static final int ATE_REVISION_NUMBER = 0;

    @Override
    public void onCreate() {
        super.onCreate();
        if (!ATE.config(this, getATEKey()).isConfigured()) {
            ATE.config(this, getATEKey())
                    .activityTheme(R.style.AppTheme_Faithful)
                    .coloredActionBar(true)
                    .primaryColorRes(R.color.faithfulPrimaryDark)
                    .autoGeneratePrimaryDark(true)
                    .coloredStatusBar(true)
                    .accentColorRes(R.color.default_accent)
                    .navigationViewThemed(true)
                    .navigationViewSelectedIconRes(R.color.default_accent)
                    .navigationViewSelectedTextRes(R.color.default_accent)
                    .lightStatusBarMode(Config.LIGHT_STATUS_BAR_AUTO)
                    .lightToolbarMode(Config.LIGHT_TOOLBAR_AUTO)
                    .commit();
        }

        //noinspection StatementWithEmptyBody
        if (!ATE.config(this, getATEKey()).isConfigured(ATE_REVISION_NUMBER)) {
            //Do something in later versions
        }

        Options.init(this);
        new Library(this);

        //Initiates the process of setting up all of the media objects to be triggered instantly
        PlaybackRemote.setUp(this);
        PlaybackRemote.inject(LOCAL);
    }

    public String getATEKey() {
        return null;
    }
}
*/