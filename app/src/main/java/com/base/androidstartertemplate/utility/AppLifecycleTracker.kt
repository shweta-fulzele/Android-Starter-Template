package com.base.androidstartertemplate.utility

import android.app.Activity
import android.app.Application
import android.os.Bundle

class AppLifecycleTracker : Application.ActivityLifecycleCallbacks {

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
//        TODO("On Present Activity of Application Created")
    }

    override fun onActivityStarted(activity: Activity) {
//        TODO("On Current Activity of Application Start")
    }

    override fun onActivityResumed(activity: Activity) {
//        TODO("On Current Activity of Application Resume")
    }

    override fun onActivityPaused(activity: Activity) {
//        TODO("On Current Activity of Application Paused")
    }

    override fun onActivityStopped(activity: Activity) {
//        TODO("On Current Activity of Application Stopped")
    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
//        TODO("On Saved Instance State")
    }

    override fun onActivityDestroyed(activity: Activity) {
//        TODO("On App Killed / Destroyed")
    }
}