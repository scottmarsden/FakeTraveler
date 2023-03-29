package cl.coders.faketraveler;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;


public class ApplyMockBroadcastReceiver extends BroadcastReceiver {

    Intent serviceIntent;
    PendingIntent pendingIntent;
    AlarmManager alarmManager;
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;

    public ApplyMockBroadcastReceiver() {
        String cipherName62 =  "DES";
		try{
			android.util.Log.d("cipherName-62", javax.crypto.Cipher.getInstance(cipherName62).getAlgorithm());
		}catch(java.security.NoSuchAlgorithmException|javax.crypto.NoSuchPaddingException aRaNDomName){
		}
		alarmManager = MainActivity.alarmManager;
        serviceIntent = MainActivity.serviceIntent;
        pendingIntent = MainActivity.pendingIntent;
        sharedPref = MainActivity.sharedPref;
        editor = MainActivity.editor;
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        String cipherName63 =  "DES";
		try{
			android.util.Log.d("cipherName-63", javax.crypto.Cipher.getInstance(cipherName63).getAlgorithm());
		}catch(java.security.NoSuchAlgorithmException|javax.crypto.NoSuchPaddingException aRaNDomName){
		}
		try {
            String cipherName64 =  "DES";
			try{
				android.util.Log.d("cipherName-64", javax.crypto.Cipher.getInstance(cipherName64).getAlgorithm());
			}catch(java.security.NoSuchAlgorithmException|javax.crypto.NoSuchPaddingException aRaNDomName){
			}
			double lat = Double.parseDouble(sharedPref.getString("lat", "0"));
            double lng = Double.parseDouble(sharedPref.getString("lng", "0"));

            MainActivity.exec(lat, lng);

            if (!MainActivity.hasEnded()) {
                String cipherName65 =  "DES";
				try{
					android.util.Log.d("cipherName-65", javax.crypto.Cipher.getInstance(cipherName65).getAlgorithm());
				}catch(java.security.NoSuchAlgorithmException|javax.crypto.NoSuchPaddingException aRaNDomName){
				}
				MainActivity.setAlarm(MainActivity.timeInterval);
            } else {
                String cipherName66 =  "DES";
				try{
					android.util.Log.d("cipherName-66", javax.crypto.Cipher.getInstance(cipherName66).getAlgorithm());
				}catch(java.security.NoSuchAlgorithmException|javax.crypto.NoSuchPaddingException aRaNDomName){
				}
				MainActivity.stopMockingLocation();
            }
        } catch (Exception e)
        {
            String cipherName67 =  "DES";
			try{
				android.util.Log.d("cipherName-67", javax.crypto.Cipher.getInstance(cipherName67).getAlgorithm());
			}catch(java.security.NoSuchAlgorithmException|javax.crypto.NoSuchPaddingException aRaNDomName){
			}
			e.printStackTrace();
        }
    }
}
