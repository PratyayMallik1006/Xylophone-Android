# Xylophone-Android
# Dicee-Android
<img src="https://github.com/PratyayMallik1006/Xylophone-Android/blob/main/Xylophone.jpeg?raw=true" height="600" style="float: left">

## Notes:
1. In activity_main.xml
```xml
<Button  
  android:id="@+id/a_key"   
  android:layout_width="match_parent"  
  android:layout_height="wrap_content"  
  android:onClick="playA"/>
```
2. MainActivity.java
```java
SoundPool  mSoundPool= new  SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC,0);

int  mASoundId=mSoundPool.load(getApplicationContext(),R.raw.note6_a,1);
//(context, resourceId,priority)

public void playA(View v){  
    mSoundPool.play(mASoundId,1.0f,1.0f,0,0,1.0f);   
    //(soundId, leftVol, rightVol, priority, loop, rate)
    //Loop: 0 = no loop, -1 = loop forever
}

```
