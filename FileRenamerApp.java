import java.awt.*;
import java.io.File;
import javax.swing.*;

public class FileRenamerApp extends JFrame {

    private File selectedFolder;
    private JLabel statusLabel;

    public FileRenamerApp() {
        setTitle("File Renamer");
        setSize(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton chooseButton = new JButton("Choose Folder");
        JButton renameButton = new JButton("Rename Files");
        statusLabel = new JLabel("No folder selected");

        chooseButton.addActionListener(e -> chooseFolder());
        renameButton.addActionListener(e -> rename());

        setLayout(new GridLayout(3, 1));
        add(chooseButton);
        add(renameButton);
        add(statusLabel);
    }

    private void chooseFolder() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int result = chooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFolder = chooser.getSelectedFile();
            statusLabel.setText("Selected: " + selectedFolder.getAbsolutePath());
        }
    }

    private void rename() {
        if (selectedFolder == null) {
            JOptionPane.showMessageDialog(this, "Please choose a folder first.");
            return;
        }

        renameRecursively(selectedFolder);
        JOptionPane.showMessageDialog(this, "Renaming complete!");
    }

    private void renameRecursively(File dir) {
        File[] files = dir.listFiles();
        if (files == null) return;

        for (File file : files) {
            if (file.isDirectory()) {
                renameRecursively(file);
            }

            String name = file.getName();
            if (name.contains(" ")) {
                File newFile = new File(file.getParent(), name.replace(" ", "_"));
                file.renameTo(newFile);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FileRenamerApp().setVisible(true);
        });
    }
}
