package com.java.practice.hybridInheritance;

public class SmartPhonec2 extends DeviceC1 implements Camera,MusicPlayer {
	@Override
	public void images() 
	{
		System.out.println("the images are clear from these camera");
	}
	@Override
	public void playmusic()
	{
		System.out.println("backgroud music is playing");
	}
	@Override
	public void stopmusic()
	{
		System.out.println("stop the songs");
	}
	@Override
	public void poweroff()
	{
          System.out.println("Smartphone power is off");
	}
	@Override
public void poweron()
{
	System.out.println("Smartphone power is on");

}
}

/*class SmartWatch extends DeviceC1 implements Camera, MusicPlayer {
	@Override
	public void poweron()
	{
		System.out.println("Smartphone power is on");

	}
	
}*/

	