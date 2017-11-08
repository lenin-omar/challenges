public class StarChar {

    public String line0, line1, line2, line3, line4;

    public void getMatrix(int asciiChar) {
        //65-90 = A-Z. Spacebar = 32
        //TODO: Finish other characters
        switch (asciiChar) {
            case 32:
                line0 = "     ";
                line1 = "     ";
                line2 = "     ";
                line3 = "     ";
                line4 = "     ";
                break;
            case 65:
                line0 = "  *  ";
                line1 = " * * ";
                line2 = "*****";
                line3 = "*   *";
                line4 = "*   *";
                break;
            case 66:
                line0 = "**** ";
                line1 = "*   *";
                line2 = "**** ";
                line3 = "*   *";
                line4 = "**** ";
                break;
            case 67:
                line0 = " ****";
                line1 = "*    ";
                line2 = "*    ";
                line3 = "*    ";
                line4 = " ****";
                break;
            case 68:
                line0 = "**** ";
                line1 = "*   *";
                line2 = "*   *";
                line3 = "*   *";
                line4 = "**** ";
                break;
            case 69:
                line0 = "*****";
                line1 = "*    ";
                line2 = "**** ";
                line3 = "*    ";
                line4 = "*****";
                break;
            case 70:
                line0 = "*****";
                line1 = "*    ";
                line2 = "**** ";
                line3 = "*    ";
                line4 = "*    ";
                break;
            case 71:
                line0 = " ****";
                line1 = "*    ";
                line2 = "*  **";
                line3 = "*   *";
                line4 = " ****";
                break;
            case 72:
                line0 = "*   *";
                line1 = "*   *";
                line2 = "*****";
                line3 = "*   *";
                line4 = "*   *";
                break;
            case 73:
                line0 = " *** ";
                line1 = "  *  ";
                line2 = "  *  ";
                line3 = "  *  ";
                line4 = " *** ";
                break;
            case 74:
                line0 = "  ***";
                line1 = "   * ";
                line2 = "   * ";
                line3 = "*  * ";
                line4 = " **  ";
                break;
            case 75:
                line0 = "*   *";
                line1 = "*  * ";
                line2 = "***  ";
                line3 = "*  * ";
                line4 = "*   *";
                break;
            case 76:
                line0 = "*    ";
                line1 = "*    ";
                line2 = "*    ";
                line3 = "*    ";
                line4 = "*****";
                break;
            case 77:
                line0 = "*   *";
                line1 = "** **";
                line2 = "* * *";
                line3 = "*   *";
                line4 = "*   *";
                break;
            case 78:
                line0 = "*   *";
                line1 = "**  *";
                line2 = "* * *";
                line3 = "*  **";
                line4 = "*   *";
                break;
            case 79:
                line0 = " *** ";
                line1 = "*   *";
                line2 = "*   *";
                line3 = "*   *";
                line4 = " *** ";
                break;
            case 80:
                line0 = "**** ";
                line1 = "*   *";
                line2 = "**** ";
                line3 = "*    ";
                line4 = "*    ";
                break;
            case 81:
                line0 = " *** ";
                line1 = "*   *";
                line2 = "*   *";
                line3 = "*  * ";
                line4 = " ** *";
                break;
            case 82:
                line0 = "**** ";
                line1 = "*   *";
                line2 = "**** ";
                line3 = "*  * ";
                line4 = "*   *";
                break;
            case 83:
                line0 = " *** ";
                line1 = "*    ";
                line2 = " *** ";
                line3 = "    *";
                line4 = " *** ";
                break;
            case 84:
                line0 = "*****";
                line1 = "  *  ";
                line2 = "  *  ";
                line3 = "  *  ";
                line4 = "  *  ";
                break;
            case 85:
                line0 = "*   *";
                line1 = "*   *";
                line2 = "*   *";
                line3 = "*   *";
                line4 = " *** ";
                break;
            case 86:
                line0 = "*   *";
                line1 = "*   *";
                line2 = "*   *";
                line3 = " * * ";
                line4 = "  *  ";
                break;
            case 87:
                line0 = "*   *";
                line1 = "*   *";
                line2 = "* * *";
                line3 = "* * *";
                line4 = " * * ";
                break;
            case 88:
                line0 = "*   *";
                line1 = " * * ";
                line2 = "  *  ";
                line3 = " * * ";
                line4 = "*   *";
                break;
            case 89:
                line0 = "*   *";
                line1 = " * * ";
                line2 = "  *  ";
                line3 = "  *  ";
                line4 = "  *  ";
                break;
            case 90:
                line0 = "*****";
                line1 = "   * ";
                line2 = "  *  ";
                line3 = " *   ";
                line4 = "*****";
                break;
            default:
                line0 = "*****";
                line1 = "*****";
                line2 = "*****";
                line3 = "*****";
                line4 = "*****";
                break;
        }
    }
}
