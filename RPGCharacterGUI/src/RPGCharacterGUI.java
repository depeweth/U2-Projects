import javax.swing.*;

public class RPGCharacterGUI {

    public RPGCharacterGUI() {
        JFrame window = new JFrame("RPGCharacter");
        JPanel panel = new JPanel();
        window.setSize(170, 450);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.add(panel);

        JLabel title = new JLabel("pick a number");
        JLabel title2 = new JLabel(" between 1-10");
        JLabel space = new JLabel("  ");
        JLabel name = new JLabel("name: ");
        JLabel strength = new JLabel("strength: ");
        JLabel dexterity = new JLabel("dexterity: ");
        JLabel charisma = new JLabel("charisma: ");
        JLabel intelligence = new JLabel("intelligence: ");
        JLabel constitution = new JLabel("constitution: ");
        JLabel wisdom = new JLabel("wisdom: ");
        JTextField nametext = new JTextField(10);
        JTextField strengthtext = new JTextField(10);
        JTextField dexteritytext = new JTextField(10);
        JTextField charismatext = new JTextField(10);
        JTextField intelligencetext = new JTextField(10);
        JTextField constitutiontext = new JTextField(10);
        JTextField wisdomtext = new JTextField(10);

        panel.add(name);
        panel.add(nametext);
        panel.add(title);
        panel.add(title2);
        panel.add(space);
        panel.add(strength);
        panel.add(strengthtext);
        panel.add(dexterity);
        panel.add(dexteritytext);
        panel.add(charisma);
        panel.add(charismatext);
        panel.add(intelligence);
        panel.add(intelligencetext);
        panel.add(constitution);
        panel.add(constitutiontext);
        panel.add(wisdom);
        panel.add(wisdomtext);


        window.setVisible(true);


    }
}
