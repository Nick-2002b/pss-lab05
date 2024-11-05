package it.unibo.encapsulation.interfaces;

public class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
        /*
         * Prevents object creation from the outside.
         */
    }

    public static void main(final String[] args) {
        // 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
        AccountHolder ar1 = new AccountHolder("Andrea", "Rossi", 1);
        // 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
        AccountHolder ab2 = new AccountHolder("Andrea", "Rossi", 2);
        // 3) Creare i due SimpleBankAccount corrispondenti
        SimpleBankAccount acc1 = new SimpleBankAccount(ar1.getUserID(), 0);
        SimpleBankAccount acc2 = new SimpleBankAccount(ab2.getUserID(), 0);
        // 4) Effettuare una serie di depositi e prelievi
        acc1.deposit(1, 500);
        acc2.deposit(2, 200);
        acc1.depositFromATM(1, 50);
        acc1.withdrawFromATM(1, 50);
        
        acc1.withdraw(1, 450);
        acc2.withdraw(2, 250);
        acc2.withdraw(2, 20);
        /*
         * 5) Stampare a video l'ammontare dei due conti e verificare la
         * correttezza del risultato
         */
        System.out.println(acc1.getBalance()); // balance -> 49
        System.out.println(acc2.getBalance()); // balance -> -70
        // 6) Provare a prelevare fornendo un id utente sbagliato
        acc1.withdraw(3, 30);
        // 7) Controllare nuovamente l'ammontare
        System.out.println(acc1.getBalance());
    }
}
