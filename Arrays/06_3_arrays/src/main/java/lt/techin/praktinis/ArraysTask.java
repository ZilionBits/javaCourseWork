package lt.techin.praktinis;

import java.util.Arrays;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {3, 2, 1, 4, 6, 5};

        int[] arrWithRemovedElement = removeElementAndReturnNewArray(arr, 1);
        System.out.println(Arrays.toString(arrWithRemovedElement));

    }

   // Parašykite metodą, kuris sukuria nustatyto dydžio sveikųjų skaičių masyvą
   // ir užpildo jį atsitiktinai sugeneruotais skaičiais iš nurodyto intervalo.
    public static int[] generateRandomArray(int size, int min, int max) {
        //TODO
        int[] randomArr = new int[size];

        for (int i = 0; i < size; i++) {
            int randomNumber = (int)(Math.random()*((max-min)+1))+min;
            randomArr[i] = randomNumber;
        }
        return randomArr;
    }


    //Parašykite metodą, kuris pašalintų masyvo arr[n] k-tąjį elementą (su indeksu k),
    //surašant reikiamus elementus į naują masyvą b[n-1]. Metodas grąžina naują masyvą.
    //Jei k yra už masyvo ribų, metodas grąžina null (teisingiau būtų mesti exception, bet dar nesimokėm)
    public static int[] removeElementAndReturnNewArray(int[] arr, int k) {
        //TODO
        if (k >= arr.length || arr.length==0) {
            return null;
        }
            int[] b = new int[arr.length - 1];

            for (int i = 0; i < b.length; i++) {
                if (i < k) {
                    b[i] = arr[i];
                } else {
                    b[i] = arr[i + 1];
                }
            }
            return b;
    }

    //Parašykite metodą, kuris įterptų į masyvą arr[n] prieš k-tąjį elementą reikšmę x,
    //surašant reikiamus elementus į naują masyvą b[n+1]. Metodas grąžina naują masyvą.
    //Jei k yra už masyvo ribų, metodas grąžina null (teisingiau būtų mesti exception, bet dar nesimokėm)
    public static int[] insertElementAndReturnNewArray(int[] arr, int k, int x){
        //TODO
        if (k >= arr.length || arr.length==0) {
            return null;
        }
        int[] b = new int[arr.length+1];

        for (int i = 0; i < b.length; i++) {
            if(i < k) {
                b[i] = arr[i];
            } else if (i > k) {
                b[i] = arr[i-1];
            } else {
                b[i] = x;
            }
        }
        return b;
    }

    //Parašykite metodą, kuris grąžintų duoto masyvo apverstą kopija.
    public static int[] reverseArray(int[] arr) {
        //TODO
        int[] reverseArr = new int[arr.length];
        int index = arr.length-1;

        for (int i = 0; i < arr.length ; i++) {
            reverseArr[i] = arr[index];
            index--;
        }
        return reverseArr;
    }

    //Parašykite metodą, kuris apverstu duotą masyvą (nekuriant naujo masyvo)
    public static void reverseInPlace(int[] arr) {
        //TODO
        int indexStart = 0;
        int indexEnd = arr.length-1;

        for (int i = 0; i < arr.length/2 ; i++) {
            int temp = arr[indexStart];
            arr[indexStart] = arr[indexEnd];
            arr[indexEnd] = temp;
            indexStart++;
            indexEnd--;
        }
    }











}
