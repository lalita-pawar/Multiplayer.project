package com.music;
import java.util.Scanner;
public class Multi {
 public static void main(String[] args) {
  // create object of SongOperation class to access all methods
  SongOperation songOperation=new SongOperation();
  boolean state=true;
  while(state) {
  System.out.println(" Menu \n ");
  Scanner sc = new Scanner(System.in);
  System.out.println("1.Play \n2.Add \n3.edit \n4.exit \n");
  int choice = sc.nextInt();
  switch(choice) {
  case 1:{
   System.out.println("PLAY \n");
   System.out.println("1.Choose song to play \n2.Play All Songs \n3.Play Song Randam \n4.Go Back");
   int choice1=sc.nextInt();
   switch(choice1) {
   case 1: {
    songOperation.chooseSongToPlay();
    break;
   }
   case 2: {
    songOperation.playAllSongs();
    break;
   }
   case 3:{
    songOperation.playRandomSong();
    break;
   }
   case 4:{
    break;
   }
   }
   break;
  }
  case 2: {
   System.out.println("ADD \n");
   System.out.println("1.Add Songs \n2.Remove Song \n3.Go Back");
   int choice2=sc.nextInt();
   switch(choice2) {
   case 1: {
    songOperation.addSongs();
    songOperation.displayAllSongs();
    break;
   }
   case 2:{
    songOperation.removeSong();
    break;
   }
     case 3:{
     break;
    }
   }
   break;
  }
  case 3:{
 System.out.println("EDIT \n");
 songOperation.updateSong();
 break;

  }
  case 4:{
 state=false;
 break;
  }
  }
  }
 }
}
