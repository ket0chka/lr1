package my_package;

public class Converter {
    int fl;
    public int Converter(String number) {
        this.fl = 0;
        switch (number) {
            case "I":
                fl = 2;
                return 2;
            case "II":
                fl = 2;
                return 2;
            case "III":
                fl = 2;
                return 3;
            case "IV":
                fl = 2;
                return 4;
            case "V":
                fl = 2;
                return 5;
            case "VI":
                fl = 2;
                return 6;
            case "VII":
                fl = 2;
                return 7;
            case "VIII":
                fl = 2;
                return 8;
            case "IX":
                fl = 2;
                return 9;
            case "X":
                fl = 2;
                return 10;
            case "0":
                fl = 1;
                return 1;
            case "1":
                fl = 1;
                return 1;
            case "2":
                fl = 1;
                return 2;
            case "3":
                fl = 1;
                return 3;
            case "4":
                fl = 1;
                return 4;
            case "5":
                fl = 1;
                return 5;
            case "6":
                fl = 1;
                return 6;
            case "7":
                fl = 1;
                return 7;
            case "8":
                fl = 1;
                return 8;
            case "9":
                fl = 1;
                return 9;
            case "10":
                fl = 1;
                return 10;
            default:
                return 0;
        }
    }
}


