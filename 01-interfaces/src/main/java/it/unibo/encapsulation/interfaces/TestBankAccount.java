package it.unibo.encapsulation.interfaces;

public class TestBankAccount {

    private TestBankAccount() {
    }

    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
         */
        AccountHolder ar1 = new AccountHolder("Andrea", "Rossi", 1);
        /*
         * 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
         */
        AccountHolder ab2 = new AccountHolder("Alex", "Bianchi", 2);
        /*
         * 3) Dichiarare due variabili di tipo BankAccount ed inizializzarle,
         * rispettivamente, con oggetti di tipo SimpleBankAccount per il conto di
         * Rossi (ammontare iniziale = 0), e di tipo StrictBankAccount per il conto di
         * Bianchi (ammontare iniziale = 0)
         */
        BankAccount acc1 = new SimpleBankAccount(ar1.getUserID(), 0);
        BankAccount acc2 = new StrictBankAccount(ab2.getUserID(), 0);
        /*
         * 4) Prima riflessione: perché è stato possibile fare la new di due classi
         * diverse in variabili dello stesso tipo?
         */
        // perche SimpleBankAccount e StrictBankAccount sono dei sottotipi di BankAccount
        /*
         * 5) Depositare €10000 in entrambi i conti
         */
        acc1.deposit(1, 10000);
        acc2.deposit(2, 10000);
        /*
         * 6) Prelevare €15000$ da entrambi i conti
         */
        acc1.withdraw(1, 15000);
        acc2.withdraw(2, 15000);
        /*
         * 7) Stampare in stdout l'ammontare corrente
        */
        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());
        /*
         * 8) Qual è il risultato e perché?
         */
        /* 
         * conto creato con SimpleBankAccount = -5000
         * conto creat con StrictBankAccount = 10000
         * Nel primo caso il conto poteva andare in negativo. nel secondo caso 
         * c'e' una condizione che non permette il prelievo se non ci sono abbastanza soldi
         */
         
        /*
         * 9) Depositare nuovamente €10000 in entrambi i conti
         */
        acc1.deposit(1, 10000);
        acc2.deposit(2, 10000);
        /*
         * 10) Invocare il metodo computeManagementFees su entrambi i conti
         */
        acc1.chargeManagementFees(1);
        acc2.chargeManagementFees(2);
        /*
         * 11) Stampare a video l'ammontare corrente
         */
        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());
        /*
         * 12) Qual è il risultato e perché?
         * Perche nel primo caso il metodo non e implementato, invece nel secondo si 
         * percio verra applicata la tassa di gestione ottenendo un valore inferiore
         */
    }
}
