package br.edu.insper.desagil.backend.model;

import java.util.List;

public class CollaborationTrack extends Track {
	private List<Artist> collaborators;

	public CollaborationTrack(Artist artist, List<Artist> collaborators, String name, int duration) {
		super(artist, name, duration);
		this.collaborators = collaborators;
	}
	
	@Override
	public String getFullArtistName() {
		String output = "";
		int numCollabs = 0;
		
		output += this.getArtist().getName();
		output += " (feat. ";
		
		for (Artist artist : this.collaborators) {
			output += artist.getName();
			numCollabs ++;
			
			if (numCollabs != collaborators.size()) {
				output += ",";
			}
		}
		
		output += ")";
		return output;
	}
	
	
}
