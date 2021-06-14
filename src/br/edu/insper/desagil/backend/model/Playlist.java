package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playlist {
	private int id;
	private List<Track> tracks;
	private Map<String, Integer> ratings;
	
	public Playlist(int id) {
		this.id = id;
		this.tracks = new ArrayList<>();
		this.ratings = new HashMap<>();
	}
	
	public int getId() {
		return this.id;
	}
	
	public List<Track> getTracks() {
		return this.tracks;
	}
	
	public Map<String, Integer> getRatings() {
		return this.ratings;
	}
	
	public void addTrack(Track track) {
		this.tracks.add(track);
	}
	
	public void putRating(String username, int rating) {
		this.ratings.put(username, rating);
	}
	
	public double averageRatings() {
		double average = 0.0;
		int averageInt = 0;
		double averageFrac = 0.0;
		
		for(int i: this.ratings.values()) {
			average += (double) i;
		}
		average = average / (double) this.ratings.size();
		averageInt = (int) average;
		averageFrac = average - averageInt;
		
		if (averageFrac < 0.26) {
			return averageInt + 0.0;
		}
		
		if (averageFrac >= 0.26 || averageFrac < 0.74) {
			return averageInt + 0.5;
		}
		
		return averageInt + 1.0;
	}
}
