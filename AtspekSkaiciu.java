import javax.swing.JOptionPane;

public class AtspekSkaiciu {
    public static void main(String[] args) {
        boolean zaistiDar = true;
        while (zaistiDar) {
            int sugalvotasSkaicius = (int) (Math.random() * 100) + 1; // Sugeneruojame skaičių nuo 1 iki 100
            int spejimas = 0;
            while (spejimas != sugalvotasSkaicius) {
                String input = JOptionPane.showInputDialog(null, "Įveskite spėjamą skaičių nuo 1 iki 100:", "Atspėk skaičių", JOptionPane.QUESTION_MESSAGE);
                spejimas = Integer.parseInt(input);

                if (spejimas < sugalvotasSkaicius) {
                    JOptionPane.showMessageDialog(null, "Per mažai! Bandykite dar kartą.", "Neteisinga!", JOptionPane.INFORMATION_MESSAGE);
                } else if (spejimas > sugalvotasSkaicius) {
                    JOptionPane.showMessageDialog(null, "Per daug! Bandykite dar kartą.", "Neteisinga!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Sveikiname! Jūs atspėjote skaičių!", "Teisinga!", JOptionPane.INFORMATION_MESSAGE);
                }
            }

            int response = JOptionPane.showConfirmDialog(null, "Ar norite žaisti dar kartą?", "Žaidimo pabaiga", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response != JOptionPane.YES_OPTION) {
                zaistiDar = false;
            }
        }
    }
}