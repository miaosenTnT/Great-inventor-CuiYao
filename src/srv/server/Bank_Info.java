/*
 * Copyright: kimoyami
 */

package srv.server;

import dao.DataBank;
import srv.bank.BankInfo;

public class Bank_Info {
    public static void run(int op) {
        try {
            if (op == 1) {
                ServerThread.cout.writeInt(insert());
                ServerThread.cout.flush();
            }
            if (op == 2) {
                ServerThread.cout.writeInt(delete());
                ServerThread.cout.flush();
            }
            if (op == 3) {
               ServerThread.cout.writeObject(query());
               ServerThread.cout.flush();
            }
            if (op == 4) {
                ServerThread.cout.writeInt(update());
                ServerThread.cout.flush();
            }
        } catch (Exception e) {
            return;
        }
    }

    public static synchronized int insert() {
        BankInfo account;
        try {
            account = (BankInfo) ServerThread.cin.readObject();
        } catch (Exception e) {
            return -3;
        }
        return DataBank.insert(account);
    }

    public static synchronized int delete() {
        BankInfo account;
        try {
            account = (BankInfo) ServerThread.cin.readObject();
        } catch (Exception e) {
            return -1;
        }
        return DataBank.delete(account);
    }

    public static BankInfo query() {
        String ID = "";
        try {
            ID = ServerThread.cin.readUTF();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return DataBank.query(ID);
    }

    public static int update() {
        BankInfo account;
        double change;
        int tag;
        try {
            account=(BankInfo) ServerThread.cin.readObject();
            change=ServerThread.cin.readDouble();
            tag=ServerThread.cin.readInt();
        } catch (Exception e) {
            return -3;
        }
        return DataBank.update(account,change,tag);
    }
}
