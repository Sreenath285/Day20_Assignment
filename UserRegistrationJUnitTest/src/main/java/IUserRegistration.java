/***
 * created functional interface
 */
@FunctionalInterface
interface IUserRegistration {
    boolean userRegistration() throws InvalidDetailsException;
}
