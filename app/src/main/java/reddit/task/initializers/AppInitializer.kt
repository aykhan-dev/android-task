package reddit.task.initializers

import android.app.Application

interface AppInitializer {
    fun init(application: Application)
}
