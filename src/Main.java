public class Main {

    public static void main(String[] args) {
        // Расчёт бонусов за каждые полные 100 рублей пополнения счёта более чем на 1000 рублей

        int currentBalance = 230; // текущий баланс счёта в рублях
        int depositAmount = 1500; // сумма пополнения в рублях

        int bonusAmount = (depositAmount > 1000) ? (depositAmount / 100) : (0);  // количество бонусных рублей
        int finalBalance = currentBalance + depositAmount + bonusAmount; // итоговый баланс с учетом суммы пополнения и начисленных бонусов

        System.out.println("Начислено бонусов: " + bonusAmount + "р.");
        System.out.println("Баланс счёта: " + finalBalance + "р.");
    }
}
