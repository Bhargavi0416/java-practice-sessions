package com.java.practice.multipleInheritance;

public class MediaPlayer implements Audio,Vedio {
	@Override
	public void audio()
	{
		System.out.println("audio songs");
	}
	@Override
	public void playaudio()
	{
		System.out.println("background music is playing");
	}
	@Override
	public void playvedio()
	{
		System.out.println("play the vedio song");
		
	}
	@Override
	public void stopvedio()
	{
		System.out.println("stop the vedio");
	}

}
