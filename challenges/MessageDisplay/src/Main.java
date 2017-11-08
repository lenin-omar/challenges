public class Main {

    public static void main(String[] args) {
        //TODO: Get text from user
        convertMessageToStars("Hello world");
    }

    private static void convertMessageToStars(String message) {
        if (!message.isEmpty()) {
            String newMessage = message.toUpperCase();
            StringBuilder line0 = new StringBuilder("");
            StringBuilder line1 = new StringBuilder("");
            StringBuilder line2 = new StringBuilder("");
            StringBuilder line3 = new StringBuilder("");
            StringBuilder line4 = new StringBuilder("");
            for (int i = 0; i < newMessage.length(); i++) {
                //Get 5X5 matrix for each character
                StarChar starChar = new StarChar();
                starChar.getMatrix((int)newMessage.charAt(i));

                //Add lines from matrix
                line0.append(starChar.line0).append(" ");
                line1.append(starChar.line1).append(" ");
                line2.append(starChar.line2).append(" ");
                line3.append(starChar.line3).append(" ");
                line4.append(starChar.line4).append(" ");
            }
            //Print message
            System.out.println(line0);
            System.out.println(line1);
            System.out.println(line2);
            System.out.println(line3);
            System.out.println(line4);
        } else {
            System.out.println("Not displayable message");
        }
    }

}
