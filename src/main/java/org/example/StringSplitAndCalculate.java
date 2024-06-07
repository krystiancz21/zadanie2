package org.example;

public class StringSplitAndCalculate {
    public static double splitAndCalculate(String input) throws Exception {
        if (!input.isEmpty()) {
            char operation = input.charAt(input.length() - 1); // Pobranie elementu na ostatnim miejscu

            // Sprawdzenie, czy ostatni elemenet to operator
            if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {
                input = input.substring(0, input.length() - 1); // Usunięcie ostatniego elementu z ciągu,
            } else {
                operation = '+'; // Jeśli nie podano operatora, to domyślnie ustawiamy dodoawnie
            }

            // Rozdzielenie poszczególnych elementów
            String[] items = input.split("[.,;]");

            // Zmienna przechowywującaa wynik, na początku przypisujemy pierwszy element
            double result = Double.parseDouble(items[0]);

            // Wykananie odpowiedniego działania na poszczególnych elementach
            for (int i = 1; i < items.length; i++) {
                double item = Double.parseDouble(items[i]);
                switch (operation) {
                    case '+':
                        result += item;
                        break;
                    case '-':
                        result -= item;
                        break;
                    case '*':
                        result *= item;
                        break;
                    case '/':
                        if (item == 0) throw new ArithmeticException("Nie wolno dzielić przez zero!");
                        result /= item;
                        break;
                }
            }

            return result;
        } else {
            throw new Exception("Ciąg wejściowy jest pusty.");
        }
    }
}
