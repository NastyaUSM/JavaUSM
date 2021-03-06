package cad.lab14.nomer15_8;// Fig. 7.8: StudentPoll.java
// Poll analysis program.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentPoll {
    public static void main(String[] args) throws FileNotFoundException {
        // student response array (more typically, input at run time)

        List<Integer> responses = new ArrayList<>();

        File file = new File("D:\\responses.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            Integer response = Integer.parseInt(scanner.nextLine().trim());
            responses.add(response);
        }

        int[] frequency = new int[6]; // array of frequency counters

        // for each answer, select responses element and use that value
        // as frequency index to determine element to increment
        for (int answer = 0; answer < responses.size(); answer++) {
            try {
                ++frequency[responses.get(answer)];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e); // invokes toString method
                System.out.printf("   responses[%d] = %d%n%n",
                        answer, responses.get(answer));
            }
        }

        System.out.printf("%s%10s%n", "Rating", "Frequency");

        // output each array element's value
        for (int rating = 1; rating < frequency.length; rating++)
            System.out.printf("%6d%10d%n", rating, frequency[rating]);
    }
} // end class StudentPoll


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
