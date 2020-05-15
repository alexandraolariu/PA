import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String args[]) {
        //Let n, k be two integers and C_1,...,C_m a number of letters (alphabet),
        // all given as a command line arguments. Validate the arguments!
        int n = Integer.parseInt(args[0]);
        System.out.print("Number of words:" + n + "\n");
        int k = Integer.parseInt(args[1]);
        System.out.print("Number of letters:" + k + "\n");

        //Create an array of n Strings (called words), each word containing exactly k characters from the given alphabet.
        List<String> arr = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            StringBuilder word = new StringBuilder();
            for (int j = 0; j < k; ++j) {
                Random r = new Random();
                int letter = r.nextInt(26) + 2;
                word.append(args[letter]);
            }
            //Display on the screen the generated array.
            System.out.print(word + "\n");
            arr.add(word.toString());
        }

        //Two words are adjacent (neighbors) if they have a common letter.
        // Create a boolean n x n matrix, representing the adjacency relation of the words.
        int[] vecini = new int[n];
        boolean[][] matrix = new boolean[n][n];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; ++j) {
                boolean ok = false;
                for (int p = 0; p < k && !ok; ++p)
                    for (int q = 0; q < k && !ok; ++q)
                        if (arr.get(i).charAt(p) == arr.get(j).charAt(q)) {
                            ok = true;
                        }
                if (ok == true) {
                    matrix[i][j] = true;
                    matrix[j][i] = true;
                }
            }
            int nrvecini = 0;
            for (int j = 0; j < n; ++j)
                nrvecini += matrix[i][j] ? 1 : 0;
            vecini[i] = nrvecini;
        }

        //Display the matrix on the screen.
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\n");
        }

        //Display the words that have the most, respectively the least, number of neighbors.
        //Check if all words have the same number of neighbors.
        int pozmax = 0, pozmin = 0, eq = 1;
        for (int i = 0; i < n; ++i) {
            if (vecini[pozmin] < vecini[i]) pozmin = i;
            if (vecini[pozmax] > vecini[i]) pozmax = i;
        }

        if(pozmax==pozmin)
            eq=1;
        else
            eq=0;

        System.out.print("\n");
        if(eq==1){
            System.out.print("Toate sunt egale!" + "\n");
        }
        System.out.print("Cei mai multi vecini :" + arr.get(pozmax) + "\n");
        System.out.print("Cei mai putini vecini :" + arr.get(pozmin) + "\n");

        List<Integer> coada = new ArrayList<>();
        int[] vizitat = new int[n];

        //verifica daca nodurile au fost vizitate
        //adauga toate nodurile vizitate intr-o coada

        coada.add(0);
        vizitat[0]= 1;
        int proces = 0;
        while (proces < coada.size()) {
            int nod = coada.get(proces);
            proces++;
            for (int i = 0; i < n; ++i) {
                if (matrix[nod][i]) {
                    if (vizitat[i] == 0) {
                        coada.add(i);
                        vizitat[i] = 1;
                    }
                }
            }
        }

        String rez ="da";
        for(int i=0;i< n;i++)
            if(vizitat[i] == 1)
                rez= "NU";
        System.out.print("Este conex :" + rez + "\n");
    }
}
