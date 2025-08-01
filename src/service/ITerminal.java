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
     * To write message for the user and await a dalay after message.
     * to continue app execution.
     * @param message
     * @param dalay
     */
    void showMessage(String message, int dalay);

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
