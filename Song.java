package com.music;

public class Song {

 int id;

 String songName;

 String movieName;

 String composer;

 String lyricist;

 double length;

 public int getId() {

  return id;

 }

 public void setId(int id) {

  this.id = id;

 }

 public String getSongName() {

  return songName;

 }

 public void setSongName(String songName) {

  this.songName = songName;

 }

 public String getMovieName() {

  return movieName;

 }

 public void setMovieName(String movieName) {

  this.movieName = movieName;

 }

 public String getComposer() {

  return composer;

 }

 public void setComposer(String composer) {

  this.composer = composer;

 }

 public String getLyricist() {

  return lyricist;

 }

 public void setLyricist(String lyricist) {

  this.lyricist = lyricist;

 }

 public double getLength() {

  return length;

 }

 public void setLength(double length) {

  this.length = length;

 }

 @Override

 public String toString() {

// return "song [id=" + id + ", songName=" + songName + ", movieName=" + movieName + ", composer=" + composer

// + ", lyricist=" + lyricist + ", length=" + length + "]";

  return "song [id=" + id + ", songName=" + songName + ", movieName=" + movieName + ", composer=" + composer

    + ", lyricist=" + lyricist + ", length=" + length + "]";

 }

}

