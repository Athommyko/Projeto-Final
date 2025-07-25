package service;
/**
 * Interface to IO user-provide data.
 */
public interface ITerminal {
    
    /**
     * To write message for by user.
     * @param message
     */
    void showMessage(String message);

    /**
     * To read input message by user.
     * @return
     */

    String readLine();

    /**
     * To read input number by user.
     * @return
     */

    int readLineAsInt();

    /**
     * To read input double number by user.
     * @return
     */

    double readLineAsDouble();
}
