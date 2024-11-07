package com.java.practice.multipleInheritance;

public class Media {

	public static void main(String[] args) {
		Audio A = new MediaPlayer();
		Vedio v = new MediaPlayer();
		A.audio();
		A.playaudio();
		v.playvedio();
		v.stopvedio();
		System.out.println(Audio.s1);
		// TODO Auto-generated method stub

	}

}
