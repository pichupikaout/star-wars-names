
public class Name_StarWars {
    /**
     * Mr Marques MadeUp Problem: Name_StarWars 12/16/2016
     * 
     * Above defined is the Name class. Complete the below code in Main( ).. Note:
     * the middle initial is either "R" for Republic (good guys) or "E" for Empire
     * (bad guys).
     * 
     * OUTPUT n1 = Skywalker R Luke n2 = Skywalker E Anakin n3 = Skywalker E Anakin
     * 
     * Original List: Skywalker R Luke Skywalker E Anakin Skywalker R Leia Solo R
     * Han Solo E Kylo Ren R Yoda Droid R R2D2 Droid R C3PO Wookie R Chewbacca Vader
     * E Darth Fett E Boba
     * 
     * 
     * 
     * Sorted List: R Yoda Droid R C3PO Droid R R2D2 Fett E Boba Skywalker E Anakin
     * Skywalker R Leia Skywalker R Luke Solo E Kylo Ren Solo R Han Vader E Darth
     * Wookie R Chewbacca
     * 
     * Most common last name = Skywalker Shortest total name = R Yoda Largest group
     * in Names = Republic: 7
     */

    public static class Name_StarWars_CLIENT {
        public static void main(String[] args) {
            Name n1 = new Name("Luke", "R", "Skywalker");
            Name n2 = new Name("Anakin", "E", "Skywalker");
            Name n3 = n2;

            // Output n1-n3
            System.out.println("   n1 = " + n1);
            System.out.println("   n2 = " + n2);
            System.out.println("   n3 = " + n3);
            System.out.println();

            // Fill array with names.
            Name names[] = { n1, n2, new Name("Leia", "R", "Skywalker"), new Name("Han", "R", "Solo"),
                new Name("Kylo Ren", "E", "Solo"), new Name("Yoda", "R", ""), new Name("R2D2", "R", "Droid"),
                new Name("C3PO", "R", "Droid"), new Name("Chewbacca", "R", "Wookie"),
                new Name("Darth", "E", "Vader"), new Name("Boba", "E", "Fett") };

            // call printList and output names array
            System.out.println("Original List: ");
            printList(names);
            System.out.println("\n\n");

            // sort list by last then first name
            System.out.println("Sorted List: ");
            sortList(names);
            printList(names);
            System.out.println("\n\n");

            System.out.println("Most common last name = " + mostCommonLastName(names));
            System.out.println("Shortest total name = " + shortestTotalName(names));
            System.out.println("Largest group in Names = " + largestMembersInNames(names));

        } // main

        // ===========================================================================
        // Print the entire array
        public static void printList(Name names[]) {
            for (int a = 0; a < names.length; a++) {
                System.out.println(names[a].toString());
            }
        }

        // ===========================================================================
        // Sort the list by last/first name via BubbleSort OR any sort you want,
        
        public static void sortList(Name[] nameList) {
            Name temp = new Name();
	        System.out.println("Strings in sorted order:");
	        for (int j = 0; j < nameList.length; j++) {
   	            for (int i = j + 1; i < nameList.length; i++) {
		        if (nameList[i].compareTo(nameList[j]) < 0) {
			    temp = nameList[j];
			    nameList[j] = nameList[i];
			    nameList[i] = temp;
                }
            }
        }
    }


        // ===========================================================================
        // Return the most common last name found,null if none.If more than one exists
        // common, pick the first one.
        public static String mostCommonLastName(Name[] list) {
        sortList(list);
        int counter = 0;
        int counter1 = 0;
        String last = "";
           for (int a = 0; a < list.length - 1; a+=2) {
               if (list[a].toStringLast().equals(list[a+1].toStringLast())){
                    counter1++;
               } else {
                   if (counter1 > counter) {
                       last = list[a].toStringLast();
                       counter = counter1;
                       counter1 = 0;
                   }
               }
           }
           return last;
        }

        

        // ==============================================================================
        // Find and return the Name that is the shortest in total.If more than one
        // exists
        // common, pick the first one.
        public static String shortestTotalName(Name n[]) {
            sortList(n);
            return n[0].toString();
        }

        // ===========================================================================
        // Return the group that has the largest number of members (R or E)
        public static String largestMembersInNames(Name nl[]) {
            int r = 0;
            int e = 0;
            for (int a = 0; a < nl.length; a++) {
                if (nl[a].getMiddle().equals("R")) {
                    r++;
                } else {
                    e++;
                }
            
            }
            if (r > e) {
                return "Republic";

            } else {
                return "Empire";
            }
        }
    }
}

        

