import java.lang.reflect.Field;

final class AccountUtils {

    private AccountUtils() { }

    public static void increaseBalance(Account account, long amount) {
        // write your code here
        try {
            Field f = Account.class.getDeclaredField("balance");
            f.setAccessible(true);
            f.set(account, (Long) f.get(account) + (Long) amount);
        } catch (IllegalAccessException | NoSuchFieldException exc) { }
    }
}