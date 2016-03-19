//Andriy Zasypkin
//2016-03-19
//Practice 2015 - 02: Fury’s Graffiti

import java.util.*;

public class Main {
  final static String ROUND = "BCDGJOPQRSU2356890";
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int nCases = scan.nextInt();

    case_loop:
    for(int i=0; i<nCases; i++) {
      String in = scan.nextLine();
      for(char c : in.toCharArray()) {
        if(ROUND.indexOf(c) == -1) {
          System.out.println("NOT ROUNDED");
          continue case_loop;
        }
      }
      System.out.println("ROUNDED");
    }

    System.exit(0);
  }
}
