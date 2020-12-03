package michaelrodyushkin.honorsmobileapps.recyclerviewlab;

import android.graphics.Color;

public class Snap {
    private String mUsername;
    private int mProfilePictureID;
    private String mTime;
    private boolean mOpened;
    public Snap(String username, int profilePicID, String time) {
        mUsername = username;
        mProfilePictureID = profilePicID;
        mTime = time;
        mOpened = false;
    }
    public String getUsername() {
        return mUsername;
    }
    public int getProfilePictureID() {
        return mProfilePictureID;
    }
    public String getTime() {
        return mTime;
    }
    public void isOpen(boolean ans) {
        mOpened = ans;
    }
    public String getStatusText() {
        if(mOpened)
            return "Received";
        return "New Snap";
    }
    public int getStatusImage() {
        if(mOpened)
            return R.drawable.snapopen;
        return R.drawable.snapnotopen;
    }
    public int getStatusTextColor() {
        if(mOpened) {
            return Color.GRAY;
        }
        return Color.parseColor("#F60047");
    }
}
