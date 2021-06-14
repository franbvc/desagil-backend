package br.edu.insper.desagil.backend.model;

public class Track {
	private Artist artist;
	private String name;
	private int duration;
	
	public Track(Artist artist, String name, int duration) {
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}
	
	public Artist getArtist() {
		return this.artist;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getDuration() {
		return this.duration;
	}
	
	public String getDurationString() {
		String durationString = "";
		int minutes = 0;
		int seconds = 0;
		
		minutes += (int) this.duration/60; 
		seconds += (((double) this.duration/60) - minutes)*60;
		
		durationString += minutes;
		durationString += ":";
		
		
		if (seconds < 10) {
			durationString += "0" + seconds;
			return durationString;
		}
		
		durationString += seconds;
		return durationString;
	}
	
	public String getFullArtistName() {
		return this.artist.getName();
	}
}
