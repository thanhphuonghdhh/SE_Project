import java.util.ArrayList;

public class AccList {
    public ArrayList<Account> accounts = new ArrayList<>();
    public void push(Account account) {
        accounts.add(account);
    }

    public int searchID(int ID) {
        int nho = 0;
        for (int i = 0; i < accounts.size(); i++)
            if (accounts.get(i).getID() == ID) nho = i;
        return accounts.get(nho).getPassword();
    }

    public Account searchName(String name) {
        int nho = 0;
        for (int i = 0; i < accounts.size(); i++)
            if (accounts.get(i).getName() == name) nho = i;
                return accounts.get(nho);
    }

    public void delete(String name) {
        int nho = 0;
        for (int i = 0; i < accounts.size(); i++)
            if (accounts.get(i).getName() == name) nho = i;
        accounts.remove(nho);
    }
}
