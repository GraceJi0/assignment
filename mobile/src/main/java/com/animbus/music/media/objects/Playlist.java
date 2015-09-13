package com.animbus.music.media.objects;

import java.util.List;

/**
 * Created by Adrian on 7/5/2015.
 */
public class Playlist {
    List<Song> playlistSongs;
    String playlistName;
    long id;

    public Playlist(){}

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Manages the title of the playlist
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //These are the songs in the
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public void setPlaylistSongs(List<Song> playlistSongs) {
        this.playlistSongs = playlistSongs;
    }

    public List<Song> getPlaylistSongs() {
        return playlistSongs;
    }

    ///////////////////////////////////////////////////////////////////////////
    // ID
    ///////////////////////////////////////////////////////////////////////////

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}