package se.lexicon;

import java.lang.reflect.Array;
import java.lang.String;

import static java.lang.System.out;

public class NameRepository {

    //private static String names[][] = new String[9][9];
    private static String names[][] = new String[3][9];

    //return number of elements in array. WORKS OK.
    public static int getSize() {
        int namesLength = names.length;
        out.println(namesLength);
        out.println("---------------------");
        return 0;
    }

    //display all names. NOT WORKING.
    //public static String[][] findAll() {
    //    for (int i = 0; i < names.length; i++) {
    //        for (int j = 0; j < names.length; j++) {
    //            out.println(names[i][j]);
    //        }
    //    } return NameRepository.names;
    //}

    //display all names works with "public static void", but not with "public static String[]".
    public static void findAll() {
        for (int i=0; i < names.length; i++) {
            for (int j=0; j < 3; j++) {
                out.printf(names[i][j]);
                out.printf(" ");
                }
        }
        out.println("END OF LIST");
        out.println("-------------------------");

    }

    //change all names. NOT WORKING PROPERLY.
    //public static void setNames(String[]... names) {
    //    for (int i=0; i < names.length; i++) {
    //        for (int j=0; j < 3; j++) {
       // for (int i = 0; i < names.length; i++) {
       //     for (int j = 0; j < names.length; j++) {
               //This does not work:
               //Array.set(names, i,"X");
               //Array.set(names, j, "X");
               //This does not work either:
               //names = new String[i][j] {"X", "X", "X"};

    //        }
    //    }// return;

//}

    //display all names. NOT WORKING.
    //public static String[][] findAll() {
    //    for (int i = 0; i < names.length; i++) {
    //        for (int j = 0; j < names.length; j++) {
    //            out.println(names[i][j]);
    //        }
    //    } return NameRepository.names;
    //}

    //clear array of entries


    //Main class for workshop application
    public static void main(String[] args) {

        //print the size of the array
        getSize();

        //populate the array.
        names = new String[][] {{"Erik", "", "Svensson  "}, {"Sven", "", "Svenneson  "}, {"Julia", "", "Blom  "},
                {"Erika", "", "Jansson  "}, {"Mikael", "", "Larsson  "}, {"Julia", "", "Blom  "}, {"Katharina", "", "Nilsson  "}, {"Anders", "", "Lund  "},
                {"Ellen", "", "Sandell  "}};

                //test print one name
                out.print(names[0][0]);
                out.print(names[0][1]);
                out.println(names[0][2]);
                out.println("--------------------");

                //This generates an error
                out.print(names[3][0]);
                out.print(names[3][1]);
                out.println(names[3][2]);
                out.println("---------------");


                //this does not work either:
                /*for (int i=0; i < names.length; i++) {
                    for (int j=0; j < 3; j++) {
                       out.printf(names[i][j]);
                       out.printf(" ");
                    }
                }
                out.println("END OF LIST");
                out.println("-------------------------");
                */
                //repopulate the array

        findAll();

                //test print two names
                //these print statements work fine. I don't understand why the one higher up does not work
                // if these work.
                out.printf(names[0][0] + names[0][1] + " " + names[0][2]);
                //out.printf(names[0][1]);
                //out.printf(names[0][2]);
                out.println();
                out.printf(names[2][0] + names[2][1] + " " + names[2][2]);
                //out.printf(names[2][0]);
                //out.printf(names[2][1]);
                //out.println(names[2][2]);
                out.println();
                out.println("--------------------");
        //setNames();



            }

        }



