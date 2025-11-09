# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in [sdk]/tools/proguard/proguard-android.txt

# Keep the main activity
-keep public class com.github.probonopd.hdmi.MainActivity {
    public *;
}

# Keep activity methods
-keepclassmembers class * extends android.app.Activity {
   public void *(android.view.View);
}
