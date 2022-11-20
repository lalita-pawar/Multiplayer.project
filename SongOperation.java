package com.music;

import java.util.ArrayList;

import java.util.Scanner;

import com.music.Song;

public class SongOperation {

 static ArrayList<Song> list = new ArrayList<Song>();

 static Scanner sc = new Scanner(System.in);

 public void addSongs() {

  System.out.println(" add song Method ");

  System.out.println("please enter how many songs you want to add in your song list");

  int choice = sc.nextInt();

  for (int i = 0; i < choice; i++) {

   System.out.println("Enter song name");

   String name = sc.next();

   System.out.println("enter song id");

   int id = sc.nextInt();

   System.out.println("enter movie name");

   String mname = sc.next();

   System.out.println("enter composer name");

   String cname = sc.next();

   System.out.println("enter lyricist");

   String lname = sc.next();

   System.out.println("enter the duration for the song");

   Double dvalue = sc.nextDouble();

   Song song = new Song();

   song.setSongName(name);

   song.setId(id);

   song.setMovieName(mname);

   song.setComposer(cname);

   song.setLyricist(lname);

   song.setLength(dvalue);

   list.add(song);

   System.out.println(song.getSongName()+" :is added");

// for(int j=0;j<list.size();j++) {

// Song song = new Song();

// song.setSongName(name);

// list.add(song);

// }

  }

 }

 public void chooseSongToPlay() {

// System.out.println(" choose song Method ");

  // Display List of all songs

  for (int i = 0; i < list.size(); i++) {

   System.out.println(list.get(i));

   System.out.println(i);

  }

  // Get choice from user to play the song choice must be an

  System.out.println("choose song to play");

  int choice = sc.nextInt();

  for (int i = 0; i < list.size(); i++) {

   if (choice == i) {

    System.out.println(list.get(i).getSongName() + "is playing");

   }

  }

 }

 public void playAllSongs() {

  System.out.println(" Play all song Method ");

  // Playing All Song one by one

  for (int i = 0; i < list.size(); i++) {

   System.out.println(list.get(i) + "is playing");

  }

 }

 public void playRandomSong() {

  System.out.println(" Random playing Method ");

  // use math.random() metod to play randam songs

  int randam = 0;

  int min =1;

  int max = list.size();

  for(int i= 0 ; i<list.size();i++)

  {

   randam = (int )(Math.random()*list.size())+min;

  }

  // get the random value and play that song

  for (int i = 1; i < list.size(); i++) {

   if ( randam == i) {

    System.out.println(list.get(i-1) + "is playing");

   }

  }

 }

 public void removeSong() {

  System.out.println(" Remove Method ");

  // Display List of all the song

  displayAllSongs();

  System.out.println("Choose id of song to Remove the Song ");

  int remove = sc.nextInt();

  if (remove <= list.size()) {

  for(int i=1;i<=list.size();i++) {

   if (remove==i)

   {

    list.remove(i-1);

    System.out.println(list.get(i) + "is removed");

// System.out.println(list.get(i).getSongName() +"is removed ");

   }

  }

  }

  else {

   System.out.println("Enter valid Choice");

  }

 }

 public static void updateSong() {

  System.out.println("Song Updating ");

 }

 public void displayAllSongs() {

  System.out.println(" Play list");

  for (int i = 0; i < list.size(); i++) {

   System.out.println(list.get(i));

  }

 }


}
